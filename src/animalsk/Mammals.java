package animalsk;

public class Mammals extends Animal {
   
    
   public Mammals(String name, int yearNamed)
   {
       super(name, yearNamed);
   }
    
   //Implementation of the abstract method from Animal class
    @Override
    public String move()
    {
        return"Walking ";
    }

    @Override
    public String breath()
    {
       return"Lungs";
    }

    @Override
    public String reproduce()
    {
        return "Live births ";
    }
}
