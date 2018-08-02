import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Mommy {
    public String toMommy(String str){
        if (percentage(str)>0.3 && Arrays.stream(str.split("")).anyMatch(i->"aeiou".contains(i))) {
            return Arrays.stream(simplify(str).split("")).map(i-> "aeiou".contains(i)?"mommy":i).reduce("",(a, b)-> a+b);
        } else {
            return str ;
        }
    }

    public double percentage (String str){
        return (double) Arrays.stream(str.split("")).filter(i->"aeiou".contains(i)).count()/str.length();
    }

    public String simplify(String str) {
        if(str.length()<=1) return str;
        return IntStream.range(0,str.length()).filter(i -> !("aeiou".contains(str.substring(i,i+1)) && "aeiou".contains(str.substring(i+1,i+2)))).mapToObj(i->str.substring(i,i+1)).reduce("",(a, b)-> a+b);
    }
}
