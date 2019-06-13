
import java.util.LinkedList;

public class ListDemo {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<>();
        //ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1,40);
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        /*
        for(int item:list){
            System.out.println(item);
        }
        */
        
    }
}
