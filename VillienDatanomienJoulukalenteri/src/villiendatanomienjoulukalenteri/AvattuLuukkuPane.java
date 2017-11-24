/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import tiedostonkasittelypakkaus.Luukku;

/**
 * FXML Controller class
 *
 * @author s1601378
 */
public class AvattuLuukkuPane implements Initializable {

    private Luukku luukku;
    
    @FXML
    private TextArea luukkusisalto;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(luukku);
        luukkusisalto.setText(luukku.getSisalto());
    }    
    
    public void setLuukku(Luukku luukku) {
        this.luukku = luukku;
    }
}
