import java.util.*;
import java.util.function.Function;

@FunctionalInterface
interface FunctionalModifier {
    int increment(int a);
}
public class Main {
    public static void main(String[] args) {
        Function<Integer, String> xyz = i -> Integer.toString(i);

        System.out.println(xyz.apply(100));

        FunctionalModifier f = n -> n + 7;
        System.out.println(f.increment(42));

        List<String> list = Arrays.asList("one", "two", "three");

        System.out.println("\nfor loop: ");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nforEach with function argument: ");
        list.forEach(System.out::println);

        System.out.println("\nforEach with lambda expression: ");
        list.forEach(s -> System.out.println(s));
    }
}