
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    
    public static void main(String args[]){
        
        String s[]={"indore","bhopal","ujjain","delhi","mumbai"};
        List<String> list=Arrays.asList(s);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        
        
        /*
        for(String item:list){
            System.out.println(item);
        }
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
