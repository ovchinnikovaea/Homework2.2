public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", 95, 78, 75, 70, 80),
                new Gryffindor("Hermione Granger", 70, 90, 80, 65, 50),
                new Gryffindor("Ron Weasley", 60, 73, 70, 60, 55)
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah Smith", 65, 88, 82, 95, 74),
                new Hufflepuff("Cedric Diggory", 58, 35, 98, 69, 86),
                new Hufflepuff("Justin Finch-Fletchley", 66, 39, 61, 59, 64)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang", 81, 84, 79, 95, 40, 96),
                new Ravenclaw("Padma Patil", 34, 61, 71, 64, 59, 54),
                new Ravenclaw("Marcus Belby", 50, 74, 87, 69, 91, 96)
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", 82, 58, 60, 91, 84, 52, 74),
                new Slytherin("Graham Montague", 98, 62, 44, 52, 81, 30, 31),
                new Slytherin("Gregory Goyle", 72, 55, 100, 89, 59, 54, 43)
        };


        PrintedStudents printedStudents = new PrintedStudents();
        printedStudents.printStudents(gryffindors);
        printedStudents.printStudents(hufflepuffs);
        printedStudents.printStudents(ravenclaws);
        printedStudents.printStudents(slytherins);
        Gryffindor gryffindor = gryffindors[1];
        gryffindor.compareStudents(gryffindors[2]);

        Hufflepuff hufflepuff = hufflepuffs[1];
        hufflepuff.compareStudents(hufflepuffs[2]);

        Ravenclaw ravenclaw = ravenclaws[0];
        ravenclaw.compareStudents(ravenclaws[2]);

        Slytherin slytherin = slytherins[1];
        slytherin.compareStudents(slytherins[2]);

        hogwarts student = gryffindors[1];
        student.compareAnyStudents(slytherins[1]);
    }
}