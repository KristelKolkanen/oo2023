public class Main {
    // fori - for loop | sout - print
    // String sonaline = "sõnaline muutuja" | char taheline = "a"
    // double komakohaga = 453.434243; 4bit täpsus |float komakohaga2 = 323.123432F; 32bit täpsus
    // boolean kahendv22rtus = true; 0 ja 1
    // byte pisikeNr = 100; | short lyhikeNr = 312; | long pikkNr = 3213212321L;
    public static void main(String[] args) {
        System.out.println("Game!");
        int worldWidth = 10;
        int worldHeight = 5;
        int playerXCoordinate = getRandomCoordinate(worldWidth); // sellesse muutujasse saab anda ainult täisarvulisi numbreid
        int playerYCoordinate = getRandomCoordinate(worldHeight); // castimine ehk teisendamine ühest tüübist teise
        char playerSymbol = 'X';
        int dragonXCoordinate = getRandomCoordinate(worldWidth);
        int dragonYCoordinate = getRandomCoordinate(worldHeight);
        char dragonSymbol = 'D';
        int orcXCoordinate = getRandomCoordinate(worldWidth);
        int orcYCoordinate = getRandomCoordinate(worldHeight);
        char orcSymbol = 'O';
        // teeme kasti
        for (int y = 0; y < worldHeight; y++) {
            System.out.println(); //teeb lihtsalt uue rea
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1) {
                    System.out.print("-");
                } else if (x == 0 || x == worldWidth-1) {
                    System.out.print("|");
                } else {
                    printCharacters(playerXCoordinate, playerYCoordinate, playerSymbol,
                            dragonXCoordinate, dragonYCoordinate, dragonSymbol,
                            orcXCoordinate, orcYCoordinate, orcSymbol, y, x);
                }
            }
        }
    }
    private static int getRandomCoordinate(int worldDimension) {
        return (int) (Math.random() * (worldDimension - 2) + 1);
    }
    // void on tagastustüüp ehk mis tüüp järgneb return kirjele
    // void tähendab, et ei tagastatagi midagi
    private static void printCharacters(int playerX, int playerY, char playerS,
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
        }
    }
}