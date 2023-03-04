public class Booking {
    Client client;
    Apartment apartment;
    public Booking(Client client, Apartment apartment){
        this.client = client;
        this.apartment = apartment;
    }
    public void getBookingPrice(){
        this.apartment.getPrice(3);
    }
}
