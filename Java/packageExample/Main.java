import com.mypackage.Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee emp1 = new Employee(101, "Khush Mohamamd");
        System.out.println(emp1.toString());
        sc.close();
    }
}
