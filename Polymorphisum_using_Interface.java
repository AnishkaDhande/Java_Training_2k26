interface Animal{
    void eat();
    void sleep();
}

class Dog1 implements Animal
{
   public void eat()
   {
    System.out.println("Dog is eating");
   }
   public void  sleep()
   {
    System.out.println("Dog is sleeping");
   }
}
public class Polymorphisum_using_Interface {
    public static void main(String[] args) {
          Animal a=new Dog1();
          a.eat();
          a.sleep();


    }
}
