import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Kasutaja kristel = new Kasutaja("kristel","parool","kristel@gmail.com","kristel", "kolkanen");
        Kasutaja kristel2 = new Kasutaja("kristel","parool","kristel@gmail.com","kristel", "kolkanen");

        String sonum = kristel.kustutaKasutaja();
        System.out.println(sonum);

        kristel2.muudaParool("kolkanen@gmail.com");

        Tellimus tellimus1 = new Tellimus("kristel", Array,);????

        //KODUS: 1 klass, constructor, 2+ muutujat, 2+ funktsiooni, 2+ väljakutset mainis
    }
}