import java.util.Date;

public class Kasutaja {
    String kasutajanimi;
    String parool;
    String email;
    String eesnimi;
    String perenimi;
    boolean aktiivne;
    Date loomisAeg;
    Date kustutamisAeg;

    public Kasutaja(String kasutajanimi, String parool, String email, String eesnimi, String perenimi) {
        this.kasutajanimi = kasutajanimi;
        this.parool = parool;
        this.email = email;
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.aktiivne = true;
        this.loomisAeg = new Date();
        this.kustutamisAeg = null;
    }
    public String kustutaKasutaja(){
        this.aktiivne = false;
        this.kustutamisAeg = new Date();
        return "Kasutaja on kustutatud!";
    }
    public void muudaParool(String parool){
        this.parool = uusParool;
        System.out.println("Parool muudetud!");
    }
}
