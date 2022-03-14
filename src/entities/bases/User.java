package entities.bases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private static int idTemp = 1;

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String profession;
    private int age;
    private List<Address> addresses;
    private LocalDate dateOfLastSeen;

    public User(String firstName, String lastName, String email, String password, String profession, int age) {
        this.id = idTemp++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.profession = profession;
        this.age = age;
        this.addresses = new ArrayList<>();
        dateOfLastSeen = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public LocalDate getDateOfLastSeen() {
        return dateOfLastSeen;
    }

    public void setDateOfLastSeen(LocalDate dateOfLastSeen) {
        this.dateOfLastSeen = dateOfLastSeen;
    }

}
