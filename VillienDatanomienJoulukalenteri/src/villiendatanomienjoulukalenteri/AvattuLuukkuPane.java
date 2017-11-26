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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private Image kuva;
    
    @FXML
    private Label pvm;

    @FXML
    private TextArea luukkusisalto;

    @FXML
    private Label luukunNumero;

    @FXML
    private Button palaa;
    
    @FXML
    private ImageView imageView;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mediaPlayer = new MediaPlayer(musiikkiTiedosto);
        mediaPlayer.setAutoPlay(true);
        
        imageView.setImage(kuva);
        
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

    public void setMusiikkiTiedosto(String tiedostoPolku) {
        this.musiikkiTiedosto = new Media(tiedostoPolku);
    }
    
    public void setKuva(String osoite) {
        kuva = new Image(osoite);
    }
    
    public void setLuukku(Luukku luukku) {
        this.luukku = luukku;
    }
}
