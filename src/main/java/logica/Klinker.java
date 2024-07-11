/*
package logica;

import java.io.Serializable;
import java.util.Scanner;

public class Klinker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een zin : ");
        System.out.println("Geef een letter : ");
        String zin = scan.nextLine();
        String letter  = scan.next();



        System.out.println("Is de letter een klinker " + isKlinker(letter));
        System.out.println("Bevat de zin klinkers " + heeftKlinkers(zin));

    }
    public static boolean isKlinker(String letter){
        boolean klinker = letter.equals("a") || letter.equals("A") ||  letter.equals("e") ||  letter.equals("E") ||  letter.equals("i") ||  letter.equals("I") ||  letter.equals("o") ||  letter.equals("O") || letter.equals("u") ||  letter.equals("U");
        return klinker;
    }
    public static boolean heeftKlinkers(String zin){

        String klinker;
        int count = 1;
        int klinkerCount = 0;
        boolean bevatKlinker = false;

        for (int i = 0; i <= zin.length()-1; i++){
            klinker = zin.substring(i, count);
            count++;
            bevatKlinker = klinker.equals("a") || klinker.equals("A") ||  klinker.equals("e") ||  klinker.equals("E") ||  klinker.equals("i") ||  klinker.equals("I") ||  klinker.equals("o") ||  klinker.equals("O") || klinker.equals("u") ||  klinker.equals("U");
            int tell = bevatKlinker ? klinkerCount++ : 0;
        }

        return klinkerCount>0;
    }
}
*/