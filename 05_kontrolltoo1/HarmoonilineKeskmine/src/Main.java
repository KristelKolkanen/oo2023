import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Double> kiirusteKeskmine = new ArrayList<>();
    static double summa = 0;
    public static void main(String[] args) throws IOException {

        File inputFile = new File("kiirused.txt");
        Scanner inputScanner;
        try {
            inputScanner = new Scanner(inputFile);
        } catch (IOException e) {
            return;
        }
        double sum = 0.0;
        int count = 0;
        while (inputScanner.hasNextDouble()) {
            double number = inputScanner.nextDouble();
            sum += number;
            count++;
        }
        double average = sum / count;
        System.out.println("Keskmine kiirus on: " + average);

        PrintWriter outPutWriter = new PrintWriter("koguTeeKeskmine.txt");
        outPutWriter.printf("%.2f", average);
        outPutWriter.close();

        //esimene osa
        System.out.println("Harmooniline keskmine");
        System.out.println(keskmineKiirus(192, 33.2));
        System.out.println(keskmineKiirus(50.4, 79.9));
    }
    private static double keskmineKiirus(double kiirus1, double kiirus2){
        double kiirusteSumma = kiirus1 + kiirus2;
        return (kiirusteSumma/2)/2;
    }
    //esimese osa lõpp

    //teine osa
    public static double keskmisedKiirused(ArrayList<Double> kiirusteKeskmine) {
        System.out.println(kiirusteKeskmine.size());
        for (int i = 0; i < kiirusteKeskmine.size(); i++) {
            System.out.println(summa);
            System.out.println(kiirusteKeskmine.get(i));
            summa = summa + kiirusteKeskmine.get(i);
        }
        System.out.println("Kiiruste keskmine on " + summa/kiirusteKeskmine.size() + "km/h");
        return summa/kiirusteKeskmine.size();
    }
}