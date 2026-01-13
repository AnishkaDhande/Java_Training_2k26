class Addition
{
    int add(int a,int b)
    {
              return a+b;
    }

    int add(int a,int b,int c)
    {
        return a+b+c;

    }
  void add(float a,float b)
    {
        System.out.println("Addition is "+(a+b));
    }
}
public class Overloading {
    public static void main(String args[])
    {

       Addition a1=new  Addition();
       System.out.println( a1.add(1,8));
      System.out.println(a1.add(5,3,9));
       a1.add(2.3f,9.3f);      
    }
    
}
