package Java8Features.Demo;

import java.util.List;
import java.util.Spliterator;

public class Demo {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C", "D");

        Spliterator<String> spliterator = list.spliterator();

        // Process elements one-by-one
        spliterator.forEachRemaining(System.out::println);

    }
}
