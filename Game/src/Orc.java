public class Orc {
    int Xcoordinate;
    int Ycoordinate;
    char symbol;

    public Orc(int worldWidth, int worldHeight) {
        this.Xcoordinate = getRandomCoordinate(worldWidth);
        this.Ycoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'O';
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}