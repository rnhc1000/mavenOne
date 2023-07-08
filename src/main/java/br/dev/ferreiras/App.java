package br.dev.ferreiras;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(Integer a: list){
            System.out.print(a + " ");
        }
        String s = "Hello World";
        System.out.println(s );
    }
}
