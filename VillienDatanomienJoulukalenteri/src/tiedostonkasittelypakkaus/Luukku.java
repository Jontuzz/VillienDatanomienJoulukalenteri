/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiedostonkasittelypakkaus;

import java.util.Date;
import javafx.scene.media.Media;
/**
 *
 * @author s1601378
 */
public class Luukku {
    
    
    private String nimi;
    private int numero;
    private boolean avattu;
    private Date luukunPaivays;
    private String sisalto;
    private String musiikkiTiedostoPolku;
    private String kuva;
  
    public Luukku(String nimi, int numero, boolean avattu, Date luukunPaivays, String sisalto, String kuva, String musiikkiTiedostoPolku) {
        this.nimi = nimi;
        this.numero = numero;
        this.avattu = avattu;
        this.luukunPaivays = luukunPaivays;
        this.sisalto = sisalto;
        this.kuva = kuva;
        this.musiikkiTiedostoPolku = musiikkiTiedostoPolku;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAvattu() {
        return avattu;
    }

    public void setAvattu(boolean avattu) {
        this.avattu = avattu;
    }

    public Date getLuukunPaivays() {
        return luukunPaivays;
    }

    public void setLuukunPaivays(Date luukunPaivays) {
        this.luukunPaivays = luukunPaivays;
    }

    public String getSisalto() {
        return sisalto;
    }

    public void setSisalto(String sisalto) {
        this.sisalto = sisalto;
    }

    public String getKuva() {
        return kuva;
    }

    public void setKuva(String kuva) {
        this.kuva = kuva;
    }
    
    public String getMusiikkiTiedostoPolku() {
        return musiikkiTiedostoPolku;
    }

    public void setMusiikkiTiedostoPolku(String musiikkiTiedostoPolku) {
        this.musiikkiTiedostoPolku = musiikkiTiedostoPolku;
    }

    @Override
    public String toString() {
        return "Luukku{" + "nimi=" + nimi + ", numero=" + numero + ", avattu=" + avattu + ", luukunPaivays=" + luukunPaivays + ", sisalto=" + sisalto + ", musiikkiTiedostoPolku=" + musiikkiTiedostoPolku + '}';
    }

    public Luukku() {
    }
    
}
