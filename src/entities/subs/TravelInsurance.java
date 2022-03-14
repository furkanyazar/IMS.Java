package entities.subs;

import entities.bases.Insurance;

public class TravelInsurance extends Insurance {

    public TravelInsurance(String name, double price, int periodOfValidityInMonths) {
        super("Travel Insurance", 800, periodOfValidityInMonths);
    }

}
