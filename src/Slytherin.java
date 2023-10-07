public class Slytherin extends hogwarts {
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int lustForPpower; //жажда власти

    public Slytherin(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPpower) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPpower = lustForPpower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPpower() {
        return lustForPpower;
    }

    public void setLustForPpower(int lustForPpower) {
        this.lustForPpower = lustForPpower;
    }

    public void compareStudents(Slytherin student) {
        int sumOfSkills1 = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getLustForPpower();
        int sumOfSkills2 = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPpower();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(this.getFullName() + " лучший Слизеринец, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " лучший Слизеринец, чем " + this.getFullName());

        }
    }
}
