package logica;
import java.util.Arrays;

public class KaartBoek {
    int aantal;
    Kaart [] kaarten;

    public KaartBoek(){

        aantal = 52;

        String soort = "HKRS";
        String waarde = "23456789TBDHA";
        kaarten = new Kaart[aantal];
        int count = 0;

        for (int i = 0; i<=3; i++){
            for (int j = 0; j<=12; j++){

                kaarten[count] = new Kaart(soort.charAt(i),waarde.charAt(j));
                count++;

            }
        }
    }
    public KaartBoek(char [] kaart){

        String waarde = "23456789TBDHA";
        int correct = 0;

        for (int k = 0; k<=kaart.length-1;k++){
            if (Kaart.isGeldigeSoort(kaart[k])){
                correct++;
            }
        }
        aantal = correct * 13;
        kaarten = new Kaart[aantal];
        int count = 0;

        for (int i = 0; i<=correct-1; i++){
            for (int j = 0; j<=12; j++){
                kaarten[count] = new Kaart(kaart[i],waarde.charAt(j));
                count++;
            }
        }
    }
    public KaartBoek(String[] kaart){

        Kaart[] cards = new Kaart[kaart.length];
        for (int i = 0; i<=kaart.length-1 ;i++){
            if (Kaart.isGeldigeKaart(kaart[i])){
                cards[i] = new Kaart(kaart[i]);
                kaarten = cards;
            } else {
                kaarten = Arrays.copyOf(cards, kaart.length-1);
            }
        }
    }
    public boolean bevatKaart(String kaart){

        boolean isKaart = false;

        for (int i = 0; i<= kaarten.length-1; i++){
         if (kaarten[i].toString().equals(kaart)){
          isKaart = true;
            }
        }
        return isKaart;
    }
    public boolean bevatKaartVanSoort(char soort){
        boolean isSoort = false;
        if (Kaart.isGeldigeSoort(soort)){
            for (int i = 0; i <= kaarten.length-1; i++){
                char soort1 = kaarten[i].toString().charAt(0);
                if (soort == soort1){
                    isSoort = true;
                }
            }
        }
        return isSoort;
    }
    public Kaart [] geefAlleKaartenVanSoort(char soort){
        Kaart [] cards = new Kaart[0];
        if (Kaart.isGeldigeSoort(soort)) {
            if (kaarten.length>=13){
                cards = new Kaart[13];
            }else{
                cards = new Kaart[1];
            }
            int count = 0;
                for (int j = 0; j <= kaarten.length-1; j++) {
                    if (kaarten[j].toString().charAt(0) == soort){
                        cards[count] = new Kaart(soort, kaarten[j].toString().charAt(1)) ;
                        count++;
                    }
                }

        }
        int noneNull = 0;
        for (int i = 0; i<=cards.length-1;i++){
            if (cards[i] != null){
                noneNull++;
            }
        }
        if (noneNull==0){
            return cards = new Kaart[0];
        } else {
            return cards;
        }
    }
    public Kaart geefRandomKaart(){
        Kaart random;
        int max = kaarten.length-1;

        random = kaarten[(int) (Math.random() * (max + 1))];

        return random;
    }
    public  Kaart geefRandomKaartVanSoort(char soort){
        Kaart soortRandom;
        int max = kaarten.length-1;
        int correct = 0;

        if (bevatKaartVanSoort(soort)){
            while(correct!=1){
                soortRandom = kaarten[(int) (Math.random()*(max + 1))];
                    if (soortRandom.toString().charAt(0)==soort){
                        correct++;
                     return soortRandom;
                }
            }
        }
        return null;
    }
}
