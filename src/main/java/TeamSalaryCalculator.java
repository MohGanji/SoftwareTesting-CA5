import java.util.List;

public class TeamSalaryCalculator {

    private static int HIGH_EXPERIENCE=8;
    private static int MEDIUM_EXPERIENCE =3;
    private static double TEAM_AWARD_COEF=0.75;
    private static double INOVATIVE=0.75;

    public double calculateTeamSalary(List<Employee> teamMembers,
                                      int baseSalary, double highExperienceCoef, double mediumExperienceCoef, int hourlyWage) {
        double totalSalary = 0;
        int highExperienceCounter = 0;
        int mediumExperienceCounter = 0;
        int lowExperienceCounter = 0;
        double result;

        for (Employee employee : teamMembers) {
            int employeePresenceTime = employee.getPresenceTime();
            int employeeExperienceYears = employee.getExperienceYears();
            double employeeInnovationCoef = employee.getInnovationCoef();
            double salary = 0;
            if (employeeExperienceYears >= HIGH_EXPERIENCE){
                salary = employeePresenceTime*hourlyWage*highExperienceCoef;
                if(employeeInnovationCoef>=INOVATIVE){
                    salary = salary*1.2;
                }
                else{
                    salary = salary*0.9;
                }
                highExperienceCounter++;
            }
            else if (employeeExperienceYears >= MEDIUM_EXPERIENCE) {
                salary =  employeePresenceTime*hourlyWage*mediumExperienceCoef;
                if(employeeInnovationCoef>=INOVATIVE){
                    salary = salary*1.2;
                }
                mediumExperienceCounter++;
            }
            else{
                salary = employeePresenceTime*hourlyWage;
                lowExperienceCounter++;
                if(employeeInnovationCoef>=INOVATIVE){
                    salary = salary*1.2;
                }
            }
            totalSalary += salary;
        }


        if (lowExperienceCounter >= 3 && highExperienceCounter<=2 && mediumExperienceCounter<=2 && totalSalary>baseSalary) {
            result = (1 + TEAM_AWARD_COEF) * totalSalary;
        }
        else if(highExperienceCounter>2 || totalSalary>2*baseSalary){
            result = (1+TEAM_AWARD_COEF) * totalSalary;
        }
        else {
            result = totalSalary;
        }
        return result;
    }




}