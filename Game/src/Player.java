public class Player {
    int Xcoordinate; // täisarvuline number
    int Ycoordinate;
    char symbol;
    Direction direction;

    // constructor
    public Player(int worldWidth, int worldHeight) {
        this.Xcoordinate = getRandomCoordinate(worldWidth);
        this.Ycoordinate = getRandomCoordinate(worldHeight);
        this.symbol = 'X';
        this.direction = Direction.UP;
    }

    private static int getRandomCoordinate(int worldDimension) {
        // castimine ehk teisendamine ühest tüübist teise
        return (int) (Math.random() * (worldDimension - 2) + 1);
        // returni järel tuleb täisarv
    }

    // public tähendab, et mõni teine klass saab ka seda funktsiooni välja kutsuda
    // private tähendab, et seda funktsiooni saab ainult sellest klassis kasutada
    public void move(String input, World world) {
        if (input.equals("w")) {
            this.direction = Direction.UP;
        } else if (input.equals("s")) {
            this.direction = Direction.DOWN;
        } else if (input.equals("a")) {
            this.direction = Direction.LEFT;
        } else if (input.equals("d")) {
            this.direction = Direction.RIGHT;
        }
        if (direction.equals(Direction.UP) && this.Ycoordinate > 1) {
            this.Ycoordinate = this.Ycoordinate - 1;
        } else if (direction.equals(Direction.DOWN) && this.Ycoordinate < world.height-2) {
            this.Ycoordinate = this.Ycoordinate + 1;
        } else if (direction.equals(Direction.LEFT) && this.Xcoordinate > 1) {
            this.Xcoordinate = this.Xcoordinate - 1;
        } else if (direction.equals(Direction.RIGHT) && this.Xcoordinate < world.width-2) {
            this.Xcoordinate = this.Xcoordinate + 1;
        }
    }
}