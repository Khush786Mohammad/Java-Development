import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.contains("n")).forEach(name -> System.out.println(name));

        Optional<String> nameStream = names.stream().filter(str->str.contains("i")).findFirst();
        System.out.println(nameStream.get());

        List<String> upperNames = names.stream().map((name) -> name.toUpperCase()).sorted().toList();
        System.out.println(upperNames);
    }
}
