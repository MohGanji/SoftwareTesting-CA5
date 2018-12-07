public class Employee {
    private double innovationCoef;
    private int presenceTime;
    private int experienceYears;


    public Employee( double innovationCoef, int presenceTime, int experienceYears) {
        this.innovationCoef = innovationCoef;
        this.presenceTime = presenceTime;
        this.experienceYears = experienceYears;
    }

    public double getInnovationCoef() {
        return innovationCoef;
    }

    public void setInnovationCoef(double innovationCoef) {
        this.innovationCoef = innovationCoef;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }



    public int getPresenceTime() {
        return presenceTime;
    }
}


