
import java.util.TreeMap;

public class StudentInfo {
    public static void main(String args[]){
        Student s1=new Student(111,"AAA","CS",3);
        Student s2=new Student(112,"BBB","EC",2);
        Student s3=new Student(113,"CCC","EX",1);
        Student s4=new Student(114,"DDD","MECH",4);
        Student s5=new Student(115,"EEE","IT",5);
        TreeMap<Integer,Student> map=new TreeMap<>();
        //LinkedHashMap<Integer,Student> map=new LinkedHashMap<>();
        //HashMap<Integer,Student> map=new HashMap<>();
        map.put(111, s1);
        map.put(115, s5);
        map.put(113, s3);
        map.put(112, s2);
        map.put(114, s4);
        
        
        //Student st=map.get(112);
        //st.show();
        System.out.println(map);
        
        
        
        
        
    }
}
