public class Item {
    int Xcoordinate;
    int Ycoordinate;
    int strength;
    int durability;
    String name;

    public Item(int strength, int durability, String name, int worldWidth, int worldHeight){
        this.Xcoordinate = getRandomCoordinate(worldWidth);
        this.Ycoordinate = getRandomCoordinate(worldHeight);
        this.strength = strength;
        this.durability = durability;
        this.name = name;
    }

    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
}
