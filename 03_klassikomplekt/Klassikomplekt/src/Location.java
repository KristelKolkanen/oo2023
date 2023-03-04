public class Location {
    String street;
    String country;
    int aptNr;
    String county;
    public Location(String street, String country, String county, int aptNr) {
        this.street = street;
        this.country = country;
        this.county = county;
        this.aptNr = aptNr;
    }
    public String getStreetName(){
        return street;
    }
}