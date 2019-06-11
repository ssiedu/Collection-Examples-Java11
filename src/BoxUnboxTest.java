public class BoxUnboxTest {

public static void show(Object p){
}
public static void disp(int i){
}
public static void main(String args[]){
    
    Integer ob1=new Integer(15);
    disp(5);
    disp(ob1);      //show(ob1.intValue());
    
    show("abc");
    show(10);       //show(new Integer(10));
    show(5.6);      //show(new Double(5.6));
    
}        


    
}
