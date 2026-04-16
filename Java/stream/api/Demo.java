import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.Arrays;
public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,5,6,8,12);
        numbers.forEach(num -> {
            if(num % 2 == 0){
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        });

        numbers.stream().filter((num) -> num >= 10).forEach(value -> System.out.println(value));
        int sum =numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.println("Sum: " + sum);

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Stream<Integer> result =  
            nums.stream()
            .filter((num) -> num % 2 == 0)
            .map((val) -> val*val);
        result.forEach((vals) -> System.out.println(vals)); 
    }
}
