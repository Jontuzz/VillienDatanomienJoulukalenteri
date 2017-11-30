/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paivamaara;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** Paivays-luokka. Muuntaa Date tyyppisen olion muotoon "1/12/2017" ja String tyyppisen päivän "1/12/2017" Date objektiksi.
 * @author s1601378
 * @version 1.0
 */


public class Paivays {
    
    /** Palauttaa String tyyppisen päivämäärän Date oliona.
     * <pre>Paivays paivays = new Paivays();
     * paivays.parseDate("1/12/2017");
     * </pre>
     * @param paiva String muotoinen päivämäärä. Esim <code>"1/12/2017"</code>
     * @return String muotoinen päivämäärä Date oliona. Esim <code>Fri Dec 01 00:00:00 EET 2017</code>
     */
    public Date parseDate(String paiva) {
        //Päivämäärät tulee olla tässä muodossa
        //String date = "24/12/2017";

        //Muunnetaan String dateksi, jotta voimme myöhemmin vertailla.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date luukunPaivays = sdf.parse(paiva);
            return luukunPaivays;
        } catch (ParseException ex) {
            ex.getMessage();
        }
        return null;
    }
    
    
    /** Palauttaa Date tyyppisen päivämäärän String muotoon.
     * <pre>Paivays paivays = new Paivays();
     * paivays.dateAsString(new Date());
     * </pre>
     * 
     * @param paiva Date muotoinen päivämäärä. Esim <code>Fri Dec 01 00:00:00 EET 2017</code>
     * @return Date olio String tyyppinä. Esim <code>"1/12/2017"</code>
     */
    public String dateAsString(Date paiva) {
        //Muunnetaan Date objekti String tyyppiseksi
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String luukunPaivays = sdf.format(paiva);
        
        return luukunPaivays;
    }
}
