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
public class Dil {
    private Kelime[] sıkKullanılanKelimeler;
    private TriGram[] sıkKullanılanTriGramlar;
    
    public Dil(Kelime[] kelimeler,TriGram[] triGramlar){
        this.sıkKullanılanKelimeler=kelimeler;
        this.sıkKullanılanTriGramlar=triGramlar;
    }
    
    public Kelime[] getKelimeler(){return sıkKullanılanKelimeler;}
    public TriGram[] getTriGramlar() {return sıkKullanılanTriGramlar;}
}
