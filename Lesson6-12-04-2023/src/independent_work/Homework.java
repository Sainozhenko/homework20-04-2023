package independent_work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework {
    public static void main(String[] args) {
    String abc = "The great world";
        System.out.println( replaceWord(abc));
        System.out.println( reverseWord(abc));
    }
    public static String readIntoString1(File fileName)throws IOException {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine())!=null){
                sb.append(" ").append(line);

            }
        }
        return sb.toString();
    }
    public static String replaceWord(String words){
        String[]word = {};
        StringBuilder sb = new StringBuilder(words);
        for(int i =0 ; i < word.length; i++) {
            sb.append(word[i]);
        }
        sb.reverse();
        return sb.toString();
    }
    public static String reverseWord(String words) {
        String[] wordsArray = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = wordsArray.length - 1; i >= 0; i--) {

            sb.append(wordsArray[i]).append(" ");
        }
        return sb.toString();
    }
}
