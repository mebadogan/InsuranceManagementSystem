public class Enterprise extends Account{
    String companyName;
    public Enterprise(User user, String companyName){
        super(user);
        this.companyName = companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getInsurancePriceMonthly() * 2.0;
        insurance.setInsurancePriceMonthly(price);
        super.usersInsurance.add(insurance);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
