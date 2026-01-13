class Animal{
    String color="White";

}
class Cat extends Animal{
    String color="Black";
    void printcolor()
    {
        System.out.println(color);//print color of Cat class 
        System.out.println(super.color);//prints color of Animal Class
    }
}
public class Using_Super_Keyword {
    public static void main(String args[])
    {
           Cat d1=new Cat();
           d1.printcolor();
    }
}
