package entities.bases;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private static int idTemp = 1;

    private int id;
    private String name;
    private User user;
    private List<Insurance> insurances;
    private Status status;

    public Account(String name, User user) {
        this.id = idTemp++;
        this.name = name;
        this.user = user;
        this.insurances = new ArrayList<>();
        this.status = Status.FAIL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
