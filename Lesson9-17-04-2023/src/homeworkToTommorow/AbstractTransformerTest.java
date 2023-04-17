package homeworkToTommorow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class AbstractTransformerTest {

    private AbstractTransformer transformer;

    String input;

    Predicate<String> predicate;

    Function<String,String> function;

    @BeforeEach
    public void init(){
        transformer = new Transformer();
        input = "AAA BBB deF cDkld bBbd";
    }
    @Test
    public void test_empty (){
        input="";
        predicate = s ->s.length()==3;
        function = s-> s.toLowerCase();
        assertEquals(input,transformer.transform(input,predicate,function));
    }

    @Test
    public void test_3_LowerCase (){
        String expected = "aaa bbb def cDkld bBbd";
        predicate = s ->s.length()==3;
        function = s-> s.toLowerCase();
        assertEquals(expected,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_3_UpperCase (){
        String expected = "AAA BBB DEF cDkld bBbd";
        predicate = s ->s.length()==3;
        function = s-> s.toUpperCase();
        assertEquals(expected,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_4_LowerCase (){
        String expected = "AAA BBB deF cDkld bbbd";
        predicate = s ->s.length()==4;
        function = s-> s.toLowerCase();
        assertEquals(expected,transformer.transform(input,predicate,function));
    }

    @Test
    public void test_4_UpperCase (){
        String expected = "AAA BBB deF cDkld BBBD";
        predicate = s ->s.length()==4;
        function = s-> s.toUpperCase();
        assertEquals(expected,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_5_Stars (){
        String expected = "AAA BBB deF **** bBbd";
        predicate = s ->s.length()==5;
        function = s-> "****";
        assertEquals(expected,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_5_LowerCase (){
        String expected = "AAA BBB deF cdkld bBbd";
        predicate = s ->s.length()==5;
        function = s-> s.toLowerCase();
        assertEquals(expected,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_5_UpperCase (){
        String expected = "AAA BBB deF CDKLD bBbd";
        predicate = s ->s.length()==5;
        function = s-> s.toUpperCase();
        assertEquals(expected,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_nothingChanged (){
        input ="aa bbbbbbbbbbbbbbbbb";
        predicate = s ->s.length()==5;
        function = s-> s="****";
        assertEquals(input,transformer.transform(input,predicate,function));
    }
    @Test
    public void test_nothingChanged1 (){
        input ="aa bbbbbbbbbbbbbbbbb";
        predicate = s ->s.length()==4;
        function = s-> s.toLowerCase();
        assertEquals(input,transformer.transform(input,predicate,function));
    }

    @Test
    public void test_nothingChangedUpper (){
        input ="aa bbbbbbbbbbbbbbbbb";
        predicate = s ->s.length()==4;
        function = s-> s.toUpperCase();
        assertEquals(input,transformer.transform(input,predicate,function));
    }

    @Test
    public void test_nothingChangedOnlySpace (){
        input ="b b b b b b b b b b b b b b b b b";
        predicate = s ->s.length()==5;
        function = s-> s.toUpperCase();
        assertEquals(input,transformer.transform(input,predicate,function));
    }


}