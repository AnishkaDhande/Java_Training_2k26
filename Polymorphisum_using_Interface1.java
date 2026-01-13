interface Vehical
{
    void run();
    void brake();
    void stop();

}
class Car implements Vehical{
    public void run()
    {
        System.out.println("car is Running");
    }
     public void stop()
     {
        System.out.println("Stop the Car");
     }
     public void brake()
     {
     System.out.println("Apply Brake car by brake cylinder");
     }
}
class Truck implements Vehical{
      public void run()
      {
        System.out.println("Truck is On the Way");
      }
      public void brake()
      {
        System.out.println("Apply Brake truck by gas cylinder");
      }
      public void stop()
      {
        System.out.println("sotp the Truck");
      }
}
public class Polymorphisum_using_Interface1 {
    public static void main(String[] args) {
        Vehical v;
        v= new Car();
        v. run();
        v.stop();
        v.brake();
        v=new Truck();
        v. run();
        v.stop();
        v.brake();

    }
}
