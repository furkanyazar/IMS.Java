package entities.subs;

import entities.bases.Address;

public class BusinessAddress extends Address {

    private String companyName;
    private String taxAdministration;
    private String taxNumber;

    public BusinessAddress(String address, String city, int zipCode, String companyName, String taxAdministration,
            String taxNumber) {
        super(address, city, zipCode);
        this.companyName = companyName;
        this.taxAdministration = taxAdministration;
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTaxAdministration() {
        return taxAdministration;
    }

    public void setTaxAdministration(String taxAdministration) {
        this.taxAdministration = taxAdministration;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

}
