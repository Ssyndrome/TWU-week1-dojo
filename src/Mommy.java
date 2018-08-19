import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Mommy {
    private final String vowels = "aeiou";

    public String toMommy(String str){
        if (shouldBeToMommy(str)){
            return Arrays.stream(simplify(str).split("")).map(i-> vowels.contains(i)?"mommy":i).reduce("",(a, b)-> a+b);
        }
        return str ;
    }

    private boolean shouldBeToMommy(String str) {
        return (double)(Arrays.stream(str.split("")).filter(i->vowels.contains(i)).count())/(double) str.length() > 0.3;
    }

    public String simplify(String str) {
        if(str.length()<=1) return str;
        return IntStream.range(0,str.length()).filter(i -> !(vowels.contains(str.substring(i,i+1)) && i!=str.length()-1 && vowels.contains(str.substring(i+1,i+2)))).mapToObj(i->str.substring(i,i+1)).reduce("",(a, b)-> a+b);
    }
}
