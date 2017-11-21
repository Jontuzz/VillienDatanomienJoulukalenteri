/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paivamaara;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author s1601378
 */
public class Paivays {
    
    public Date parseDate(String paiva) {
        //Päivämäärät tulee olla tässä muodossa
        //String date = "24/12/2017";

        //Muunnetaan String dateksi, jotta voimme myöhemmin vertailla.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date luukunPaivays = sdf.parse(paiva);
//            System.out.println(luukunPaivays);
            return luukunPaivays;
        } catch (ParseException ex) {
            ex.getMessage();
        }
        return null;
    }
}
