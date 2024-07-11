/*
package logica;

import java.util.Scanner;

public class Scheiden {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef een woord : ");
        String woord = scan.next();
        System.out.println("Geef een letter : ");
        String letter = scan.next();

        System.out.println(ScheidLetters(woord, letter));
    }
    public static String ScheidLetters(String woord, String letter){

        String scheiding = "";
        int count = 1;

        for (int i = 0; i <=woord.length()-1; i++){
            if (i==woord.length()-1){
                scheiding = scheiding + woord.substring(i,count);
            }else{
                scheiding = scheiding + woord.substring(i,count) + letter;
            }
            count++;
        }

        return scheiding;
    }
}
*/