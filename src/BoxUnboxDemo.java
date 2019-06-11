
import java.util.LinkedList;

public class BoxUnboxDemo {
    public static void main(String args[]){
        
        LinkedList list=new LinkedList();
        list.add("indore");
        list.add("java");
        list.add(new Integer(55));
        list.add(new Double(6.7));
        list.add(44L);
        list.add(2.3f);
        list.add(true);
        
        /*
        Stack stk=new Stack();
        stk.push("abc");
        stk.push("xyz");
        stk.push(10);
        stk.push(2.5);
        
        Double d1=(Double)stk.pop();
        System.out.println(d1+2);
        System.out.println(d1*4);
        */
        
        
    }
}
