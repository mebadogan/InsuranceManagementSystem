import java.time.LocalDate;

public class AutomobileInsurance extends Insurance{
    public AutomobileInsurance(int durationInMonths, LocalDate insuranceStartDate, User user) {
        super("Automobile Insurance", 100, durationInMonths, insuranceStartDate, user);
    }
}
