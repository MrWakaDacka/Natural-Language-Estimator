/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proje;

/**
 *
 * @author AYTAC
 */
public class Kelime {
    private String kelime;
    private int kullanılmaSayısı;
    
    public Kelime (String kelime){
        this.kelime=kelime;
        this.kullanılmaSayısı=1;
    }
    
    public String getKelime(){return kelime;}
    public int getKullanılma(){return kullanılmaSayısı;}
    public void arttırKullanılma(){kullanılmaSayısı++;}
}
