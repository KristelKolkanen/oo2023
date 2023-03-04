import java.util.Date;
public class Main2 {
    public static void main2(String[] args) {

        Client client1 = new Client("email1@gmail.com", "Joe", "Black", "3684982983");
        Location loc1 = new Location("Aia", "Eesti", "Tallinn", 3);
        Apartment apt1 = new Apartment(70, 2, loc1, "Aia korter");
        Booking book1 = new Booking(client1, apt1);
        apt1.getRoomCount(3);
        apt1.getPrice(3);
        book1.getBookingPrice();
        client1.fullname();
        loc1.getStreetName();

    }
}