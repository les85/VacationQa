import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void testCalculateVacations1(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();


        int actual = service.calculateVacations(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }


}
