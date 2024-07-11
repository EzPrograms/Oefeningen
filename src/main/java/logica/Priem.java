/*
package logica;

import java.util.Scanner;

public class Priem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int getal = scan.nextInt();
        System.out.println(isPriem(getal));

        System.out.println("Hoeveel priem getallen wil je? : ");
        int aantal = scan.nextInt();
        printPriems(aantal);

        int[]priems = geefPriems(aantal);
        for (int i = 0; i <= priems.length-1; i++){
            System.out.print(priems[i] + " ");
        }
    }
    public static boolean isPriem(int getal){

        int count = 0;
        boolean priem = false;

        for (int i = 1; i <= getal; i++){
            if (getal % i == 0){
                count++;
            }
        }
        return priem = count == 2;
    }
    public static int [] geefPriems(int aantal){
        int count = 0;
        int nummer = 0;
        int [] priems = new int[aantal];

        while(count!=aantal) {
            nummer++;
            if (isPriem(nummer)) {
                priems[count] = nummer;
                count++;
            }
        }
        return priems;
    }
    public static void printPriems(int aantal){

        int count = 0;
        int nummer = 0;

        while(count!=aantal){
            nummer++;
            if (isPriem(nummer)){
                System.out.println(nummer);
                count++;
            }
        }
    }
}
*/

