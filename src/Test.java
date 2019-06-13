
import java.util.ArrayList;

public class Test {

public static void main(String[] args) {
   
    ArrayList csStud=new ArrayList();
    ArrayList itStud=new ArrayList();
    csStud.add("AAA"); csStud.add("BBB"); csStud.add("CCC");
    itStud.add("PPP"); itStud.add("QQQ"); itStud.add("RRR");
    System.out.println(csStud);
    System.out.println(itStud);

    ArrayList allStud=new ArrayList();
    allStud.addAll(csStud);
    allStud.addAll(itStud);
    System.out.println(allStud);
    
    //We are removing all the students of cs branch from mainList
    
    //allStud.removeAll(csStud);
    //allStud.retainAll(csStud);
    allStud.clear();
    System.out.println(allStud);
    
  
    
    
}
    
}
