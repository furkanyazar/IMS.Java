package entities.subs;

import entities.bases.Insurance;

public class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(String name, double price, int periodOfValidityInMonths) {
        super("Residence Insurance", 700, periodOfValidityInMonths);
    }

}
