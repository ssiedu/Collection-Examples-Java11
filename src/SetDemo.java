
import java.util.TreeSet;

public class SetDemo {
     public static void main(String args[]){
        //HashSet<Integer> set=new HashSet<>();
        //LinkedHashSet<Integer> set=new LinkedHashSet<>();
        TreeSet<Integer> set=new TreeSet<>();
        set.add(10); 
        set.add(9); 
        set.add(5);
        set.add(40); 
        set.add(25);
        System.out.println(set);
        
        
    }
}
