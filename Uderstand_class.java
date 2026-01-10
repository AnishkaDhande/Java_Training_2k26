
class Dog{
        String breed;
        int ageC;
        String color;
         public void barking()
        {
            System.out.println("Dog is Barking");
        }
        void hungary()
        {
            System.out.println("Dog is Hungary");
        }
          void sleeping()
       {
    System.out.println("Dog is Sleeping");
       }
      /*  Dog()
       {
        this.breed="Not Given";
         this.ageC=0;
        this.color="Not Specified";
       }
      Dog(String breed,int ageC,String color)
       {
        this.breed=breed;
         this.ageC=ageC;
        this.color=color;
       }*/
   

}
class Uclass
{
    public static void main(String args[])
    {
       Dog d1=new Dog();
       d1.hungary();
       d1.sleeping();
       d1.barking();
       d1.breed="Hybrid";
       System.out.println(d1.breed);
       
    }
}
