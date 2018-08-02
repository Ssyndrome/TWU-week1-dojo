import java.util.ArrayList;
import java.util.List;

public class Mommy {
    public String toMommy(String str){
        if ("aeiou".contains(str)) {
            return "mommy";
        } else {
            return str ;
        }
    }
}
