public class Location {
    String street;
    String country;
    int aptNr;
    String city;
    public Location(String street, String country, String city, int aptNr) {
        this.street = street;
        this.country = country;
        this.city = city;
        this.aptNr = aptNr;
    }
    public String getStreetName(){
        return street;
    }
}