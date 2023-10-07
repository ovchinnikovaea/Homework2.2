public class PrintedStudents {
    public void printStudents(Gryffindor[] students) {
        System.out.println("Студенты Гриффиндора: ");
        for (int i = 0; i < students.length; i++) {
            Gryffindor gryffindor = students[i];
            System.out.println("Имя - " + gryffindor.getFullName()
                    + " Сила магии - " + gryffindor.getPowerOfMagic()
                    + " Расстояние трансгрессии - " + gryffindor.getTransgressionDistance()
                    + " Благородство - " + gryffindor.getNobility()
                    + " Честь - " + gryffindor.getHonor()
                    + " Храбрость - " + gryffindor.getBravery());
        }
        System.out.println();
    }

    public void printStudents(Hufflepuff[] students) {
        System.out.println("Студенты Пуффендуя: ");
        for (int i = 0; i < students.length; i++) {
            Hufflepuff hufflepuff = students[i];
            System.out.println("Имя - " + hufflepuff.getFullName()
                    + " Сила магии - " + hufflepuff.getPowerOfMagic()
                    + " Расстояние трансгрессии - " + hufflepuff.getTransgressionDistance()
                    + " Трудолюбие - " + hufflepuff.getHardWork()
                    + " Верность - " + hufflepuff.getLoyalty()
                    + " Честность - " + hufflepuff.getHonesty());
        }
        System.out.println();
    }

    public void printStudents(Ravenclaw[] students) {
        System.out.println("Студенты Коктеврана: ");
        for (int i = 0; i < students.length; i++) {
            Ravenclaw ravenclaw = students[i];
            System.out.println("Имя - " + ravenclaw.getFullName()
                    + " Сила магии - " + ravenclaw.getPowerOfMagic()
                    + " Расстояние трансгрессии - " + ravenclaw.getTransgressionDistance()
                    + " Ум - " + ravenclaw.getSmart()
                    + " Мудрость - " + ravenclaw.getWisdom()
                    + " Остроумие - " + ravenclaw.getWit()
                    + " Творчество - " + ravenclaw.getCreation());
        }
        System.out.println();
    }

    public void printStudents(Slytherin[] students) {
        System.out.println("Студенты Слизерина: ");
        for (int i = 0; i < students.length; i++) {
            Slytherin slytherin = students[i];
            System.out.println("Имя - " + slytherin.getFullName()
                    + " Сила магии - " + slytherin.getPowerOfMagic()
                    + " Расстояние трансгрессии - " + slytherin.getTransgressionDistance()
                    + " Хитрость - " + slytherin.getCunning()
                    + " Решительность - " + slytherin.getDetermination()
                    + " Амбициозность - " + slytherin.getAmbition()
                    + " Находчивость - " + slytherin.getResourcefulness()
                    + " Жажда власти - " + slytherin.getLustForPpower());
        }
        System.out.println();
    }
}
