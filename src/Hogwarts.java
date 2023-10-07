public abstract class Hogwarts {

    private String fullName;
    private int powerOfMagic; //сила магии
    private int transgressionDistance; //расстояние трансгрессии

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void printStudents(Hogwarts[] students) {
        for (int i = 0; i < students.length; i++) {
            Hogwarts faculty = students[i];
            System.out.println("Имя " + faculty.getFullName()
                    + " Сила магии " + faculty.getPowerOfMagic()
                    + " Расстояние трансгрессии " + faculty.getTransgressionDistance());

        }
    }

    public void compareAnyStudents(Hogwarts student) {
        if (this.getPowerOfMagic() > student.getPowerOfMagic()) {
            System.out.println(this.getFullName() + " обладает большей силой магии, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " обладает большей силой магии, чем " + this.getFullName());

        }

        if (this.getTransgressionDistance() > student.getTransgressionDistance()) {
            System.out.println(this.getFullName() + " может трансгрессировать на большее расстояние, чем " + student.getFullName());
        } else {
            System.out.println(student.getFullName() + " может трансгрессировать на большее расстояние, чем " + this.getFullName());
        }
    }
}