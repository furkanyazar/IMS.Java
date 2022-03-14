package entities.subs;

import entities.bases.Insurance;

public class CarInsurance extends Insurance {

    public CarInsurance(String name, double price, int periodOfValidityInMonths) {
        super("Car Insurance", 900, periodOfValidityInMonths);
    }

}
