import java.time.LocalDate;

public class TravelInsurance extends Insurance{
    public TravelInsurance(int durationInMonths, LocalDate insuranceStartDate, User user) {
        super("Travel Insurance", 50.0, durationInMonths, insuranceStartDate, user);
    }
}
