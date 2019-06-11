
import java.io.File;


public class Demo {

    public static Object get(int i){
       if(i==1){
            String s=new String("abc");
            return s;
       }else if(i==2){
            StringBuffer sb=new StringBuffer("xyz");
            return sb;
       }else{
            File f=new File("abcd");
            return f;
       }
    }
    
    public static void show(Object p) {

    }
    
    public static void main(String args[]){
        String s1=new String("abc");
        StringBuffer s2=new StringBuffer("xyz");
        File f1=new File("abcd");
        show(s1);
        show(s2);
        show(f1);
        
        
        
        
    }
}
