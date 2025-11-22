package Java8Features.Stream_ForEachAndFilterMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {

        List<String> list5=new ArrayList<>();
        list5.add("A");
        list5.add("B");
        list5.add("c");
        list5.add("D");

        //printling list elements using forEach loop
        for(String s : list5){
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------");
        //printing list elements using streamapi
        list5.stream().forEach((t)-> System.out.println(t));

        Map<Integer, String> map = new HashMap<>() ;
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"D");

        map.forEach((key,value)->System.out.println(key+": "+value));
        map.entrySet().stream().forEach(o-> System.out.println(o));
    }
}
