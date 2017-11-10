/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedostonkasittelypakkaus;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author s1601378
 */
public class Tiedostonkasittelija {

    public ArrayList<String> lueLuukkujenSisalto() {
        
        ArrayList<String> rivit = new ArrayList<>();
        
        try {
            Files.lines(Paths.get("luukkujenSisalto.txt")).forEach(rivi -> rivit.add(rivi));
        } catch (Exception e) {
            System.out.println("Lukeminen epäonnistui. Virhe: " + e.getMessage());
        }
        
        return rivit;
    }
    
}
