import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    // fori - for loop | sout - print
    // String sonaline = "sõnaline muutuja" | char taheline = "a"
    // double komakohaga = 453.434243; 4bit täpsus |float komakohaga2 = 323.123432F; 32bit täpsus
    // boolean kahendv22rtus = true; 0 ja 1
    // byte pisikeNr = 100; | short lyhikeNr = 312; | long pikkNr = 3213212321L;
        Scanner scanner = new Scanner(System.in); //sisendi jaoks

        World world = new World( 10, 5);
        Player player = new Player(world.width, world.height);
        Dragon dragon = new Dragon(world.width, world.height);
        Orc orc = new Orc(world.width, world.height);

        Item sword = new Item(10, 1, "Mõõk", world.width, world.height);
        Item hammer = new Item(5, 3, "Haamer", world.width, world.height);
        Item boot = new Item(1, 10, "Saabas", world.width, world.height);

        // List -> muudetav
        List<Item> items = new ArrayList<>(Arrays.asList(sword, hammer, boot));

        //Item[] items1 = {sword, hammer, boot};
        // Array -> ei ole muudetav (read-only)

        world.printMap(world.width, world.height,
                player.Xcoordinate, player.Ycoordinate, player.symbol,
                dragon.Xcoordinate, dragon.Ycoordinate, dragon.symbol,
                orc.Xcoordinate, orc.Ycoordinate, orc.symbol, items);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            player.move(input, world);
            world.printMap(world.width, world.height,
                    player.Xcoordinate, player.Ycoordinate, player.symbol,
                    dragon.Xcoordinate, dragon.Ycoordinate, dragon.symbol,
                    orc.Xcoordinate, orc.Ycoordinate, orc.symbol, items);
            System.out.println();
            for (Item i : items) {
                if (i.Xcoordinate == player.Xcoordinate && i.Ycoordinate == player.Ycoordinate) {
                    player.item = i;
                    System.out.println("Korjasid eseme: " + player.item.name);
                    break;
                }
            }
            }
            input = scanner.nextLine();
        }
    }


}