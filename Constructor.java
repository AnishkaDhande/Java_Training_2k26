class student{
    int age ;
    String Name;
    int Rollno;
    
    student(int age,String Name,int Rollno)
    {
    this.age=age;
    this.Name= Name;
    this.Rollno=Rollno;
    }
    student()
    {
        this.age=0;
    this.Name= "Not Given";
    this.Rollno=0;
    }
     void display()
     {
        System.out.println("This is Student Info");
        System.out.println("Age is "+this.age);
       System.out.println("Name is "+this.Name);
        System.out.println("Rollno is "+this.Rollno);
     }
}
public class Constructor {
    public static void main(String args[])
    {
       student s1=new student();
       student s2=new student(17,"Anishka",42);
         s1.display();
         s2.display();
    }

    
}
