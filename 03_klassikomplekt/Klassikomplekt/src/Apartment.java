
public class Apartment {
double price;
int rooms;
Location location;
String name;
    public Apartment(double price, int rooms, Location location, String name){
        this.price = price;
        this.rooms = rooms;
        this.location = location;
        this.name = name;
    }
    public void getRoomCount(int roomCount){
        this.rooms = roomCount;
    }
    public double getPrice(int getRoomCount){
        if (getRoomCount >= 1) {
            return price;
        } else if (getRoomCount < 1) {
            return this.price*2;
        } else {
            return 0;
        }
    }
}