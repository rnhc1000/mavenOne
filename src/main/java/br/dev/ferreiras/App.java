package br.dev.ferreiras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> lists = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        List<Integer> pairsOnly = new ArrayList<>();

        lists.stream().forEach((e) -> {System.out.println(e); });
        lists.forEach(list -> System.out.print(list.toString()+ " "));
        lists.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        for(Integer a: lists){
            System.out.print(a + " ");
        }
        String s = "Hello World";
        System.out.println(s );
    }
}
