/*
package logica;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class readyStart {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Geef de datum eerst dag dan maand dan jaar : ");
        int dag = scan.nextInt();
        int maand = scan.nextInt();
        int jaar = scan.nextInt();
        LocalDate date = LocalDate.of(jaar, maand, dag);

        System.out.println("De opgegeven datum is : " + formatDatum(dag, maand, jaar) + " en " + formatDatum(date));
        System.out.println("Is de datum geldig " + isDatumGeldig(dag, maand, jaar));
        System.out.println("Is het een schrikkeljaar " + isSchrikkeljaar(jaar));
    }
    public static boolean isSchrikkeljaar(int jaar){
        boolean schrikkel = jaar % 4 == 0 || jaar % 400 == 0 && jaar % 100 != 0 ;
        return schrikkel;
    }

    public static boolean isDatumGeldig(int dag, int maand, int jaar){

        switch (maand){
            case 4,6,9,11 :
                boolean geldig = dag <= 30;
                break;
            case 1,3,5,7,8,10,12 :
                geldig = dag <= 31;
                break;
            case 2 :
                geldig = isSchrikkeljaar(jaar) && dag <= 29 || dag <= 28;
                break;
        }

        boolean geldig = jaar >= 1900;

        return geldig;
    }
    public static String formatDatum(int dag, int maand,  int jaar){
        return dag + "/" + maand + "/" + jaar;
    }
    public static String formatDatum(LocalDate date){
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatDatum = date.format(pattern);
        return  formatDatum;
    }
}
*/