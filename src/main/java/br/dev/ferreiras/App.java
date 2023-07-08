package br.dev.ferreiras;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> lists = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        lists.stream().forEach((e) -> {System.out.println(e); });
        lists.forEach(list -> System.out.print(list.toString()+ " "));

        for(Integer a: lists){
            System.out.print(a + " ");
        }
        String s = "Hello World";
        System.out.println(s );
    }
}
