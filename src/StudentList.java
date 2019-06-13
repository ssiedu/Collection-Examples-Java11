
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        ArrayList<Student> list=new ArrayList<>();
        
        for(int i=1; i<=3; i++){
            
            System.out.println("Enter Rno      : ");
            int rno=sc.nextInt();
            System.out.println("Enter Name     : ");
            String name=sc.next();
            System.out.println("Enter Branch   : ");
            String branch=sc.next();
            System.out.println("Enter Semester : ");
            int sem=sc.nextInt();
            //group four values in a single unit
            Student stud=new Student(rno,name, branch, sem);
            list.add(stud);
        }
        
        System.out.println("Your Students List : ");
        for(Student s:list){
            s.show();
        }
        
        
    }
    
}
