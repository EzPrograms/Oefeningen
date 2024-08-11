package logica;

public class Speler {

    String naam;
    KaartBoek kaartboek;
    int score;
    Kaart kaartInHand;

    public Speler(String naam){
        this.naam = naam;
    }
    public String getNaam() {
        return naam;
    }

    public int getScore() {
        return score;
    }

    public Kaart getKaartInHand() {
        return kaartInHand;
    }

    public void setKaartboek(KaartBoek kaartboek) {
        this.kaartboek = kaartboek;
    }
    public int resetScore(){
        return score = 0;
    }
    public int incrementScore(){
        return score = score + 1;
    }
    public int gooiDobbelsteen(){
        int min = 1;
        int max = 6;
        return (int) ((Math.random() * (max - min)) + min);
    }
    public Kaart kiesRandomKaart(){
        return kaartInHand = kaartboek.geefRandomKaart();
    }
}
