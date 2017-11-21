/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villiendatanomienjoulukalenteri;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

    private LuukkujenKasittelija kasittelija = new LuukkujenKasittelija();
    private ArrayList<Button> buttonit = new ArrayList<>();
    private Date nykyinenPaiva = new Date();

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

        luukku1.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku1")) {
                System.out.println("Avataan...");
                luukku1.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku2.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku2")) {
                System.out.println("Avataan...");
                luukku2.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku3.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku3")) {
                System.out.println("Avataan...");
                luukku3.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku4.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku4")) {
                System.out.println("Avataan...");
                luukku4.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku5.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku5")) {
                System.out.println("Avataan...");
                luukku5.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku6.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku6")) {
                System.out.println("Avataan...");
                luukku6.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku7.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku7")) {
                System.out.println("Avataan...");
                luukku7.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku8.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku8")) {
                System.out.println("Avataan...");
                luukku8.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku9.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku9")) {
                System.out.println("Avataan...");
                luukku9.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku10.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku10")) {
                System.out.println("Avataan...");
                luukku10.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku11.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku11")) {
                System.out.println("Avataan...");
                luukku11.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku12.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku12")) {
                System.out.println("Avataan...");
                luukku12.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku13.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku13")) {
                System.out.println("Avataan...");
                luukku13.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku14.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku14")) {
                System.out.println("Avataan...");
                luukku14.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku15.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku15")) {
                System.out.println("Avataan...");
                luukku15.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku16.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku16")) {
                System.out.println("Avataan...");
                luukku16.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku17.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku17")) {
                System.out.println("Avataan...");
                luukku17.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku18.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku18")) {
                System.out.println("Avataan...");
                luukku18.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku19.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku19")) {
                System.out.println("Avataan...");
                luukku19.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku20.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku20")) {
                System.out.println("Avataan...");
                luukku20.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku21.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku21")) {
                System.out.println("Avataan...");
                luukku21.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku22.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku22")) {
                System.out.println("Avataan...");
                luukku22.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku23.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku23")) {
                System.out.println("Avataan...");
                luukku23.setId("avattu");
            } else {
                System.out.println("Ei voida avata");
            }
        });

        luukku24.setOnAction((ActionEvent event) -> {
            if (kasittelija.avaaLuukku("luukku24")) {
                System.out.println("Avataan...");
                luukku24.setId("avattu");
            } else {
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

        //tarkistetaan onko tiedostoa "JouluKalenteriLuukut.json" olemassa
        File JouluKalenteriLuukutJson = new File("JouluKalenteriLuukut.json");
        if (JouluKalenteriLuukutJson.exists()) {
            System.out.println("Luukut on jo json tiedostossa!");

            LinkedHashMap<String, Luukku> luukkuLista = kasittelija.lueJsonListaan();
            System.out.println(kasittelija.lueJsonListaan());

            //käydään nappien lista läpi
            for (Button button : buttonit) {

                Luukku luukku = luukkuLista.get(button.getId());
                //luukku on jo avattu
                if (button.getId().equals(luukku.getNimi()) && luukku.isAvattu()) {
                    button.setId("avattu");
                    //luukku ennen nykyistä päivää tai luukun päivä on sama kuin nykyinen päivä
                } else if (button.getId().equals(luukku.getNimi()) && luukku.getLuukunPaivays().before(nykyinenPaiva) || button.getId().equals(luukku.getNimi()) && luukku.getLuukunPaivays().equals(nykyinenPaiva)) {
                    button.setId("ei-avattu");
                } else {
                    //luukut joiden päivämäärä on  nykyisen päivämäärän jälkeen
                    button.setId("ei-voida-avata");
                }
            }
        }
    }
}
