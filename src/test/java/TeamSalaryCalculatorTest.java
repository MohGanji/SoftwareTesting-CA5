import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TeamSalaryCalculatorTest {
    private static int BASE_SALARY = 50000;
    private static double HIGH_EXPERIENCE_COEF = 1.2;
    private static double MEDIUM_EXPERIENCE_COEF = 1.1;
    private static int HOURLY_WAGE = 3000;
    private TeamSalaryCalculator calculator = new TeamSalaryCalculator();

    private static List<Employee> team = new ArrayList<Employee>();

    @Test
    public void someTest() {
        calculator.calculateTeamSalary(team, BASE_SALARY, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE);
    }

}