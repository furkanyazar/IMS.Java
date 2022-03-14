package entities.subs;

import entities.bases.Insurance;

public class HealthInsurance extends Insurance {

    public HealthInsurance(String name, double price, int periodOfValidityInMonths) {
        super("Health Insurance", 600, periodOfValidityInMonths);
    }
    
}
