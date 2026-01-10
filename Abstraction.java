abstract class Animal
{
abstract void makeSound();
void breathe()
{
    System.out.println("Animal is Breathing....");
}
}
class Dog extends Animal{

    @Override
    void makeSound() {
        // TODO Auto-generated method stub
        System.out.println("Dog Barking");
        
    }
    
}
public class Abstraction {
    public static void main(String args[])
    {
        Animal a1=new Dog();
        a1.makeSound();
        a1.breathe();

    }
}
