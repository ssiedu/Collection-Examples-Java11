
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        String e1 = "one", e2 = "two", e3 = "three", e4 = "four", e5 = "five";
        LinkedList list = new LinkedList();
        list.add(e1);
        list.add(e2);
        System.out.println(list);
        list.addFirst(e3);
        System.out.println(list);
        list.addLast(e4);
        System.out.println(list);
        list.add(1,e5);
        System.out.println(list);
        list.remove(3);
        //list.removeFirst();
        //list.removeLast();
        System.out.println(list);
        
        
        
    }
}
