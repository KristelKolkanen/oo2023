public class Client {
    String email;
    String firstname;
    String lastname;
    String phoneNr;
    public Client(String email, String firstname, String lastname, String phoneNr) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNr = phoneNr;
    }
    public String fullname(){
        return firstname + " " + lastname;
    }
}