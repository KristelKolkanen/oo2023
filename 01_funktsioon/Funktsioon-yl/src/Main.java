public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        String hinnang = hinnangTemp(-2.5);
        String hinnang2 = hinnangTemp(5.7);
        System.out.println(hinnang);
        System.out.println(hinnang2);

        double summa = arvutaTaksoMaksumus(3.5);
        System.out.println(summa);
        double summa2 = arvutaTaksoMaksumus(4);
        System.out.println(summa2);
    }

    private static double arvutaTaksoMaksumus(double tunnid) {
       return 3+0.8*tunnid;
    }

    private static String hinnangTemp(double temp) {
        if (temp < 0) {
            return "On jääs";
        } else {
            return "On vesi";
        }
    }
}