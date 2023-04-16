package homeworkToMonday;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //1. Конкатинировать строки а и б

        BinaryOperator<String> strToInt = (a, b) -> Integer.parseInt(a)+(b);

        System.out.println(strToInt.apply("10","24"));

        //2. если длина строки = 3 вернуть true

        Predicate<String> isPositive = str -> str.length()==3;

        System.out.println("check if length is 3");

        System.out.println( isPositive.test("abc"));

        System.out.println( isPositive.test("abcd"));
        //вывести на экран строку в виде !стринг!

        Consumer<String> consumer = s -> System.out.println("!"+s+"!");

        System.out.println("printing !s!");

        consumer.accept("abc");
        UnaryOperator<String> checking = str -> str.length()==4?"****": str;

        System.out.println(checking.apply("check"));

        System.out.println(checking.apply("chec"));

        Supplier<String> supplier = () -> "Hello world";

        System.out.println(supplier.get());

        // From work time interfaces
        Predicate<Integer>isd = a->a%2==0;
        System.out.println(isd.test(44));

        Predicate<Double>isdD = a->a%4.0==0;
        System.out.println(isdD.test(200.0));

        Predicate<String>isPartS = s -> s.contains("bc");
        System.out.println(isPartS.test("abcd"));

        int[]ints= {1,50,80,10,3,9};
        Predicate<Integer> isPositiv = num -> num>10;
        System.out.println(sum1(ints,isPositiv));


        Function<String, Person> personCreator = name -> new Person("Barak");
        Person person = personCreator.apply("Jack");
        System.out.println(person.name);


        Supplier<Person> personCreate = () -> new Person("Jack");
        Person human = personCreate.get();
        System.out.println(human.name);


    }
    public static int sum1 (int[]ints,Predicate predicate){
        int sum =0;
        for(int num : ints ){
            if(predicate.test(num))
                sum+=num;
        }
        return sum;
    }
}
