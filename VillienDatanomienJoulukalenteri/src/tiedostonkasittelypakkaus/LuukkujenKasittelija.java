/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacksontest;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s1601378
 */
public class LuukkujenKasittelija {

    private LinkedHashMap<String, Luukku> luukulista;
    HandleJson json = new HandleJson();

    public LuukkujenKasittelija() {
        luukulista = new LinkedHashMap<>();
    }

    public boolean kirjoitaLuukutJsonTiedostoon() {

        try {
            for (int luukkuNro = 1; luukkuNro <= 24; luukkuNro++) {
                luukulista.put("luukku" + luukkuNro, new Luukku("luukku" + luukkuNro, luukkuNro, false, json.parseDate("1/12/2017"), "Luukku" + luukkuNro));
            }

            ObjectMapper mapper = new ObjectMapper();

            ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

            writer.writeValue(new File("luukkutestiii.json"), luukulista);
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

        LinkedHashMap<String, Luukku> result;
        try {
            luukulista = mapper.readValue(new FileInputStream("luukkutesti.json"), LinkedHashMap.class);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return luukulista;
    }
}