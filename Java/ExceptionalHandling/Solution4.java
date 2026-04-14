import java.util.Scanner;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class Solution4 {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        try {
            Class.forName("MyException");
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to load classs");
            e.printStackTrace();
        }
        try{
            if(n < 0)
                throw new MyException("Custom Exception Occurred");
        }catch(MyException e){
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("Program continues after handling the exception.");
    }
}
