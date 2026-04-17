import java.util.Arrays;
import java.util.*;
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }
};

public class MethodRefEx {
    public static void main(String[] args) {
        List<String> studentList = Arrays.asList("Khush","Jason","Mirza","Honey");

        List<Student> myStudents = studentList.stream().map((std) -> new Student(std,18)).toList();
        myStudents.forEach((stds) -> System.out.println(stds.toString()));

        studentList.get(2).length();
    }
}
