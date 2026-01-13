class Granfather
{
    String name="Madhukar";
    void display()
    {
  System.out.println("Name of Grandfather is "+name);
    }
}
class Father extends  Granfather
{
 String name="Vinod";
 void display()
    { super.display();
       System.out.println("Name of Grandfather is "+name);
       super.display();//we can use super keyword with method in starting or endin anywhere
    }
}
//using super keyword method in base  class and super class
public class Using_Super_Keyword1 {
    public static void main(String[] args) {
        Granfather f=new Father();
        f.display();

        Father f1=new Father();
        f1.display();

    }
}
