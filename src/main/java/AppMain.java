import de.neuefische.objects.models.Student;
import de.neuefische.objects.models.StudentDB;

public class AppMain {
    public static void main(String[] args) {
        Student[] studentArray = {new Student("Peter", "Pan", "42"), new Student("Heiner", "Lauterbach", "100"), new Student("111", "222" , "333")};
        Student wayne = new Student("Boris","Palmer","42");

        StudentDB bestDB = new StudentDB(studentArray);
        System.out.println(bestDB.toString());

        bestDB.addStudent(wayne);
        System.out.println(bestDB.toString());

        bestDB.removeStudent(wayne);
        System.out.println(bestDB.toString());

        System.out.println(bestDB.randomStudent().toString());
        System.out.println(bestDB.randomStudent().toString());
        System.out.println(bestDB.randomStudent().toString());
        System.out.println(bestDB.randomStudent().toString());
        System.out.println(bestDB.randomStudent().toString());
    }
}
