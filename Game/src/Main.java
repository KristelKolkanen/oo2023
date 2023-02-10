public class Main {
    // fori - for loop | sout - print
    // String sonaline = "sõnaline muutuja" | char taheline = "a"
    // double komakohaga = 453.434243; 4bit täpsus |float komakohaga2 = 323.123432F; 32bit täpsus
    // boolean kahendv22rtus = true; 0 ja 1
    // byte pisikeNr = 100; | short lyhikeNr = 312; | long pikkNr = 3213212321L;
    public static void main(String[] args) {
        System.out.println("Game!");
        int playerXCoordinate = 3; // sellesse muutujasse saab anda ainult täisarvulisi numbreid
        int playerYCoordinate = 3;
        int dragonXCoordinate = 6;
        int dragonYCoordinate = 2;
        int orcXCoordinate = 5;
        int orcCoordinate = 1;
        // teeme kasti
                        //kõrgus
        for (int y = 0; y < 5; y++) {
                    //teeb lihtsalt uue rea
            System.out.println();
                        //laius
            for (int x = 0; x < 10; x++) {
                if (y == 0 || y == 4) {
                    System.out.print("-");
                } else if (x == 0 || x == 9) {
                    System.out.print("|");
                } else {
                    if () {

                    } else if () {

                    } else if () {

                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}