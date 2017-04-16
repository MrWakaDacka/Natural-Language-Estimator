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
public class TriGram {
    private String triGram;
    private int kullanılmaSayısı;
    
    public TriGram (String triGram){
        this.triGram=triGram;
        this.kullanılmaSayısı=1;
    }
    
    public String getTriGram(){return triGram;}
    public int getKullanılma(){return kullanılmaSayısı;}
    public void arttırKullanılma(){kullanılmaSayısı++;}
}
