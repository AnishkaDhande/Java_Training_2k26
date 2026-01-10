class Student
{
  String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
}
public class Encap {
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("Anishka");
        System.out.println("Student name is "+s1.getName());
        
    }
}
