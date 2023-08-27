import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsFromString {

    public static String removeDuplicateWords(String s){

        String[] words=s.split("\\s+");

        String s1= Arrays.stream(words).distinct().collect(Collectors.joining(" "));

        return s1;
    }

    public static void main(String[] args){
        String inputString = "Java is a programming language and Java is widely used in the software industry.";
        String result=removeDuplicateWords(inputString);
        System.out.println(result);
    }
}
