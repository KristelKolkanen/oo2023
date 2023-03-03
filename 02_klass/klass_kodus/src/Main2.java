import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Artist tinkiwinki = new Artist("tinkiwinki","parool","tinkiwinki@gmail.com","Maali", "Maasikas");
        Artist tipsi = new Artist("tipsi","parool","tipsi@gmail.com","Sander", "Mölder");

        String teave = tinkiwinki.kustutaArtist();
        System.out.println(teave);

        tipsi.muudaArtistiNimi("tipsi");

        Registreerimine artist1 = new Registreerimine("tipsi");
        artist1.muudaAvalikuks();

        /*  Registreerimine artist2 = new lisaSingel("tinkiwinki", Arrays.asList("singel1", "singel2"));
        artist2.muudaAvalikuks();*/
    }
}