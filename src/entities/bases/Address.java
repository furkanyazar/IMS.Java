package entities.bases;

public class Address {

    private static int idTemp = 1;

    private int id;
    private String address;
    private String city;
    private int zipCode;

    public Address(String address, String city, int zipCode) {
        this.id = idTemp++;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}
