package entities.bases;

import java.time.LocalDate;

public class Insurance {

    private static int idTemp = 1;

    private int id;
    private String name;
    private double price;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;

    public Insurance(String name, double price, int periodOfValidityInMonths) {
        this.id = idTemp++;
        this.name = name;
        this.price = price;
        this.dateOfStart = LocalDate.now();
        this.dateOfEnd = LocalDate.now().plusMonths(periodOfValidityInMonths);
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

}
