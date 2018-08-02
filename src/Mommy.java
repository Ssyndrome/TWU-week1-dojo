import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommy {
    public String toMommy(String str){
        if (Arrays.stream(str.split("")).anyMatch(i->"aeiou".contains(i))) {
            System.out.println("ok");
            return Arrays.stream(str.split("")).map(i-> "aeiou".contains(i)?"mommy":i).reduce("",(a, b)-> a+b);
        } else {
            return str ;
        }
    }
}
