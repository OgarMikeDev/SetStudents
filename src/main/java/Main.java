public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student(
                "Уникум", 30,
                "unikum.a.u@mail.ru", 896747029294l
        );

        Student secondStudent = new Student(
                "Будка", 47,
                "budka.a.u@mail.ru", 896747029294l
        );

        Student thirdStudent = new Student(
                "Будка", 47,
                "budka.a.u@mail.ru", 896747029294l
        );

        Student fourthStudent = new Student(
                "Камаз", 63,
                "kamaz.l.u@mail.ru", 896747029292l
        );

        Student fifthStudent = new Student(
                "Камаз", 63,
                "kamaz.l.u@mail.ru", 896747029292l
        );

        Student sixthStudent = new Student(
                "Додик", 21,
                "dodya.l.u@mail.ru", 896747029296l
        );

        Student.removeSelectedStudent(896747029292l);
        Student.getListAllStudents();
    }
}
