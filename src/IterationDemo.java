
import java.util.ArrayList;
import java.util.Iterator;


public class IterationDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10); list.add(20); list.add(30);
        list.add(40); list.add(50);
        
        //Iteration using iterators
        
        Iterator it=list.iterator();
        while(true){
            
            boolean b=it.hasNext();
            if(b==false)break;
            
            System.out.println(it.next());
        }
        
        
        
        
        
        
        /*
        Object ar[]=list.toArray();
        
        for(Object obj:ar){
            System.out.println(obj);
        }
        */
        
        /*
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        */
        
        /*
        for(int item:list){
            System.out.println(item);
        }
        */
        
    }
}
