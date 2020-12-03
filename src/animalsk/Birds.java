package animalsk;

public class Birds extends Animal {
    
    public Birds(String name, int yearNamed)
    {
        super(name, yearNamed);
    }
    @Override 
    public String move()
    {
       return "Fly";
    }

    @Override 
    public String breath()
    {
        return "Lungs";
    }

    @Override 
    public String reproduce()
    {
       return "Eggs";
    }
}
