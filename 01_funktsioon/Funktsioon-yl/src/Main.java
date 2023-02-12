import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Raha arvutamine
        Scanner sc = new Scanner(System.in);
        System.out.print("Sisesta kauba hind: ");
        double a = sc.nextDouble();
        System.out.print("Sisesta saadud raha: ");
        double b = sc.nextDouble();
        double c = b-a;
        moneyResult(c);

        // Arvu arvamise mäng
        Random rand = new Random();
        Scanner nr = new Scanner(System.in);
        System.out.print("Sisesta maksimum arv, mille seast arvata: ");
        int max = nr.nextInt();
        int computerNr = rand.nextInt(1,max);
        System.out.print("Paku arv: ");
        int playerNr = nr.nextInt();
        guessingGame(nr, computerNr, playerNr);

        // int funktsioon
        int birthY = getYourAge(1998);
        int until100 = 100 - birthY;
        int days100 = until100*365;
        System.out.println(birthY);
        System.out.println("Elupäevi järgi: " + days100);
    }
    private static int getYourAge(int birthYear) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        int age = year-birthYear;
        return age;
    }
    private static void guessingGame(Scanner nr, int computerNr, int playerNr) {
        if (computerNr > playerNr){
            System.out.println("Arvuti arv on suurem, paku korra veel: ");
            int playerNr2 = nr.nextInt();
            guessingGame2(computerNr, playerNr2);
        } else if (computerNr < playerNr) {
            System.out.println("Arvuti arv on väiksem, paku korra veel ");
            int playerNr2 = nr.nextInt();
            guessingGame2(computerNr, playerNr2);
        } else {
            System.out.println("Õige vastus!");
        }
    }

    private static void guessingGame2(int computerNr, int playerNr2) {
        if (computerNr > playerNr2) {
            System.out.println("Arvuti arv on suurem, u lose");
        } else if (computerNr < playerNr2) {
            System.out.println("Arvuti arv on väiksem, u lose");
        } else {
            System.out.println("Joppas - õige vastus!");
        }
    }

    private static void moneyResult(double c) {
        if (c == 0) {
            System.out.println("Maksti täpne summa");
        } else if (c < 0) {
            System.out.println("Vaja juurde maksta: " + (c * -1));
        } else {
            System.out.println("Raha vaja tagastada: " + c);
        }
    }
}