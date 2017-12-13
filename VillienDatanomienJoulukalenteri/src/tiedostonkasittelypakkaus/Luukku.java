/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedostonkasittelypakkaus;

import java.util.Date;
/**
 *
 * @author s1601378
 * @version 1.0
 */
public class Luukku {
    
    private String nimi;
    private int numero;
    private boolean avattu;
    private Date luukunPaivays;
    private String sisalto;
    private String musiikkiTiedostoPolku;
    private String kuva;
  
    /** Luo uuden luukku olion. Esimerkiksi
     * <pre> Luukku luukku1 = new Luukku("Luukku1", 1, false, 1/12/2017, "Hyvää joulua!", "images/hyvaaJoulua.png", "musicfiles/tulkoonjoulu.mp3");</pre>
     * @param nimi Luukun nimi. Esim. <code>Luukku1</code>
     * @param numero Luukun numero. Esim. <code>1</code>
     * @param avattu Kertoo onko luukku jo avattu. Esim. <code>false</code>
     * @param luukunPaivays Luukun päivämäärä. Esim. <code>Fri Dec 01 00:00:00 EET 2017</code>
     * @param sisalto Luukun sisältämä teksti. Esim. <code>Hyvää joulua!</code>
     * @param kuva Osoite, missä luukussa näytettävä kuva sijaitsee. Esim. <code>images/hyvaaJoulua.png</code>
     * @param musiikkiTiedostoPolku Osoite, missä luukussa soitettava musiikkitiedosto sijaitsee. Esim. <code>musicfiles/tulkoonjoulu.mp3"</code>
     */
    public Luukku(String nimi, int numero, boolean avattu, Date luukunPaivays, String sisalto, String kuva, String musiikkiTiedostoPolku) {
        this.nimi = nimi;
        this.numero = numero;
        this.avattu = avattu;
        this.luukunPaivays = luukunPaivays;
        this.sisalto = sisalto;
        this.kuva = kuva;
        this.musiikkiTiedostoPolku = musiikkiTiedostoPolku;
    }

    /** Palauttaa luukun nimen.
     * <pre>String luukku1Nimi = luukku1.getNimi();</pre>
     * @return luukun nimi
     */
    public String getNimi() {
        return nimi;
    }

    /** Asettaa luukulle nimen.
     * <pre>luukku1.setNimi("luukku1");</pre>
     * @param nimi Luukun nimi.
     */
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    /** Palauttaa luukun numeron.
     * <pre>int luukku1Numero = luukku1.getNumero();</pre>
     * @return luukun numero
     */
    public int getNumero() {
        return numero;
    }

    /** Asettaa luukulle numeron.
     * <pre>luukku1.setNumero(1);</pre>
     * @param numero Luukun numero.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /** Palauttaa, onko luukku jo avattu.
     * <pre>boolean luukku1Avattu = luukku1.isAvattu();</pre>
     * @return avattu Onko luukku jo avattu.
     */
    public boolean isAvattu() {
        return avattu;
    }

    /** Asettaa luukun tilan, onko luukku jo avattu vai ei.
     * <pre>luukku1.setAvattu(false);</pre>
     * @param avattu Kertoo, onko luukku jo avattu.
     */
    public void setAvattu(boolean avattu) {
        this.avattu = avattu;
    }

    /** Palauttaa luukun päivämäärän.
     * <pre>Date luukku1Date = luukku1.getLuukunPaivays();</pre>
     * @return Luukun päivämäärä.
     */
    public Date getLuukunPaivays() {
        return luukunPaivays;
    }

    /** Asettaa luukulle päivämäärän.
     * <pre>luukku1.setLuukunPaivays(new Date());</pre>
     * @param luukunPaivays Luukun päivämäärä.
     */
    public void setLuukunPaivays(Date luukunPaivays) {
        this.luukunPaivays = luukunPaivays;
    }

    /** Palauttaa luukun tekstisisällön merkkijonona.
     * <pre>String luukun1Sisalto = luukku1.getSisalto();</pre>
     * @return Luukun tekstisisältö.
     */
    public String getSisalto() {
        return sisalto;
    }

    /** Asettaa luukulle tekstisisällön.
     * <pre>luukku1.setSisalto("Hyvää joulua!");</pre>
     * @param sisalto Luukun tekstisisältö merkkijonona.
     */
    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    /** Palauttaa luukun kuvan sijainnin merkkijonona.
     * <pre>String luukun1Kuvapolku = luukku1.getKuva();</pre>
     * @return Luukun kuvan sijainti.
     */
    public String getKuva() {
        return kuva;
    }

    /** Asettaa luukulle kuvan tiedostopolun.
     * <pre>luukku1.setKuva("images/hyvaaJoulua.png");</pre> 
     * @param kuva Luukun kuvan tiedostosijainti merkkijonona.
     */
    public void setKuva(String kuva) {
        this.kuva = kuva;
    }
    
    /** Palauttaa polun luukun musiikkitiedostoon merkkijonona. 
     * <pre>String luukku1Musiikkitiedosto = luukku1.getMusiikkiTiedostoPolku();</pre>
     * @return Luukun musiikkitiedoston sijainti.
     */
    public String getMusiikkiTiedostoPolku() {
        return musiikkiTiedostoPolku;
    }

    /** Asettaa luukulle musiikkitiedoston polun.
     * <pre> luukku1.setMusiikkiTiedostoPolku("musicfiles/tulkoonjoulu.mp3);</pre>
     * @param musiikkiTiedostoPolku Luukun musiikin tiedostosijainti merkkijonona.
     */
    public void setMusiikkiTiedostoPolku(String musiikkiTiedostoPolku) {
        this.musiikkiTiedostoPolku = musiikkiTiedostoPolku;
    }

    /** Palauttaa luukun tiedot merkkijonona muodossa
     * <pre>
     * Luukku{nimi=luukku1, numero=1, avattu=false, luukunPaivays=Fri Dec 01 00:00:00 EET 2017, sisalto=Hyvää joulua ja onnellista uutta vuotta!, musiikkiTiedostoPolku=/musicfiles/WhamLastChristmas.mp3}
     * </pre>
     */
    @Override
    public String toString() {
        return "Luukku{" + "nimi=" + nimi + ", numero=" + numero + ", avattu=" + avattu + ", luukunPaivays=" + luukunPaivays + ", sisalto=" + sisalto + ", musiikkiTiedostoPolku=" + musiikkiTiedostoPolku + '}';
    }

    public Luukku() {
    }
    
}
