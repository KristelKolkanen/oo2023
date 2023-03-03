import java.util.Date;
import java.util.List;

public class Registreerimine {
    Date tegemiseAeg;
    String artistiNimi;
    List<String> singlid;
    boolean avalikustatud;

    public Registreerimine(String artistiNimi){
        this.tegemiseAeg = new Date();
        this.artistiNimi = artistiNimi;
        this.avalikustatud = false;
    }
    public void muudaAvalikuks(){
        this.avalikustatud = true;
    }
   /*  public LisaSingel(List<String> singlid){
		this.singlid = singlid;
        singlid.add("uusSingel1");
		singlid.add("uusSingel2"); 
    }*/

    public String kasOnAvalik(){
        if (avalikustatud) {
            return "Singel on avalikustatud";
        } else {
            return "Singel on avalikustamata";
        }
    }
}
