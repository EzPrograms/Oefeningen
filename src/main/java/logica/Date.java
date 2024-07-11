/*
package logica;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Geef een datum in XX/XX formaat : ");
        String datum1 = scan.next();
        System.out.println("Geef nog een datum : ");
        String datum2 = scan.next();

        System.out.println("Het aantal dagen tussen deze 2 datums is " + datumBereken(inputConvert(datum1, datum2)));
    }
    public static int [] inputConvert(String datum1, String datum2){

        int dag1 =  Integer.valueOf(datum1.substring(0,2));
        int maand1 = Integer.valueOf(datum1.substring(3,5));
        int dag2 = Integer.valueOf(datum2.substring(0,2));
        int maand2 = Integer.valueOf(datum2.substring(3,5));

        int [] tijd = new int[4];
        tijd[0] = dag1;
        tijd[1] = maand1;
        tijd[2] = dag2;
        tijd[3] = maand2;

        return tijd;
    }
    public static int datumBereken(int [] tijd){

        int berekendDag = Math.abs(tijd[0]-tijd[2]);

        if (tijd[1] == tijd[3]){
            return berekendDag;
        }else{
            int verschil = tijd[1]-tijd[3];

            return Math.abs(verschil*30);
        }
    }
}
*/
