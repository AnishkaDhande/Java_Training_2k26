interface Printable
{
    void print();
    interface MessagePrintable
    {
        void msg();
    }
}
class Printer implements Printable{
    public void print()
    {
        System.out.println("Printing Document......");
    }
}
    class MessagePrinter implements Printable.MessagePrintable
{
    public void msg()
    {
        System.out.println("printing Message......");
    }
}
public class Nested_Interface {
    public static void main(String[] args) {
        Printable p=new Printer();
        p.print();
        Printable.MessagePrintable mp=new MessagePrinter();
        mp.msg();
        
    }
    
}
