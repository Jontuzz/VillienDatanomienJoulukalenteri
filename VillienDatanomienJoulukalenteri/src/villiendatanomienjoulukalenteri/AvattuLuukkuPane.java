/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import tiedostonkasittelypakkaus.Luukku;

/**
 * FXML Controller class
 *
 * @author s1601378
 */
public class AvattuLuukkuPane implements Initializable {

    private Luukku luukku;

    private AnchorPane anchorPane;

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

        palaa.setOnAction((ActionEvent event) -> {
            
        });

    }

    public void setLuukku(Luukku luukku) {
        this.luukku = luukku;
    }
}
