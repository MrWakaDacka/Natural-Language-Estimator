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
public class KosinüsBenzerliği {

    public static float benzerlikHesaplaKelime(Kelime[] dil, Kelime[] metin) {

        int[][] benzerlikVektörü = new int[2][100];
        int index = 0;
        int uzunluk = 0;
        Boolean esitmi;

        for (int i = 0; i < 50; i++) {
            if(dil[i]==null)
                break;
            esitmi = false;
            for (int j = 0; j < 50; j++) {
                if(metin[j]==null)
                    break;
                
                if (dil[i].getKelime().equalsIgnoreCase(metin[j].getKelime())) {
                    benzerlikVektörü[0][uzunluk] = 1;
                    benzerlikVektörü[1][uzunluk] = 1;
                    uzunluk++;
                    esitmi = true;
                    break;
                }
            }

            if (!esitmi) {
                benzerlikVektörü[0][uzunluk] = 1;
                benzerlikVektörü[1][uzunluk] = 0;
                uzunluk++;
            }
        }
        
        for (int i = 0; i < 50; i++) {
            if(metin[i]==null)
                break;
            esitmi = false;
            for (int j = 0; j < 50; j++) {
                if(dil[j]==null)
                    break;
                if (metin[i].getKelime().equalsIgnoreCase(dil[j].getKelime())) {
                    esitmi = true;
                    break;
                }
            }

            if (!esitmi) {
                benzerlikVektörü[0][uzunluk] = 0;
                benzerlikVektörü[1][uzunluk] = 1;
                uzunluk++;
            }
        }
        
        //HESAPLA
        float dot=0;
        for(int i=0;i<uzunluk;i++){
            if(benzerlikVektörü[0][i]*benzerlikVektörü[1][i]==1){
                dot++;
            }
        }
        float d1=0;
        for(int i=0;i<uzunluk;i++){
            if(benzerlikVektörü[0][i]==1)
                d1++;
        }
        d1= (float) Math.sqrt(d1);
        
        float d2=0;
        for(int i=0;i<uzunluk;i++){
            if(benzerlikVektörü[1][i]==1)
                d2++;
        }
        d2= (float) Math.sqrt(d2);
        
        return dot/(d1*d2);
    }
    
    public static float benzerlikHesaplaTriGram(TriGram[] dil, TriGram[] metin) {

        int[][] benzerlikVektörü = new int[2][100];
        int index = 0;
        int uzunluk = 0;
        Boolean esitmi;

        for (int i = 0; i < 50; i++) {
            if(dil[i]==null)
                break;
            esitmi = false;
            for (int j = 0; j < 50; j++) {
                if(metin[j]==null)
                    break;
                if (dil[i].getTriGram().equalsIgnoreCase(metin[j].getTriGram())) {
                    benzerlikVektörü[0][uzunluk] = 1;
                    benzerlikVektörü[1][uzunluk] = 1;
                    uzunluk++;
                    esitmi = true;
                    break;
                }
            }

            if (!esitmi) {
                benzerlikVektörü[0][uzunluk] = 1;
                benzerlikVektörü[1][uzunluk] = 0;
                uzunluk++;
            }
        }
        
        for (int i = 0; i < 50; i++) {
            if(metin[i]==null)
                break;
            esitmi = false;
            for (int j = 0; j < 50; j++) {
                if(dil[j]==null)
                    break;
                if (metin[i].getTriGram().equalsIgnoreCase(dil[j].getTriGram())) {
                    esitmi = true;
                    break;
                }
            }

            if (!esitmi) {
                benzerlikVektörü[0][uzunluk] = 0;
                benzerlikVektörü[1][uzunluk] = 1;
                uzunluk++;
            }
        }
        
        //HESAPLA
        float dot=0;
        for(int i=0;i<uzunluk;i++){
            if(benzerlikVektörü[0][i]*benzerlikVektörü[1][i]==1){
                dot++;
            }
        }
        float d1=0;
        for(int i=0;i<uzunluk;i++){
            if(benzerlikVektörü[0][i]==1)
                d1++;
        }
        d1= (float) Math.sqrt(d1);
        
        float d2=0;
        for(int i=0;i<uzunluk;i++){
            if(benzerlikVektörü[1][i]==1)
                d2++;
        }
        d2= (float) Math.sqrt(d2);
        
        return dot/(d1*d2);
    }
}
