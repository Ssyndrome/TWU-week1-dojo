import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommy {
    public String toMommy(String str){
        if (percentage(str)>0.3 && Arrays.stream(str.split("")).anyMatch(i->"aeiou".contains(i))) {
            System.out.println("ok");
            return Arrays.stream(str.split("")).map(i-> "aeiou".contains(i)?"mommy":i).reduce("",(a, b)-> a+b);
        } else {
            return str ;
        }
    }

    private double percentage (String str){
        return Arrays.stream(str.split("")).filter(i->"aeiou".contains(i)).count()/str.length();
    }
}
