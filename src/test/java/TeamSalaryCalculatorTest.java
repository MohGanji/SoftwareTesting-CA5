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
    Employee h1, h2, h3, m1, m2, m3, e1, e2, e3;
    private List<Employee> team;
    @Before
    public void init(){
         h1 = new Employee(0.75, 1, 8);
         h2 = new Employee(0.7, 1, 8);
         h3 = new Employee(0.8, 1, 8);
         m1 = new Employee(0.75, 1, 3);
         m2 = new Employee(0.7, 1, 3);
         m3 = new Employee(0.8, 1, 3);
         e1 = new Employee(0.75, 1, 0);
         e2 = new Employee(0.7, 1, 0);
         e3 = new Employee(0.8, 1, 0);
         team = new ArrayList<Employee>();
    }

    @Test
    public void test1() {
        team.add(h1);
        team.add(h2);
        team.add(h3);
        team.add(m1);
        team.add(m2);
        team.add(m3);
        team.add(e1);
        team.add(e2);
        team.add(e3);
        assertEquals(calculator.calculateTeamSalary(team, BASE_SALARY, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 58275, 0.0);
    }
    @Test
    public void test2() {
        team.add(h1);
        team.add(h2);
        team.add(m1);
        team.add(m2);
        team.add(e1);
        team.add(e2);
        team.add(e3);
        assertEquals(calculator.calculateTeamSalary(team, 50, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 43785, 0.0);
    }

    @Test
    public void test3() {
        team.add(h1);
        team.add(h2);
        team.add(h3);
        team.add(e1);
        assertEquals(calculator.calculateTeamSalary(team, 100000, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 27090, 0.0);
    }

    @Test
    public void test4() {
        team.add(m1);
        team.add(m2);
        team.add(m3);
        team.add(e1);
        team.add(e2);
        team.add(e3);
        assertEquals(calculator.calculateTeamSalary(team, 20000, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 21420, 0.0);
    }

    @Test
    public void test5() {
        team.add(e1);
        team.add(e2);
        team.add(e3);
        assertEquals(calculator.calculateTeamSalary(team, 10000, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 17850, 0.0);
    }

    @Test
    public void test6() {
        team.add(h1);
        team.add(h2);
        team.add(m1);
        team.add(m2);
        team.add(e1);
        team.add(e2);
        team.add(e3);
        assertEquals(calculator.calculateTeamSalary(team, 25019, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 43785, 0.0);
    }

    @Test
    public void test7() {
        team.add(e1);
        assertEquals(calculator.calculateTeamSalary(team, 1800, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 3600, 0.0);
    }

    @Test
    public void test8() {
        team.add(h1);
        team.add(h2);
        assertEquals(calculator.calculateTeamSalary(team, BASE_SALARY, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 7560, 0.0);
    }

    @Test
    public void test9() {
        team.add(h1);
        team.add(m1);
        team.add(m2);
        team.add(e1);
        team.add(e2);
        team.add(e3);
        assertEquals(calculator.calculateTeamSalary(team, 21780, HIGH_EXPERIENCE_COEF, MEDIUM_EXPERIENCE_COEF, HOURLY_WAGE), 21780, 0.0);
    }

}