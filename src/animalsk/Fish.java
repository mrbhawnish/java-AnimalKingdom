package animalsk;

public class Fish extends Animal {

    public Fish (String name, int yearNamed)
    {
        super(name, yearNamed);
    }

    @Override
    public String move()
    {
       return "Swim ";
    }

    @Override
    public String breath()
    {
       return "Gills ";
    }

    @Override
    public String reproduce()
    {
        return "Eggs ";
    }
}
