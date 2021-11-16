package learn.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args)
    {
        LambdaInter lb= ()-> System.out.println("Hello");
        lb.m1();
        LambdaInter lb2= ()-> System.out.println("Knoldus");

//        StringOpr length2= str-> str.length();


        Function<String , Integer> length = str->str.length();

        System.out.println("String length:"+length.apply("helli"));

        DevideInter objDiv= (a,b)-> {
            try {
                return a/b;
            }
            catch (Exception e){
                System.out.println("Exception is "+e.getMessage());
                return 0;
            }
            finally {
                System.out.println("from finally");
            }
        };
        System.out.println(objDiv.divide(4,0));
        System.out.println("End of the program");


//        sorting an array of integers
        Integer[] numbers = {5, 12, 11, 7};
        Arrays.sort(numbers, (a, b) -> b-a);
        System.out.println(Arrays.toString(numbers));
    }
}
