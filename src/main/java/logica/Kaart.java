
package logica;

public class Kaart {

    char soort;
    char waarde;

    public Kaart(char soort, char waarde){
        this.waarde = waarde;
        this.soort = soort;
    }
    public Kaart(String soortWaarde){

        this.soort = soortWaarde.charAt(0);
        this.waarde = soortWaarde.charAt(1);
    }

    public char getSoort() {
        return soort;
    }

    public char getWaarde() {
        return waarde;
    }

    public static boolean isGeldigeSoort(char soort){
        if (soort == 'H' || soort == 'K' || soort == 'R' || soort == 'S'){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isGeldigeWaarde(char waarde){
        if(waarde == '2' || waarde == '3' || waarde == '4' || waarde == '5' || waarde == '6' || waarde == '7' ||  waarde == '8' || waarde == '9' || waarde == 'T' || waarde == 'B' || waarde == 'D' || waarde == 'H' || waarde == 'A' ){
            return true;
        } else {
            return false;
        }
    }
    public static boolean isGeldigeKaart(String kaart){

        if (kaart.length()!=2){
            return false;
    }else {
            String kSoort = kaart.substring(0,1);
            String kWaarde = kaart.substring(1,2);

        if (kSoort.equals("H")  || kSoort.equals("K") || kSoort.equals("R") || kSoort.equals("S")){
            if (kWaarde.equals("2") || kWaarde.equals("3") || kWaarde.equals("4") || kWaarde.equals("5") || kWaarde.equals("6") || kWaarde.equals("7") ||  kWaarde.equals("8") || kWaarde.equals("9") || kWaarde.equals("T") || kWaarde.equals("B") || kWaarde.equals("D") || kWaarde.equals("H") || kWaarde.equals("A") ){
                return true;
            }else{
                return false;
            }
        } else {
            return false;
        }
        }

    }
    public static String geefHoogsteKaart(String k1, String k2){

        String soort1 = k1.substring(0,1);
        String waarde1= k1.substring(1,2);
        String soort2 = k2.substring(0,1);
        String waarde2= k2.substring(1,2);
        int kWaarde1 = 0;
        int kWaarde2 = 0;


        if (soort1.equals("S")&& !soort2.equals("S")){
            return k1;
        } else if (soort2.equals("S")&& !soort1.equals("S")) {
            return k2;
        }else {
            switch (waarde1){
                case "2":
                    kWaarde1 = 2;
                    break;
                case "3":
                    kWaarde1 = 3;
                    break;
                case "4":
                    kWaarde1 = 4;
                    break;
                case "5":
                    kWaarde1 = 5;
                    break;
                case "6":
                    kWaarde1 = 6;
                    break;
                case "7":
                    kWaarde1 = 7;
                    break;
                case "8":
                    kWaarde1 = 8;
                    break;
                case "9":
                    kWaarde1 = 9;
                    break;
                case "T":
                    kWaarde1 = 10;
                    break;
                case "B":
                    kWaarde1 = 11;
                    break;
                case "D":
                    kWaarde1 = 12;
                    break;
                case "H":
                    kWaarde1 = 13;
                    break;
                case "A":
                    kWaarde1 = 14;
                    break;
            }
            switch (waarde2){
                case "2":
                    kWaarde2 = 2;
                    break;
                case "3":
                    kWaarde2 = 3;
                    break;
                case "4":
                    kWaarde2 = 4;
                    break;
                case "5":
                    kWaarde2 = 5;
                    break;
                case "6":
                    kWaarde2 = 6;
                    break;
                case "7":
                    kWaarde2 = 7;
                    break;
                case "8":
                    kWaarde2 = 8;
                    break;
                case "9":
                    kWaarde2 = 9;
                    break;
                case "T":
                    kWaarde2 = 10;
                    break;
                case "B":
                    kWaarde2 = 11;
                    break;
                case "D":
                    kWaarde2 = 12;
                    break;
                case "H":
                    kWaarde2 = 13;
                    break;
                case "A":
                    kWaarde2 = 14;
                    break;
            }

            if (kWaarde1==kWaarde2){
                return "gelijk";
            }else{
                if (kWaarde1>kWaarde2){
                    return k1;
                }else {
                    return k2;
                }
            }
        }
    }
    @Override
    public String toString() {
        return "" + soort + waarde;
    }
    public boolean isGeldig(){

        if (soort == 'H' || soort == 'K' || soort == 'R' || soort == 'S'){
            if (waarde == '2' || waarde == '3' || waarde == '4' || waarde == '5' || waarde == '6' || waarde == '7' ||  waarde == '8' || waarde == '9' || waarde == 'T' || waarde == 'B' || waarde == 'D' || waarde == 'H' || waarde == 'A'){
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }
}
