import java.util.Arrays;
import java.util.Collections;
 
public class Exercise1 {
    public static void main(String[] args)
    {
 
        
        Integer[] num = { 3,4,5,6,7,8 };

        int min = Collections.min(Arrays.asList(num));

        int max = Collections.max(Arrays.asList(num));
 
        System.out.println("Minimum number="+ min);
        System.out.println("Maximum number="+ max);
    }
}