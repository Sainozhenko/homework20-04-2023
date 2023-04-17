package homeworkToTommorow;

import java.util.function.Function;
import java.util.function.Predicate;

public  abstract  class AbstractTransformer {

public String transform(String input, Predicate<String> predicate, Function<String, String> function) {
    String[] words = input.split(" ");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        if (predicate.test(words[i])) {
            if (function != null) {
                sb.append(function.apply(words[i])+" ");
            } else {
                sb.append(words[i]+" ");
            }
        } else {
            sb.append(words[i]+" ");
        }
    }
    return sb.toString().trim();
    }
}
