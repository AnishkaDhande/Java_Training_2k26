//Program of Overloading by changing datatype
class Adder
{
     int add(int a,int b)
    {
              return a+b;
    }
    double add(double  a,double b)
    {
        return a+b;
    }
}
public class Overloading2 {
public static void main(String args[])
{
Adder a1=new Adder();
System.out.println(a1.add(23,11));
System.out.println(a1.add(2.7,9.1));
}
}