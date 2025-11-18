package Java8Features.FunctionaInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier=()-> "Hi I am Java";
       // System.out.println(supplier.get());

        List<String> list3= Arrays.asList();
        System.out.println(list3.stream().findAny().orElseGet(()-> "Hi vaish"));
    }
}
