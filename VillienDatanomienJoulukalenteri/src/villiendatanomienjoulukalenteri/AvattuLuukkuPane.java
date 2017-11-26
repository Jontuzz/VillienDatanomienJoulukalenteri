/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import tiedostonkasittelypakkaus.Luukku;
import paivamaara.Paivays;

/**
 * FXML Controller class
 *
 * @author s1601378
 */
public class AvattuLuukkuPane implements Initializable {

    private Luukku luukku;
    private Date tamaPaiva = new Date();
    private AnchorPane anchorPane;

    private Paivays paivayksenHallinta = new Paivays();

    private MediaPlayer mediaPlayer;
    private Media musiikkiTiedosto;
    
    @FXML
    private Label pvm;

    @FXML
    private TextArea luukkusisalto;

    @FXML
    private Label luukunNumero;

    @FXML
    private Button palaa;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        musiikkiTiedosto = new Media("file:///C:/Users/s1601378/Downloads/MELANKOLIA.mp3");
        
        mediaPlayer = new MediaPlayer(musiikkiTiedosto);
        mediaPlayer.setAutoPlay(true);
        
        System.out.println(luukku);
        luukkusisalto.setText(luukku.getSisalto());
        luukunNumero.setText("Luukku " + Integer.toString(luukku.getNumero()));

        pvm.setText(paivayksenHallinta.dateAsString(tamaPaiva));

        palaa.setOnAction((ActionEvent event) -> {
            Stage luukkuStage = (Stage) palaa.getScene().getWindow();
            mediaPlayer.stop();
            luukkuStage.close();
        });

    }

    public void setLuukku(Luukku luukku) {
        this.luukku = luukku;
    }
}
