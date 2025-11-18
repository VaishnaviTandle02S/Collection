package Java8Features.FunctionaInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate=(t)->t%2==0;
        predicate.test(5);

        List<Integer> list2= Arrays.asList(1,2,3,4,5);
        list2.stream().filter(predicate).forEach((t)-> System.out.println("print :"+t));
    }
}
