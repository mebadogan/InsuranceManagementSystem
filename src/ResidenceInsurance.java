import java.time.LocalDate;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(int durationInMonths, LocalDate insuranceStartDate, User user) {
        super("Residence Insurance", 150.0, durationInMonths, insuranceStartDate, user);
    }
}
