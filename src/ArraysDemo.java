
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String args[]){
        
        int ar[]={10,25,35,20,12,18,50,45,100,23};
        
        for(int tmp:ar){
            System.out.print(tmp+"  ");
        }
        System.out.println("Sorting Array..............");
        
        Arrays.sort(ar);
        for(int tmp:ar){
            System.out.print(tmp+"  ");
        }
        
        System.out.println("Searching 100 ");
        
        
        int idx=Arrays.binarySearch(ar, 118);
        System.out.println("Index of 118 : "+idx);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
