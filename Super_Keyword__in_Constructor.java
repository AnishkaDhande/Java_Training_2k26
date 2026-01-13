class Animal{
    Animal()
    {
        System.out.println("animal is created");
    }
}
class Dog extends Animal{
    Dog()
    {
        super();
        System.out.println("Dog is created");
        
    }
    
}
public class Super_Keyword__in_Constructor {
   public static void main(String[] args) {
    Dog d=new Dog();
    
   } 
}
