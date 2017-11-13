/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import tiedostonkasittelypakkaus.Luukkujenkasittelija;

/**
 *
 * @author s1601378
 */
public class VillienDatanomienJoulukalenteriController implements Initializable {

    Luukkujenkasittelija luukkujenKasittelija = new Luukkujenkasittelija();

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

    private Map<Button, String> buttonit = new HashMap<>();

    //Luukkujen avaus metodit alkaa
    @FXML
    private void avaaLuukku1(ActionEvent event) {

        if (luukkujenKasittelija.tarkistaOnkoLuukkuAvattu("1.12.2017")) {
            //avataan luukun sisältö
            System.out.println("Avasit luukun numero 1.");
        } else {
            //Kirjoitetaan avatutLuukut.txt tiedostoon ja avataan luukun sissältö.
            luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("1.12.2017");
            System.out.println("Avataan...");
            luukku1.setId("avattu");
        }
    }

    @FXML
    private void avaaLuukku2(ActionEvent event) {
        System.out.println("Avasit luukun numero 2.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("2.12.2017");
    }

    @FXML
    private void avaaLuukku3(ActionEvent event) {
        System.out.println("Avasit luukun numero 3.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("3.12.2017");
    }

    @FXML
    private void avaaLuukku4(ActionEvent event) {
        System.out.println("Avasit luukun numero 4.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("4.12.2017");
    }

    @FXML
    private void avaaLuukku5(ActionEvent event) {
        System.out.println("Avasit luukun numero 5.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("5.12.2017");
    }

    @FXML
    private void avaaLuukku6(ActionEvent event) {
        System.out.println("Avasit luukun numero 6.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("6.12.2017");
    }

    @FXML
    private void avaaLuukku7(ActionEvent event) {
        System.out.println("Avasit luukun numero 7.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("7.12.2017");
    }

    @FXML
    private void avaaLuukku8(ActionEvent event) {
        System.out.println("Avasit luukun numero 8.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("8.12.2017");
    }

    @FXML
    private void avaaLuukku9(ActionEvent event) {
        System.out.println("Avasit luukun numero 9.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("9.12.2017");
    }

    @FXML
    private void avaaLuukku10(ActionEvent event) {
        System.out.println("Avasit luukun numero 10.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("10.12.2017");
    }

    @FXML
    private void avaaLuukku11(ActionEvent event) {
        System.out.println("Avasit luukun numero 11.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("11.12.2017");
    }

    @FXML
    private void avaaLuukku12(ActionEvent event) {
        System.out.println("Avasit luukun numero 12.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("12.12.2017");
    }

    @FXML
    private void avaaLuukku13(ActionEvent event) {
        System.out.println("Avasit luukun numero 13.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("13.12.2017");
    }

    @FXML
    private void avaaLuukku14(ActionEvent event) {
        System.out.println("Avasit luukun numero 14.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("14.12.2017");
    }

    @FXML
    private void avaaLuukku15(ActionEvent event) {
        System.out.println("Avasit luukun numero 15.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("15.12.2017");
    }

    @FXML
    private void avaaLuukku16(ActionEvent event) {
        System.out.println("Avasit luukun numero 16.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("16.12.2017");
    }

    @FXML
    private void avaaLuukku17(ActionEvent event) {
        System.out.println("Avasit luukun numero 17.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("17.12.2017");
    }

    @FXML
    private void avaaLuukku18(ActionEvent event) {
        System.out.println("Avasit luukun numero 18.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("18.12.2017");
    }

    @FXML
    private void avaaLuukku19(ActionEvent event) {
        System.out.println("Avasit luukun numero 19.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("19.12.2017");
    }

    @FXML
    private void avaaLuukku20(ActionEvent event) {
        System.out.println("Avasit luukun numero 20.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("20.12.2017");
    }

    @FXML
    private void avaaLuukku21(ActionEvent event) {
        System.out.println("Avasit luukun numero 21.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("21.12.2017");
    }

    @FXML
    private void avaaLuukku22(ActionEvent event) {
        System.out.println("Avasit luukun numero 22.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("22.12.2017");
    }

    @FXML
    private void avaaLuukku23(ActionEvent event) {
        System.out.println("Avasit luukun numero 23.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("23.12.2017");
    }

    @FXML
    private void avaaLuukku24(ActionEvent event) {
        System.out.println("Avasit luukun numero 24.");
        luukkujenKasittelija.kirjoitaAvattuLuukkuTiedostoon("24.12.2017");
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

        //Päivämäärät tulee olla tässä muodossa
        String date = "24/12/2017";
        
        //Muunnetaan String dateksi, jotta voimme myöhemmin vertailla.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d = sdf.parse(date);
            System.out.println(d);
        } catch (ParseException ex) {
            
        }
    }
}
