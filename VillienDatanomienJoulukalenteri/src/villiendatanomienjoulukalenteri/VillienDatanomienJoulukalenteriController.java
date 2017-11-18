/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import tiedostonkasittelypakkaus.LuukkujenKasittelija;

/**
 *
 * @author s1601378
 */
public class VillienDatanomienJoulukalenteriController implements Initializable {

    private LuukkujenKasittelija kasittelija = new LuukkujenKasittelija();

    @FXML
    private Button luukku1;

    @FXML
    private Button luukku2;

    @FXML
    private Button luukku3;

    @FXML
    private Button luukku4;

    @FXML
    private Button luukku5;

    @FXML
    private Button luukku6;

    @FXML
    private Button luukku7;

    @FXML
    private Button luukku8;

    @FXML
    private Button luukku9;

    @FXML
    private Button luukku10;

    @FXML
    private Button luukku11;

    @FXML
    private Button luukku12;

    @FXML
    private Button luukku13;

    @FXML
    private Button luukku14;

    @FXML
    private Button luukku15;

    @FXML
    private Button luukku16;

    @FXML
    private Button luukku17;

    @FXML
    private Button luukku18;

    @FXML
    private Button luukku19;

    @FXML
    private Button luukku20;

    @FXML
    private Button luukku21;

    @FXML
    private Button luukku22;

    @FXML
    private Button luukku23;

    @FXML
    private Button luukku24;

    private Map<Button, Date> buttonit = new HashMap<>();

    //Luukkujen avaus metodit alkaa
    @FXML
    private void avaaLuukku1(ActionEvent event) {
        System.out.println("Avasit luukun numero 1.");
    }

    @FXML
    private void avaaLuukku2(ActionEvent event) {
        System.out.println("Avasit luukun numero 2.");
    }

    @FXML
    private void avaaLuukku3(ActionEvent event) {
        System.out.println("Avasit luukun numero 3.");
    }

    @FXML
    private void avaaLuukku4(ActionEvent event) {
        System.out.println("Avasit luukun numero 4.");
    }

    @FXML
    private void avaaLuukku5(ActionEvent event) {
        System.out.println("Avasit luukun numero 5.");
    }

    @FXML
    private void avaaLuukku6(ActionEvent event) {
        System.out.println("Avasit luukun numero 6.");
    }

    @FXML
    private void avaaLuukku7(ActionEvent event) {
        System.out.println("Avasit luukun numero 7.");
    }

    @FXML
    private void avaaLuukku8(ActionEvent event) {
        System.out.println("Avasit luukun numero 8.");
    }

    @FXML
    private void avaaLuukku9(ActionEvent event) {
        System.out.println("Avasit luukun numero 9.");
    }

    @FXML
    private void avaaLuukku10(ActionEvent event) {
        System.out.println("Avasit luukun numero 10.");
    }

    @FXML
    private void avaaLuukku11(ActionEvent event) {
        System.out.println("Avasit luukun numero 11.");
    }

    @FXML
    private void avaaLuukku12(ActionEvent event) {
        System.out.println("Avasit luukun numero 12.");
    }

    @FXML
    private void avaaLuukku13(ActionEvent event) {
        System.out.println("Avasit luukun numero 13.");
    }

    @FXML
    private void avaaLuukku14(ActionEvent event) {
        System.out.println("Avasit luukun numero 14.");
    }

    @FXML
    private void avaaLuukku15(ActionEvent event) {
        System.out.println("Avasit luukun numero 15.");
    }

    @FXML
    private void avaaLuukku16(ActionEvent event) {
        System.out.println("Avasit luukun numero 16.");
    }

    @FXML
    private void avaaLuukku17(ActionEvent event) {
        System.out.println("Avasit luukun numero 17.");
    }

    @FXML
    private void avaaLuukku18(ActionEvent event) {
        System.out.println("Avasit luukun numero 18.");
    }

    @FXML
    private void avaaLuukku19(ActionEvent event) {
        System.out.println("Avasit luukun numero 19.");
    }

    @FXML
    private void avaaLuukku20(ActionEvent event) {
        System.out.println("Avasit luukun numero 20.");
    }

    @FXML
    private void avaaLuukku21(ActionEvent event) {
        System.out.println("Avasit luukun numero 21.");
    }

    @FXML
    private void avaaLuukku22(ActionEvent event) {
        System.out.println("Avasit luukun numero 22.");
    }

    @FXML
    private void avaaLuukku23(ActionEvent event) {
        System.out.println("Avasit luukun numero 23.");
    }

    @FXML
    private void avaaLuukku24(ActionEvent event) {
        System.out.println("Avasit luukun numero 24.");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Tarkista täällä mitkä luukut on avattu ja mitkä ei

        luukku1.setId("ei-avattu");

        luukku14.setId("ei-voida-avata");

        luukku3.setId("avattu");

        luukku18.setId("avattu");

        luukku21.setId("ei-avattu");
        File JouluKalenteriLuukutJson = new File("JouluKalenteriLuukut.json");
        if (JouluKalenteriLuukutJson.exists()) {
            System.out.println("Luukut on jo json tiedostossa!");
        } else {
            System.out.println(kasittelija.kirjoitaLuukutJsonTiedostoon());
        }
    }
}
