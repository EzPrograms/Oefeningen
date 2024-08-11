package logica;

public class Kaart {
    char soort;
    char waarde;

    public Kaart(char soort, char waarde){
        this.soort = soort;
        this.waarde = waarde;
    }
    public Kaart(String SoortWaarde){
        soort = SoortWaarde.charAt(0);
        waarde = SoortWaarde.charAt(1);
    }
    public char getSoort() {
        return soort;
    }

    public char getWaarde() {
        return waarde;
    }
    @Override
    public String toString() {
        return "" + soort + waarde;
    }
    public static boolean isGeldigeSoort(char soort){
        if (soort == 'H' || soort == 'K' ||  soort == 'R' ||  soort == 'S'){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isGeldigeWaarde(char waarde){
        if (waarde == 'A' || waarde == '2' || waarde == '3' || waarde == '4' || waarde == '5' || waarde == '6' || waarde == '7' || waarde == '8' || waarde == '9' || waarde == 'T' || waarde == 'B' || waarde == 'D' || waarde == 'H' ){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isGeldigeKaart(String soortWaarde){
        if (soortWaarde.length()!=2){
            return false;
        } else if (isGeldigeSoort(soortWaarde.charAt(0)) && isGeldigeWaarde(soortWaarde.charAt(1))){
            return true;
        } else {
            return false;
        }
    }
    public static String geefHoogsteKaart(String k1, String k2){
        char s1 = k1.charAt(0);
        char s2 = k2.charAt(0);
        char w1 = k1.charAt(1);
        char w2 = k2.charAt(1);
        int n1;
        int n2;

        if (s1 == 'S' && s2 != 'S'){
            return k1;
        } else if (s2 == 'S' && s1 != 'S'){
            return k2;
        } else if (w1 == w2){
            return "gelijk";
        }else {
            switch (w1){
                case 'T':
                    n1 = 10;
                    break;
                case 'B':
                    n1 = 11;
                    break;
                case 'D':
                    n1 = 12;
                    break;
                case 'H':
                    n1 = 13;
                    break;
                case 'A':
                    n1 = 14;
                    break;
                default:
                n1 = w1 - '0';
            }
            switch (w2){
                case 'T':
                    n2 = 10;
                    break;
                case 'B':
                    n2 = 11;
                    break;
                case 'D':
                    n2 = 12;
                    break;
                case 'H':
                    n2 = 13;
                    break;
                case 'A':
                    n2 = 14;
                    break;
                default:
                    n2 = w2 - '0';
            }
            if (n1>n2){
                return k1;
            } else if (n2>n1) {
                return k2;
            } else {
                return "gelijk";
            }
        }
    }
    public boolean isGeldig(){
        if (soort == 'H' || soort == 'K' ||  soort == 'R' ||  soort == 'S'){
            if (waarde == 'A' || waarde == '2' || waarde == '3' || waarde == '4' || waarde == '5' || waarde == '6' || waarde == '7' || waarde == '8' || waarde == '9' || waarde == 'T' || waarde == 'B' || waarde == 'D' || waarde == 'H' ){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }
    }
}
