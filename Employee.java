package Company;

public class Employee {

    private String FirstName;
    private String LastName;
    private String Email;
    private String address;
    private String contact;
    private String Password;

    public Employee(String firstName, String lastName, String email, String address, String contact, String password) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.address = address;
        this.contact = contact;
        this.Password = password;
    }



    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
