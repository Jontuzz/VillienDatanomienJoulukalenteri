/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedostonkasittelypakkaus;

import java.util.Map;

/**
 *
 * @author s1601378
 */
public class testaa {
    public static void main(String[] args) {
        LuukkujenKasittelija kasittelija = new LuukkujenKasittelija();
//        System.out.println(kasittelija.lueJsonListaan());
        kasittelija.kirjoitaLuukutJsonTiedostoon();
//        for (Map.Entry<String, Luukku> luukku : kasittelija.lueJsonListaan().entrySet()) {
//            System.out.println(luukku.getValue().toString());
//            System.out.println("nimi: " + luukku.getValue().getNimi());
//        }
    }
}
