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

    public LuukkujenKasittelija() {
        luukkuLista  = new LinkedHashMap<>();
    }

    public boolean kirjoitaLuukutJsonTiedostoon() {
        /*Jos tiedostoa ei löydy tai tiedostoa on muokattu siten, että sen lukeminen aiheuttaa virheen
            voidaan ajaa tämä metodi, joka alustaa luukut uudestaan
         */
                
        try {
            for (int luukkuNro = 1; luukkuNro <= 24; luukkuNro++) {
                //lisätään jokainen luukku LinkedHashMappiin
                luukkuLista.put("luukku" + luukkuNro, new Luukku("luukku" + luukkuNro, luukkuNro, false, paivayksenHallinta.parseDate(luukkuNro + "/11/2017"), "Hyvää Joulua!"));
            }

            ObjectMapper mapper = new ObjectMapper();

            //DefaultPrettyPrinter määrittää, että Java oliot eivät tule yhteen pötköön json tiedostoon
            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

            //kirjoitetaan lista .json tiedostoon
            writer.writeValue(new File("MarraskuuTesti.json"), luukkuLista);
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
            result = mapper.readValue(new File("MarraskuuTesti.json"), new TypeReference<Map<String, Luukku>>() {
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
            luukkuLista.put("luukku" + luukkuLista.get(luukunNimi).getNumero(), new Luukku("luukku" + luukkuLista.get(luukunNimi).getNumero(), luukkuLista.get(luukunNimi).getNumero(), true, paivayksenHallinta.parseDate(luukkuLista.get(luukunNimi).getNumero() + "/11/2017"), luukkuLista.get(luukunNimi).getSisalto()));
            System.out.println("uusi lista " + luukkuLista);

            try {

                ObjectMapper mapper = new ObjectMapper();

                //DefaultPrettyPrinter määrittää, että Java oliot eivät tule yhteen pötköön json tiedostoon
                ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
                
                //kirjoitetaan uusi lista uudestaan tiedostoon
                writer.writeValue(new File("MarraskuuTesti.json"), luukkuLista);
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
