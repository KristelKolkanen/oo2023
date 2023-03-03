import java.util.List;

public class World {
    int width;
    int height;

    public World(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void printMap(int worldWidth, int worldHeight,
                         int playerXCoordinate, int playerYCoordinate, char playerSymbol,
                         int dragonXCoordinate, int dragonYCoordinate, char dragonSymbol,
                         int orcXCoordinate, int orcYCoordinate, char orcSymbol, List<Item> items) {
// teeme kasti
for (int y = 0; y < worldHeight; y++) {
    System.out.println(); //teeb lihtsalt uue rea
    for (int x = 0; x < worldWidth; x++) {
        if (y == 0 || y == worldHeight -1) {
            System.out.print("-");
        } else if (x == 0 || x == worldWidth -1) {
            System.out.print("|");
        } else {
            printCharacters(playerXCoordinate, playerYCoordinate, playerSymbol,
                    dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                    orcXCoordinate, orcYCoordinate, orcSymbol, y, x);
        }
    }
}
}
    private void printCharacters(int playerX, int playerY, char playerS,
                                int dragonX, int dragonY, char dragonS,
                                int orcX, int orcY, char orcS, int mapY, int mapX) {
if (playerX == mapX && playerY == mapY) {
    System.out.print(playerS);
} else if (dragonX == mapX && dragonY == mapY) {
    System.out.print(dragonS);
} else if (orcX == mapX && orcY == mapY) {
    System.out.print(orcS);
} else {
    System.out.print(" ");
    for (Item i: items) {
        if (i.Ycoordinate == y && )
    }
}
}
}
