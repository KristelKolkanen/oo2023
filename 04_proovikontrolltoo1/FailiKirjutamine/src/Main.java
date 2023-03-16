import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("valjund1.txt"));
        pw.println("Tere, ");
        pw.println("Kirjutan uue rea.");
        pw.print("Kirjutan ilma uue reata: ");
        pw.print("helloooo!");
        pw.close();
    }
}