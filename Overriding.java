class Animal{
    void sound()
    {
        System.out.println("Animal make a Sound");

    }
    void sound(String type)
    {
        System.out.println("Animal Sound : "+type);
    }
}

 class Dog extends Animal{
    void sound(String type)
    {
        System.out.println("DOG is Barking: "+type);
    }
}
public class Overriding {
    public static void main (String args[])
    {
       Animal a=new Animal();
       Dog d=new Dog();
       Animal a1=new Dog();  
       a.sound();
       a.sound("Generic");
       d.sound("Loud");
       a1.sound("Soft");
    }


    
}
