public class Main {
    public static void main(String[] args) {
        System.out.println("Harmooniline keskmine");
        System.out.println(keskmineKiirus(2.4, 35.4));
    }
    private static double keskmineKiirus(double kiirus1, double kiirus2){
        double kiirusteSumma = kiirus1 + kiirus2;
        return (kiirusteSumma/2)/2;
    }
}