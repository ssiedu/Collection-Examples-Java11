import java.util.ArrayList;

class Data {
    int square;
    int cube;
}


public class Calculation {
    public static Data calculate(int n){
    
        Data ob=new Data();
        ob.square=n*n;
        ob.cube=n*n*n;
        return ob;
        
    }
    public static void main(String args[]) {
        
            Data result=calculate(4);
            System.out.println(result.square);
            System.out.println(result.cube);
        
    }
}
