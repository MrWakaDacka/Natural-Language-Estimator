/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proje;

public class DilFactory {

    private static DilFactory dilFactory = new DilFactory();

    private DilFactory() {
    }

    public static DilFactory dilFactoryAl() {
        return dilFactory;
    }

    public Dil dilAl(String[] metinler) {
        return new Dil(kelimelerineAyır(metinler), triGramlarınaAyır(metinler));
    }

    private Kelime[] kelimelerineAyır(String[] metinler) {

        //KELİMELERİ BUL
        Kelime[] kelimeler = new Kelime[1500];
        int kelimeSayısı = 0;

        for (String metin : metinler) {
            int textLength = metin.length();
            int index = 0;
            String kelime = "";

            while (index < textLength) {
                if (Character.isLetter(metin.charAt(index))) {
                    while (index < textLength && Character.isLetter(metin.charAt(index))) {
                        kelime += metin.charAt(index);
                        index++;
                    }

                    for (int i = 0; i < 1500; i++) {
                        if (kelime.length() == 1) {
                            break;
                        }
                        if (kelimeler[i] == null) {
                            kelimeler[i] = new Kelime(kelime);
                            kelimeSayısı++;
                            break;
                        } else if (kelime.equalsIgnoreCase(kelimeler[i].getKelime())) {
                            kelimeler[i].arttırKullanılma();
                            break;
                        }
                    }

                    kelime = "";
                } else {
                    index++;
                }
            }
        }

        //BUBBLE SORT
        Boolean swapped;
        Kelime swap;

        do {
            swapped = false;
            for (int i = 0; i < kelimeSayısı - 2; i++) {
                if (kelimeler[i].getKullanılma() < kelimeler[i + 1].getKullanılma()) {
                    swap = kelimeler[i];
                    kelimeler[i] = kelimeler[i + 1];
                    kelimeler[i + 1] = swap;
                    swapped = true;
                }
            }
        } while (swapped);

        Kelime[] sonuç = new Kelime[50];

        System.arraycopy(kelimeler, 0, sonuç, 0, 50);

        return sonuç;
    }

    private TriGram[] triGramlarınaAyır(String[] metinler) {

        TriGram[] triGramlar = new TriGram[1500];
        int triGramSayısı = 0;

        for (String metin : metinler) {
            int textLength = metin.length();
            int index = 0;
            String kelime = "";
            String triGram;

            while (index < textLength) {
                if (Character.isLetter(metin.charAt(index))) {
                    while (index < textLength && Character.isLetter(metin.charAt(index))) {
                        kelime += metin.charAt(index);
                        index++;
                    }

                    if (kelime.length() < 2) {
                        break;
                    } else {
                        for (int a = -1; a <= kelime.length() - 2; a++) {
                            if (a == -1) {
                                triGram = "_" + kelime.substring(0, 2);
                            } else if (a == kelime.length() - 2) {
                                triGram = kelime.substring(kelime.length() - 2, kelime.length()) + "_";
                            } else {
                                triGram = kelime.substring(a, a + 3);
                            }

                            for (int i = 0; i < 1500; i++) {
                                if (triGramlar[i] == null) {
                                    triGramlar[i] = new TriGram(triGram);
                                    triGramSayısı++;
                                    break;
                                } else if (triGram.equalsIgnoreCase(triGramlar[i].getTriGram())) {
                                    triGramlar[i].arttırKullanılma();
                                    break;
                                }
                            }
                        }
                    }
                    kelime = "";
                } else {
                    index++;
                }
            }
        }

        Boolean swapped;
        TriGram swap;

        do {
            swapped = false;
            for (int i = 0; i < triGramSayısı - 2; i++) {
                if (triGramlar[i].getKullanılma() < triGramlar[i + 1].getKullanılma()) {
                    swap = triGramlar[i];
                    triGramlar[i] = triGramlar[i + 1];
                    triGramlar[i + 1] = swap;
                    swapped = true;
                }
            }
        } while (swapped);

        TriGram[] sonuç = new TriGram[50];

        System.arraycopy(triGramlar, 0, sonuç, 0, 50);

        return sonuç;
    }

    public Kelime[] kelimelerineAyırv2(String metin) {

        //KELİMELERİ BUL
        Kelime[] kelimeler = new Kelime[1500];
        int kelimeSayısı = 0;

        int textLength = metin.length();
        int index = 0;
        String kelime = "";

        while (index < textLength) {
            if (Character.isLetter(metin.charAt(index))) {
                while (index < textLength && Character.isLetter(metin.charAt(index))) {
                    kelime += metin.charAt(index);
                    index++;
                }

                for (int i = 0; i < 1500; i++) {
                    if (kelime.length() == 1) {
                        break;
                    }
                    if (kelimeler[i] == null) {
                        kelimeler[i] = new Kelime(kelime);
                        kelimeSayısı++;
                        break;
                    } else if (kelime.equalsIgnoreCase(kelimeler[i].getKelime())) {
                        kelimeler[i].arttırKullanılma();
                        break;
                    }
                }

                kelime = "";
            } else {
                index++;
            }
        }

        //BUBBLE SORT
        Boolean swapped;
        Kelime swap;

        do {
            swapped = false;
            for (int i = 0; i < kelimeSayısı - 2; i++) {
                if (kelimeler[i].getKullanılma() < kelimeler[i + 1].getKullanılma()) {
                    swap = kelimeler[i];
                    kelimeler[i] = kelimeler[i + 1];
                    kelimeler[i + 1] = swap;
                    swapped = true;
                }
            }
        } while (swapped);

        Kelime[] sonuç = new Kelime[50];

        System.arraycopy(kelimeler, 0, sonuç, 0, 50);

        return sonuç;
    }

    public TriGram[] triGramlarınaAyırv2(String metin) {

        TriGram[] triGramlar = new TriGram[1500];
        int triGramSayısı = 0;

        int textLength = metin.length();
        int index = 0;
        String kelime = "";
        String triGram;

        while (index < textLength) {
            if (Character.isLetter(metin.charAt(index))) {
                while (index < textLength && Character.isLetter(metin.charAt(index))) {
                    kelime += metin.charAt(index);
                    index++;
                }

                if (kelime.length() < 2) {
                    break;
                } else {
                    for (int a = -1; a <= kelime.length() - 2; a++) {
                        if (a == -1) {
                            triGram = "_" + kelime.substring(0, 2);
                        } else if (a == kelime.length() - 2) {
                            triGram = kelime.substring(kelime.length() - 2, kelime.length()) + "_";
                        } else {
                            triGram = kelime.substring(a, a + 3);
                        }

                        for (int i = 0; i < 1500; i++) {
                            if (triGramlar[i] == null) {
                                triGramlar[i] = new TriGram(triGram);
                                triGramSayısı++;
                                break;
                            } else if (triGram.equalsIgnoreCase(triGramlar[i].getTriGram())) {
                                triGramlar[i].arttırKullanılma();
                                break;
                            }
                        }
                    }
                }
                kelime = "";
            } else {
                index++;
            }
        }

        Boolean swapped;
        TriGram swap;

        do {
            swapped = false;
            for (int i = 0; i < triGramSayısı - 2; i++) {
                if (triGramlar[i].getKullanılma() < triGramlar[i + 1].getKullanılma()) {
                    swap = triGramlar[i];
                    triGramlar[i] = triGramlar[i + 1];
                    triGramlar[i + 1] = swap;
                    swapped = true;
                }
            }
        } while (swapped);

        TriGram[] sonuç = new TriGram[50];

        System.arraycopy(triGramlar, 0, sonuç, 0, 50);

        return sonuç;
    }
}
