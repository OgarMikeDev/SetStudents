import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> setStudents = new TreeSet<>();
        setStudents.add(new Student("Igor", 17, 89676400991l));
        setStudents.add(new Student("Anton", 18, 89676400992l));
        setStudents.add(new Student("Igor", 19, 89676400993l));
        setStudents.add(new Student("Igor", 17, 89676400994l));
        setStudents.add(new Student("Daniil", 17, 89676400994l));
        setStudents.add(new Student("Maxim", 25, 89676400996l));
        setStudents.add(new Student("Michail", 24, 89676400997l));
        Student.printAllStudents();
//        Student.removeStudent(89676400994l);
    }
}
