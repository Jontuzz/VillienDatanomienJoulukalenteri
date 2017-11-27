package tiedostonkasittelypakkaus;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import paivamaara.Paivays;

/**
 *
 * @author s1601378
 */
public class LuukkujenKasittelija {

    //tänne luetaan kaikki luukut .json tiedostosta
    private LinkedHashMap<String, Luukku> luukkuLista;
    //paivayksenHallinnan avulla muutetaan String tyyppinen päiväys Date objektiksi
    Paivays paivayksenHallinta = new Paivays();

    private final File userDesktop = new File(System.getProperty("user.home"), "/Desktop");;
    
    public LuukkujenKasittelija() {
        luukkuLista = new LinkedHashMap<>();
    }

    public boolean kirjoitaLuukutJsonTiedostoon() {
        /*Jos tiedostoa ei löydy tai tiedostoa on muokattu siten, että sen lukeminen aiheuttaa virheen
            voidaan ajaa tämä metodi, joka alustaa luukut uudestaan
         */

        luukkuLista.put("luukku1", new Luukku("luukku1", 1, false, paivayksenHallinta.parseDate("1/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku1_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku2", new Luukku("luukku2", 2, false, paivayksenHallinta.parseDate("2/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku2_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku3", new Luukku("luukku3", 3, false, paivayksenHallinta.parseDate("3/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku3_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku4", new Luukku("luukku4", 4, false, paivayksenHallinta.parseDate("4/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku4_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku5", new Luukku("luukku5", 5, false, paivayksenHallinta.parseDate("5/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku5_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku6", new Luukku("luukku6", 6, false, paivayksenHallinta.parseDate("6/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku6_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku7", new Luukku("luukku7", 7, false, paivayksenHallinta.parseDate("7/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku7_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku8", new Luukku("luukku8", 8, false, paivayksenHallinta.parseDate("8/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku8_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku9", new Luukku("luukku9", 9, false, paivayksenHallinta.parseDate("9/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku9_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku10", new Luukku("luukku10", 10, false, paivayksenHallinta.parseDate("10/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku10_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku11", new Luukku("luukku11", 11, false, paivayksenHallinta.parseDate("11/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku11_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku12", new Luukku("luukku12", 12, false, paivayksenHallinta.parseDate("12/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku12_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku13", new Luukku("luukku13", 13, false, paivayksenHallinta.parseDate("13/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku13_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku14", new Luukku("luukku14", 14, false, paivayksenHallinta.parseDate("14/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku14_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku15", new Luukku("luukku15", 15, false, paivayksenHallinta.parseDate("15/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku15_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku16", new Luukku("luukku16", 16, false, paivayksenHallinta.parseDate("16/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku16_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku17", new Luukku("luukku17", 17, false, paivayksenHallinta.parseDate("17/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku17_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku18", new Luukku("luukku18", 18, false, paivayksenHallinta.parseDate("18/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku18_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku19", new Luukku("luukku19", 19, false, paivayksenHallinta.parseDate("19/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku19_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku20", new Luukku("luukku20", 20, false, paivayksenHallinta.parseDate("20/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku20_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku21", new Luukku("luukku21", 21, false, paivayksenHallinta.parseDate("21/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku21_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku22", new Luukku("luukku22", 22, false, paivayksenHallinta.parseDate("22/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku22_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku23", new Luukku("luukku23", 23, false, paivayksenHallinta.parseDate("23/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku23_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));
        luukkuLista.put("luukku24", new Luukku("luukku24", 24, false, paivayksenHallinta.parseDate("24/11/2017"), "Hyvää joulua ja onnellista uutta vuotta!", "images/luukku24_kuva.jpg", "/musicfiles/WhamLastChristmas.mp3"));

        try {

            ObjectMapper mapper = new ObjectMapper();

            //DefaultPrettyPrinter määrittää, että Java oliot eivät tule yhteen pötköön json tiedostoon
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

            
            
            //kirjoitetaan lista .json tiedostoon
            writer.writeValue(new File(userDesktop, "MarraskuuTesti.json"), luukkuLista);
            return true;

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public LinkedHashMap<String, Luukku> lueJsonListaan() {
        ObjectMapper mapper = new ObjectMapper();

        LinkedHashMap<String, Luukku> result = null;
        //Kokeillaan lukea json tiedostossa olevat luukut LinkedHashMappiin
        try {
            result = mapper.readValue(new File(userDesktop, "MarraskuuTesti.json"), new TypeReference<Map<String, Luukku>>() {
            });
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //lukemisen onnistuessa palautetaan metodin kutsujalle json tiedostosta luetut luukut LinkedHashMapissä. Muuten tulostetaan error.
        return result;
    }

    private boolean voikoLuukunAvata(String luukunNimi) {

        //metodi päivämäärän tarkistukseen.
        Date luukunPaiva = lueJsonListaan().get(luukunNimi).getLuukunPaivays();
        Date tamaPaiva = new Date();

        if (luukunPaiva.equals(tamaPaiva) || luukunPaiva.before(tamaPaiva)) {
            return true;
        }
        return false;
    }

    public boolean avaaLuukku(String luukunNimi) {
        //metodi, joka joka muuttaa luukun tietoja .json tiedostossa, kun se avataan ensimmäistä kertaa
        luukkuLista = lueJsonListaan();

        System.out.println("LuukkuLista: " + luukkuLista);

        if (voikoLuukunAvata(luukunNimi)) {
            //jos luukun voi avata lisätään listaan sama luukku, mutta vaihdetaan sen boolean muuttuja avattu trueksi 
            luukkuLista.put("luukku" + luukkuLista.get(luukunNimi).getNumero(), new Luukku("luukku" + luukkuLista.get(luukunNimi).getNumero(), luukkuLista.get(luukunNimi).getNumero(), true, paivayksenHallinta.parseDate(luukkuLista.get(luukunNimi).getNumero() + "/11/2017"), luukkuLista.get(luukunNimi).getSisalto(), luukkuLista.get(luukunNimi).getKuva(), luukkuLista.get(luukunNimi).getMusiikkiTiedostoPolku()));
            System.out.println("uusi lista " + luukkuLista);

            try {

                ObjectMapper mapper = new ObjectMapper();

                //DefaultPrettyPrinter määrittää, että Java oliot eivät tule yhteen pötköön json tiedostoon
                ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

                //kirjoitetaan uusi lista uudestaan tiedostoon
                writer.writeValue(new File(userDesktop, "MarraskuuTesti.json"), luukkuLista);
                System.out.println("Tehty: " + luukkuLista);
                return true;

            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return true;
        } else {
            return false;
        }
    }
}
