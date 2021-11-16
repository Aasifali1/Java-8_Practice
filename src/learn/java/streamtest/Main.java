package learn.java.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static List<String> students = new ArrayList<>(Arrays.asList("Aasif", "Aasif", "Mca", "Ansari", "Bca","Ali", "B.tech"));
    private static List<Integer> numbers = new ArrayList<>(Arrays.asList(1,4,2,3,6,9,8,5,4));

    private static List<Integer> marks = new ArrayList<Integer>(Arrays.asList(2,80,45,2,33,69,78));

    static void test2(){

        List<Integer> mark = marks.stream().sorted((t1,t2)-> -t2.compareTo(t1)).collect(Collectors.toList());

//         marks.stream().forEach(integer -> {
//            System.out.println(integer);
//            });
        students.stream().map(number->number.length()).collect(Collectors.toList());

        System.out.println(mark);
    }


    static void test(){
        Arrays.stream(new int[] {1,2,3}).map(n->2*n+1).average().ifPresent(System.out::println);
        Arrays.asList("a1","a2","a3").stream().findFirst().ifPresent(System.out::println);
        Stream.of("a1","a2","a3").findFirst().ifPresent(System.out::println);
    }

    public static void main(String[] args) {
    Main.test2();

//        System.out.println(students.stream().filter(i->i.equals("Aasif")).collect(Collectors.toList()));
//        System.out.println(students.stream().filter(s->s.equals("Aasif")).map(s-> s+" Ali").collect(Collectors.toList()));
//        System.out.println(students.stream().filter(s->s.equals("Aasif")).count());
//        System.out.println(students.remove(1));
//
////        Comparator Interface
//        System.out.println(numbers.stream().sorted((t, t1) ->(t<t1)?1:(t>t1)?-1:0).collect(Collectors.toList()));
//
////        Customized sorting
//        System.out.println(students.stream().sorted((s, t1) -> (s.length()<t1.length()?-1:(s.length()>t1.length())?1:s.compareTo(t1))).collect(Collectors.toList()));
//
////        Comparable Interface
//        System.out.println(numbers.stream().sorted((t, t1) ->t.compareTo(t1)).collect(Collectors.toList()));
//
////        Default natural sorting order
//        System.out.println(students.stream().sorted().collect(Collectors.toList()));
//
////      min and max method
//        System.out.println(numbers.stream().min((t2, t1) ->t2.compareTo(t1)).get());
//        System.out.println(numbers.stream().max((t2, t1) ->t2.compareTo(t1)).get());
//
////        foreach() method
//        numbers.stream().forEach(integer ->System.out.println("Square of "+integer+" is "+integer*integer));
//
////      How to get array from stream of objects
//        Integer[] arr = numbers.stream().toArray(Integer[]::new);
//        Arrays.stream(arr).forEach(System.out::print);
//
////        TO get stream of array objects
//        Stream.of(arr).forEach(System.out::print);


    }

}
