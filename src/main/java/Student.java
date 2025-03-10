import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private long phoneNumber;
    private static ArrayList<Student> listStudents = new ArrayList<>();

    public Student(String name, int age, Long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        listStudents.add(this);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public static void printAllStudents() {
        for (Student currentName : listStudents) {
            System.out.println("Parameters student \"" + currentName + "\", " +
                    "hash code student \"" + currentName.hashCode() + "\"");
        }
    }

    public static void removeStudent(long phoneNumber) {
        Iterator<Student> studentIterator = listStudents.iterator();
        while (studentIterator.hasNext()) {
            Student currentStudent = studentIterator.next();
            if (currentStudent.getPhoneNumber() == phoneNumber) {
                System.out.println("Студент " + currentStudent + " удалён!");
                studentIterator.remove();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(phoneNumber, student.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, phoneNumber);
    }

    @Override
    public int compareTo(Student currentStudent) {
        return getPhoneNumber().compareTo(currentStudent.getPhoneNumber());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
