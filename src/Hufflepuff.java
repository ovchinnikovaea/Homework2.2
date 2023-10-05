public class Hufflepuff extends hogwarts {
    private int hardWork; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String fullName, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void compareStudents(Hufflepuff student) {
        int sumOfSkills1 = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int sumOfSkills2 = student.getHardWork() + student.getLoyalty() + student.getHonesty();
        if (sumOfSkills1 > sumOfSkills2) {
            System.out.println(this.getFullName() + " лучший Пуффендуец, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " лучший Пуффендуец, чем " + this.getFullName());
        }
    }
}
