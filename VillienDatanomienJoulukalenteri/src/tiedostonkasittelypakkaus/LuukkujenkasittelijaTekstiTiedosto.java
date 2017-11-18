/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedostonkasittelypakkaus;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author s1601378
 */
public class LuukkujenkasittelijaTekstiTiedosto {
    
    // Tiedostoon kirjoitettaessa pitää merkkijonon olla listassa
    public void kirjoitaAvattuLuukkuTiedostoon(String paivays) {
        lisaaTiedostoon(merkkijonoListana(paivays));
    }
    
    //Kirjoittaa listan sisältämät merkkijonot tiedostoon
    public void lisaaTiedostoon(ArrayList<String> rivit) {
        try {
            Files.write(Paths.get("avatutLuukut.txt"), rivit, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Lisääminen epäonnistui. Virhe: " + e.getMessage());
        }
    }
    
    // Lisää merkkijonon listaan
    public ArrayList<String> merkkijonoListana(String merkkijono) {
        ArrayList<String> avatutLuukut = new ArrayList<>();
        avatutLuukut.add(merkkijono);

        return avatutLuukut;
    }
    
    //Luetaan avatutLuukut.txt tiedoston rivit ja lisätään ne ArrayListaan. Palautetaan avatutLuukut ArrayList metodin kutsujalle.
    private ArrayList<String> lueAvatutLuukut() {
        ArrayList<String> avatutLuukut = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("avatutLuukut.txt")).forEach(luukku -> avatutLuukut.add(luukku));
        } catch (IOException e) {
            System.out.println("Avattujen luukkujen hakeminen epäonnistui. Virhe: " + e.getMessage());
        }
        
        return avatutLuukut;
    }

    public boolean tarkistaOnkoLuukkuAvattu(String paivays) {
        
        //Kutsutaan lueAvatutLuukut metodia ja katsotaan sisältääkö palautettu ArrayList parametrina annetun String tyyppisen päivämäärän
        return lueAvatutLuukut().contains(paivays);
    }
}
