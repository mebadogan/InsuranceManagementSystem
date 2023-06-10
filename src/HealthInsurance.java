import java.time.LocalDate;

public class HealthInsurance extends Insurance {
    public HealthInsurance(int durationInMonths, LocalDate insuranceStartDate, User user) {
        super("Health Insurance", 200.0, durationInMonths, insuranceStartDate, user);
    }
}
