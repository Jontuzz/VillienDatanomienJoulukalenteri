/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author s1601378
 */
public class VillienDatanomienJoulukalenteri extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        VillienDatanomienJoulukalenteriPane root = new VillienDatanomienJoulukalenteriPane();
        
        Scene scene = new Scene(root);
        stage.setTitle("Villien Datanomien Joulukalenteri");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
