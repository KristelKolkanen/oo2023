import java.util.List;

public class Kolmnurk {
    List<Double> xCoords;
    List<Double> yCoords;

    public Kolmnurk(List<Double> xCoords, List<Double> yCoords){
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    public double lisaJaAnnaYmbermoot(double newX, double newY){
        xCoords.add(newX);
        yCoords.add(newY);
        return 2.0; //ei tee seda osa
    }
}
