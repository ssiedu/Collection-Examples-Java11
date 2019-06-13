
import java.util.ArrayList;


public class CollectionMethods {
    public static void main(String args[]) {

        ArrayList list1=new ArrayList();
        list1.add(10); list1.add(20); list1.add(30);
        
        ArrayList list2=new ArrayList();
        list2.add(40); list2.add(50); list2.add(60);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("___________________________________");
        
        list2.addAll(list1);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("___________________________________");
        
        list2.retainAll(list1);
        
        //list2.removeAll(list1);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("___________________________________");
        
        /*
        System.out.println(list2.containsAll(list1));
        list2.remove(new Integer(20));
        System.out.println(list2.containsAll(list1));
        */
        
        
        /*
        HashSet list1=new HashSet();
        //ArrayList list1=new ArrayList();
        System.out.println(list1.add(10));
        System.out.println(list1.add(20));
        System.out.println(list1.add(30));
        System.out.println(list1.add(20));
        System.out.println(list1);
        
        //System.out.println(list1.isEmpty());
        //System.out.println(list1.size());
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        //System.out.println(list1.isEmpty());
        //System.out.println(list1.size());
        boolean res=list1.contains(35);
        System.out.println(res);
        */
        
        
        
        
    }
}
