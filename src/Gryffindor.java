public class Gryffindor extends hogwarts {

    private int nobility; //благородство
    private int honor; //честь
    private int bravery; //храбрость

    public Gryffindor(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareStudents(Gryffindor student) {
        int sumOfSkills1 = this.getNobility() + this.getHonor() + this.getBravery();
        int sumOfSkills2 = student.getNobility() + student.getHonor() + student.getBravery();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(this.getFullName() + " лучший Гриффиндорец, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " лучший Гриффиндорец, чем " + this.getFullName());

        }

    }
}
