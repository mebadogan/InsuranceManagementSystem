public class Individual extends Account {
    public Individual(User user){
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getInsurancePriceMonthly() * 1.5;
        insurance.setInsurancePriceMonthly(price);
        super.usersInsurance.add(insurance);
    }
}
