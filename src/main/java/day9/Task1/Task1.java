package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Василий", "Инженеры");
        Teacher teacher = new Teacher("Геннадий", "Алгебра");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}

class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }

}

class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.name = name;
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
        System.out.println("Этот студент с именем " + name);
    }
}

class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.name = name;
        this.subjectName = subjectName;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
        System.out.println("Этот преподаватель с именем " + name);
    }

    public String getSubjectName() {
        return subjectName;
    }
}