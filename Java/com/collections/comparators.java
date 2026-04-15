import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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
}

class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.getAge(), s2.getAge());
        // return ((Integer)s1.getAge()).compareTo((Integer)s2.getAge());
    }
}

public class comparators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);   
        list.add(5);
        list.add(16);
        list.add(7);

        Collections.sort(list, Collections.reverseOrder()); 
        System.out.println(list);

        List<String> names = new ArrayList<String>();
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        Collections.sort(names, comparator);
        System.out.println(names);

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 21));
        students.add(new Student("David", 19));
        students.add(new Student("Alexa", 21));

        students.forEach(student -> {
            System.out.println(student);
        });

        System.out.println("Sorting students by age...");
        Collections.sort(students, new StudentAgeComparator());

         students.forEach(student -> {
            System.out.println(student);
        });

        Comparator<Student> specialComparator = Comparator.comparingInt(Student::getAge).thenComparing(Student::getName);
        Collections.sort(students, specialComparator);

        System.out.println("\n----------------------\n");
            students.forEach(student -> {
                System.out.println(student);
            });
    }
}
