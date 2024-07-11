/*
package logica;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class BankAccount {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1 is deposit, 2 is withdraw,3 Current balance,4 details bank");
        int keuze = scan.nextInt();

        int balance = 5000;
    while (keuze!=10) {
        if (keuze > 5 || keuze < 0) {
            System.out.println("Dit is niet 1 van de keuzes");
        } else if (keuze == 1) {
            System.out.println(deposit(balance));
        } else if (keuze == 2) {
            System.out.println(withdraw(balance));
        } else if (keuze == 3) {
            System.out.println(getBalance(balance));
        } else if (keuze == 4) {
            String info[] = printDetails(balance);
            for (int i = 0; i <= info.length - 1; i++) {
                System.out.println(info[i]);
            }
        }
    }
    }
    public static int deposit(int balance){

        Scanner scan = new Scanner(System.in);

        System.out.println("Your current balance is : " + balance);
        System.out.println("How much do you want to deposit : ");

        int amount = scan.nextInt();

        balance = balance + amount;

        return balance;
    }
    public static int withdraw(int balance){

        Scanner scan = new Scanner(System.in);

        System.out.println("Your current balance is : " + balance);
        System.out.println("How much do you want to withdraw : ");

        int amount = scan.nextInt();

        balance = balance - amount;

        return balance;
    }
    public static String[] printDetails(int balance){

        String name = "Roberto";
        String lastName = "Alexandre";
        String adres = "Drop 1, 9000 Gent";
        String [] info = new String[3];

        info [0] = name;
        info [1] = lastName;
        info [2] = adres;

        return info;
    }
    public static int getBalance(int balance){
        return balance;
    }
}
*/