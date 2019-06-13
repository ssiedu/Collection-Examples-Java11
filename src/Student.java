public class Student {
    int rno,sem;
    String name,branch;
    
    public Student(int a, String b, String c, int d){
        rno=a; name=b; branch=c; sem=d;
    }
    public void show(){
        System.out.println(rno+","+name+","+branch+","+sem);
    }

    @Override
    public String toString() {
        return "Student{" + "rno=" + rno + ", sem=" + sem + ", name=" + name + ", branch=" + branch + '}';
    }
    
    
}
