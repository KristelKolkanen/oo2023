import java.util.Date;

public class Artist {
    String artistinimi;
    String parool;
    String email;
    String eesnimi;
    String perenimi;
    Boolean aktiivne;
    Date loomisAeg;
    Date kustutamisAeg;

    public Artist(String artistinimi, String parool, String email, String eesnimi, String perenimi) {
        this.artistinimi = artistinimi;
        this.parool = parool;
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.loomisAeg = new Date();
        this.kustutamisAeg = null;
    }
    public String kustutaArtist(){
        this.aktiivne = false;
        this.kustutamisAeg = new Date();
        return "Artist on kustutatud!";
    }
    public void muudaArtistiNimi(String uusArtistinimi){
        this.artistinimi = uusArtistinimi;
        System.out.println("Artisti nimi muudetud!");
    }
}