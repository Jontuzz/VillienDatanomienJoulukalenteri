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
 */
public class Luukku {
    
    
    private String nimi;
    private int numero;
    private boolean avattu;
    private Date luukunPaivays;
    private String sisalto;
  
    public Luukku(String nimi, int numero, boolean avattu, Date luukunPaivays, String sisalto) {
        this.nimi = nimi;
        this.numero = numero;
        this.avattu = avattu;
        this.luukunPaivays = luukunPaivays;
        this.sisalto = sisalto;
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

    @Override
    public String toString() {
        return "Luukku{" + "nimi=" + nimi + ", numero=" + numero + ", avattu=" + avattu + ", luukunPaivays=" + luukunPaivays + ", sisalto=" + sisalto + '}';
    }

    public Luukku() {
    }
    
}
