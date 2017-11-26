/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import tiedostonkasittelypakkaus.Luukku;
import tiedostonkasittelypakkaus.LuukkujenKasittelija;
import paivamaara.Paivays;

/**
 *
 * @author s1601378
 */
public class VillienDatanomienJoulukalenteriPane extends AnchorPane {

    public VillienDatanomienJoulukalenteriPane() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("VillienDatanomienJoulukalenteriPane.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    //luodaan olio luukkujen kirjoittamista json tiedostoon ja lukemista json tiedostosta varten
    private LuukkujenKasittelija kasittelija = new LuukkujenKasittelija();
    //ArrayList, johon kaikki buttonit tallennetaan, jotta kaikki ikkunassa olevat napit voidaan käydä läpi
    private ArrayList<Button> buttonit = new ArrayList<>();
    //asettaa kyseisen päivän päivämäärän nykyinenPaiva olioon
    private Date nykyinenPaiva = new Date();
    //Luodaan LinkedHashMap jossa avaimena on luukunNimi ja arvona luukku olio
    private LinkedHashMap<String, Luukku> luukkuLista = new LinkedHashMap<>();
    //Luodaan paivayksenHallinta olio, jotta Date objekti voidaan muuttaa muotoon "1/11/2017" ja String tyyppiseksi
    private Paivays paivayksenHallinta = new Paivays();

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private MenuItem close;

    @FXML
    private MenuItem alustaLuukut;

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

    //Luukkujen avaus metodit loppuu
    @FXML
    private void initialize() {

        close.setOnAction((ActionEvent event) -> {
            Platform.exit();
            System.exit(0);
        });

        alustaLuukut.setOnAction((ActionEvent event) -> {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Alusta luukut");
            alert.setHeaderText("Jos painat ok, luukut alustetaan alkuperäisiin asetuksiin ja ohjelma tulee käynnistää uudelleen!");
            alert.setContentText("Haluatko varmasti alustaa luukut?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                kasittelija.kirjoitaLuukutJsonTiedostoon();
                Platform.exit();
                System.exit(0);
            } else {
                // ... user chose CANCEL or closed the dialog
            }

        });

        luukku1.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku1";

            if (luukku1.getId().equals("avattu")) {
                //Jos luukun id on "avattu", kutsutaan metodia, joka avaa luukun uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku1.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku2.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku2";
            if (luukku2.getId().equals("avattu")) {
                //Jos luukun id on "avattu", kutsutaan metodia, joka avaa luukun uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku2.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku3.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku3";
            //Jos luukun id on "avattu", kutsutaan metodia, joka avaa luukun uudessa ikkunassa
            if (luukku3.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku3.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku4.setOnAction((ActionEvent event) -> {

            String luukkuNimi = "luukku4";
            if (luukku4.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku4.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku5.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku5";
            if (luukku5.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku5.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku6.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku6";
            if (luukku6.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku6.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku7.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku7";
            if (luukku7.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku7.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku8.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku8";
            if (luukku8.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku8.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku9.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku9";
            if (luukku9.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku9.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku10.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku10";
            if (luukku10.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku10.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku11.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku11";
            if (luukku11.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku11.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku12.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku12";
            if (luukku12.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku12.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku13.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku13";
            if (luukku13.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku13.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku14.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku14";
            if (luukku14.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku14.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku15.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku15";
            if (luukku15.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku15.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku16.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku16";
            if (luukku16.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku16.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku17.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku17";
            if (luukku17.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku17.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku18.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku18";
            if (luukku18.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku18.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku19.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku19";
            if (luukku19.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku19.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku20.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku20";
            if (luukku20.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku20.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku21.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku21";
            if (luukku21.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku21.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku22.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku22";
            if (luukku22.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku22.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku23.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku23";
            if (luukku23.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku23.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        luukku24.setOnAction((ActionEvent event) -> {
            String luukkuNimi = "luukku24";
            if (luukku24.getId().equals("avattu")) {
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
            } else if (kasittelija.avaaLuukku(luukkuNimi)) {
                //kirjoitetaan luukun muutokset .json tiedostoon ja avataan luukku uudessa ikkunassa
                avaaLuukkuWindow(luukkuLista.get(luukkuNimi));
                //vaihdetaan id:ksi "avattu" jotta css tiedosto vaihtaa sen värin
                luukku24.setId("avattu");
            } else {
                //Jos luukkua ei voi vielä avata
                System.out.println("Ei voida avata");
            }
        });

        //Tarkista täällä mitkä luukut on avattu ja mitkä ei
        //lisätään napit listaan, jotta voidaan muuttaa nappien outline css tiedoston ja napin id:n avulla
        buttonit.add(luukku1);
        buttonit.add(luukku2);
        buttonit.add(luukku3);
        buttonit.add(luukku4);
        buttonit.add(luukku5);
        buttonit.add(luukku6);
        buttonit.add(luukku7);
        buttonit.add(luukku8);
        buttonit.add(luukku9);
        buttonit.add(luukku10);
        buttonit.add(luukku11);
        buttonit.add(luukku12);
        buttonit.add(luukku13);
        buttonit.add(luukku14);
        buttonit.add(luukku15);
        buttonit.add(luukku16);
        buttonit.add(luukku17);
        buttonit.add(luukku18);
        buttonit.add(luukku19);
        buttonit.add(luukku20);
        buttonit.add(luukku21);
        buttonit.add(luukku22);
        buttonit.add(luukku23);
        buttonit.add(luukku24);

        //luetaan luukut .json tiedostosta listaan
        luukkuLista = kasittelija.lueJsonListaan();
        System.out.println(kasittelija.lueJsonListaan());

        //käydään nappien lista läpi
        for (Button button : buttonit) {

            Luukku luukku = luukkuLista.get(button.getId());

            if (button.getId().equals(luukku.getNimi()) && luukku.isAvattu()) {
                //Luukun päivämäärä ennen nykyistä päivää tai luukun päivä on sama kuin nykyinen päivä
                button.setId("avattu");
            } else if (button.getId().equals(luukku.getNimi()) && luukku.getLuukunPaivays().before(nykyinenPaiva) || button.getId().equals(luukku.getNimi()) && luukku.getLuukunPaivays().equals(nykyinenPaiva)) {
                //Luukun päivämäärä ennen nykyistä päivämäärää tai sama kuin nykyinen päivämäärä
                button.setId("ei-avattu");
            } else {
                //Luukun päivämäärä on nykyisen päivämäärän jälkeen
                button.setId("ei-voida-avata");
            }
        }
    }

    public boolean avaaLuukkuWindow(Luukku luukku) {

        //luukun avaaminen toimii vain yhteen suuntaan. Tällä hetkellä et pääse takaisin main windowiin
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/villiendatanomienjoulukalenteri/AvattuLuukkuPane.fxml"));

            AvattuLuukkuPane luukkuPane = new AvattuLuukkuPane();

            //Annetaan controllerille luukku olio, jotta uudessa ikkunassa voidaan näyttää luukun sisältöä
            luukkuPane.setLuukku(luukku);
            luukkuPane.setMusiikkiTiedosto(luukku.getMusiikkiTiedostoPolku());
            fxmlLoader.setController(luukkuPane);
            Parent root = fxmlLoader.load();

            Scene luukkuScene = new Scene(root);
            Stage luukkuStage = new Stage();

            //uuden ikkunan Title
            luukkuStage.setTitle("Luukku " + luukku.getNumero() + ". " + paivayksenHallinta.dateAsString(luukku.getLuukunPaivays()));
            luukkuStage.setScene(luukkuScene);
            //rajoitetaan, että kun uusi ikkuna on auki ei voida päästä käsiksi pää ikkunaan
            luukkuStage.initModality(Modality.APPLICATION_MODAL);

            Stage mainStage = (Stage) anchorPane.getScene().getWindow();//haetaan pääsy nykyiseen Stageen

            //piilotetaan mainStage
            mainStage.hide();
            //näytetään luukkuStage ja odotetaan, että se suljetaan
            luukkuStage.showAndWait();
            //näytetään mainStage
            mainStage.show();

            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
