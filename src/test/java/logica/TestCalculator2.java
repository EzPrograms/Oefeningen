package logica;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class TestCalculator2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef mij 2 nummers  : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        Calculator2 calc = new Calculator2(a,b);

        System.out.println("Kies : 1 = plus, 2 = min, 3= maal, 4= delen");
        int keuze = scan.nextInt();

        if (keuze==1){
            System.out.println(calc.Add());
        } else if (keuze==2){
            System.out.println(calc.Min());
        } else if (keuze == 3) {
            System.out.println(calc.Multi());
        } else if (keuze == 4){
            System.out.println(calc.Divide());
        } else if (keuze == 5){
            System.out.println(calc.Pow());
        } else if (keuze == 6){
            System.out.println("De macht van a of b? 1 = a, 2 = b :");
            int keuze2 = scan.nextInt();
            System.out.println(calc.Square(keuze2));
        }

    }
}
