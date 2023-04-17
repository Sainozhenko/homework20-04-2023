package homeworkToTommorow;

import java.util.function.Function;
import java.util.function.Predicate;

/*Решить задачу 2 из предыдущего домашнего задания другим методом - без интерфейсов. Использовать свойства наследования классов (абстрактные классы).

        Метод должен позволять изменять слова в строке следующим образом:
        1. при длине слова= 3, изменять все буквы этого слова на заглавные
        2. при длине слова= 4, изменить все буквы слова на строчные
        3. при длине слова= 5, изменить все буквы слова на звездочки
        Протестировать.

 */
public class Transformer extends AbstractTransformer {


    public static void main(String[] args) {

        Transformer transformer = new Transformer();
        String input = "AAA BBB deF cDkld cccc";
        Predicate<String> predicate = s -> s.length() == 3;
        Function<String, String> function = s -> s.toUpperCase();
        System.out.println(transformer.transform(input, predicate, function));

        Predicate<String> predicate1 = s -> s.length() == 4;
        Function<String, String> function1 = s -> s.toLowerCase();
        System.out.println(transformer.transform(input, predicate1, function1));

        Predicate<String> predicate2 = s -> s.length() == 5;
        Function<String, String> function2 = s -> "*****";
        System.out.println(transformer.transform(input, predicate2, function2));

    }

    }
