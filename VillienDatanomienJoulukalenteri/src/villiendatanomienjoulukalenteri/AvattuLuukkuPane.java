/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
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
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(luukku);
        luukkusisalto.setText(luukku.getSisalto());
        luukunNumero.setText("Luukku " + Integer.toString(luukku.getNumero()));

        pvm.setText(paivayksenHallinta.dateAsString(tamaPaiva));

    }

    public void setLuukku(Luukku luukku) {
        this.luukku = luukku;
    }
}
