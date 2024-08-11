package logica;

public class KaartSpel {
    Speler speler1;
    Speler speler2;
    int aantalRondes;
    Speler spelerAanZet;
    KaartBoek kaartboek;
    public KaartSpel(){
        this.speler1 = new Speler("dummy1");
        this.speler2 = new Speler("dummy2");
        aantalRondes = 10;
    }
    public KaartSpel(String naam1, String naam2, int aantalRondes){
       this.speler1 = new Speler(naam1);
       this.speler2 = new Speler(naam2);
       this.aantalRondes = aantalRondes;
    }
    public Speler getSpeler1() {
        return speler1;
    }
    public Speler getSpeler2() {
        return speler2;
    }
    public Speler getSpelerAanZet() {
        return spelerAanZet;
    }
    public void bepaalWieMagStarten() {
        int worp1;
        int worp2;

        do {
            worp1 = speler1.gooiDobbelsteen();
            worp2 = speler2.gooiDobbelsteen();
        } while (worp1 == worp2);

            if (worp1 > worp2) {
                spelerAanZet = speler1;
            } else {
                spelerAanZet = speler2;
            }

    }
    public void speelRonde(){

            String hoogsteWaarde;
            KaartBoek kaart1 = new KaartBoek();
            KaartBoek kaart2 = new KaartBoek();
            speler1.kaartInHand = kaart1.geefRandomKaart();
            speler2.kaartInHand = kaart2.geefRandomKaart();

              hoogsteWaarde = Kaart.geefHoogsteKaart(speler1.kaartInHand.toString(), speler2.kaartInHand.toString());

                if (hoogsteWaarde == "gelijk") {
                    speelRonde();
                } else if (hoogsteWaarde.equals(speler1.kaartInHand.toString())){
                    speler1.incrementScore();
                } else {
                    speler2.incrementScore();
                }

    }
    public void speelSpel(){
        bepaalWieMagStarten();
        for (int i = 0; i<=aantalRondes-1;i++) {
            speelRonde();
        }
    }
    public String bepaalWinnaar(){
        if (speler1.score>speler2.score){
            return speler1.naam;
        } else if (speler1.score<speler2.score) {
            return speler2.naam;
        } else {
            return "gelijkspel";
        }
    }
}
