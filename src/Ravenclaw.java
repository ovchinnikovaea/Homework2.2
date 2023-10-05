public class Ravenclaw extends hogwarts {
    private int smart; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creation; //творчество

    public Ravenclaw(String fullName, int powerOfMagic, int transgressionDistance, int smart, int wisdom, int wit, int creation) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void compareStudents(Ravenclaw student) {
        int sumOfSkills1 = this.getSmart() + this.getWisdom() + this.getWit() + this.getCreation();
        int sumOfSkills2 = student.getSmart() + student.getWisdom() + student.getWit() + student.getCreation();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(this.getFullName() + " лучший Коктевранец, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " лучший Коктевранец, чем " + this.getFullName());

        }
    }
}
