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
public class Luukkujenkasittelija {
    
    // Tiedostoon kirjoitettaessa pitää merkkijonon olla listassa
    public void kirjoitaAvattuLuukkuTiedostoon(String paivays) {
        lisaaTiedostoon(merkkijonoListana(paivays));
    }
    
    //Kirjoittaa listan merkkijonoon
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
        
        return lueAvatutLuukut().contains(paivays);
    }
    
    /*public ArrayList<String> lueLuukkujenSisallot() {
        ArrayList<String> rivit = new ArrayList<>();
        try {
            Files.lines(Paths.get("luukkujenSisallot.txt")).forEach(rivi -> rivit.add(rivi));
        } catch (IOException e) {
            System.out.println("Lukeminen epäonnistui. Virhe: " + e.getMessage());
        }

        return rivit;
    }*/
    
    
}
