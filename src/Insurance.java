import java.time.LocalDate;

public abstract class Insurance {
    private String insuranceName;
    private double insurancePriceMonthly;
    private int durationInMonths;
    private LocalDate insuranceStartDate;
    private LocalDate insuranceEndDate;
    private User user;

    public Insurance(String insuranceName, double insurancePriceMonthly, int durationInMonths, LocalDate insuranceStartDate, User user) {
        this.insuranceName = insuranceName;
        this.insurancePriceMonthly = insurancePriceMonthly;
        this.durationInMonths = durationInMonths;
        this.insuranceStartDate = insuranceStartDate;
        this.insuranceEndDate = insuranceStartDate.plusMonths(durationInMonths);
        this.user = user;
    }

    public double calculate() {
        double annualFee = this.getDurationInMonths() * this.getInsurancePriceMonthly();
        return annualFee;
    }


    public void showInsuranceInfo() {
        System.out.println("Customer: " + this.getUser());
        System.out.println("Insurance: " + this.getInsuranceName());
        System.out.println("Insurance Start Date: " + this.getInsuranceStartDate());
        System.out.println("Insurance End Date: " + this.getInsuranceStartDate().plusMonths(this.getDurationInMonths()));
        System.out.println("Insurance Fee" + calculate());
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getInsurancePriceMonthly() {
        return insurancePriceMonthly;
    }

    public void setInsurancePriceMonthly(double insurancePriceMonthly) {
        this.insurancePriceMonthly = insurancePriceMonthly;
    }

    public LocalDate getInsuranceStartDate() {
        return insuranceStartDate;
    }

    public void setInsuranceStartDate(LocalDate insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}