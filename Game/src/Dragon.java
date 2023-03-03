public class Dragon {
    int Xcoordinate;
    int Ycoordinate;
    char symbol;

    public Dragon(int worldWidth, int worldHeight) {
        this.Xcoordinate = getRandomCoordinate(worldWidth);
        this.Ycoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'D';
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}