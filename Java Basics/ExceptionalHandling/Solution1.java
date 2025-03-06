import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.salary;
    }
}

class CustomException extends Exception{
    @Override
    public String getMessage(){
        return "Negative Salary";
    }
    @Override
    public String toString(){
        return "Negative Salary";
    }
}

public class Solution1{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter Employee id: ");
            int id = sc.nextInt(); sc.nextLine();
            System.out.println("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Employee Salary: ");
            int salary = sc.nextInt();

            if(salary < 0)
                throw new CustomException();
            
            Employee emp1 = new Employee(id, name, salary);
            System.out.println(emp1.toString());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        sc.close();

    }
}