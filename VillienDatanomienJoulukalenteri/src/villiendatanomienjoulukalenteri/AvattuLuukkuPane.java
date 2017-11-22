/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import tiedostonkasittelypakkaus.Luukku;

/**
 * FXML Controller class
 *
 * @author s1601378
 */
public class AvattuLuukkuPane implements Initializable {

    private Luukku luukku;
    
    private Label luukkusisalto;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void setLuukku(Luukku luukku) {
        this.luukku = luukku;
    }
}
