import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Pract {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("BAT", "ANT", "CAT", "BAT", "ANT");
 
     //  System.out.println(list);
        Set<String> distinct = new TreeSet<>(list);
//        Set<String> distinct = new TreeSet<>(list.stream().sorted().collect(Collectors.toList()));
        for (String s: distinct) {
        	if(!s.isBlank() )
            System.out.println(s + ": " + Collections.frequency(list, s));
        }
    }
}