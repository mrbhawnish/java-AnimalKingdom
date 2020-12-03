package animalsk;

public abstract class Animal {

    

    private static int maxId = 0;
    protected int id;
    protected String name;
    protected int yearNamed;

    public Animal(String name, int yearNamed)
    {
       maxId++;
       id = maxId;
       this.name = name;
       this.yearNamed = yearNamed;
    } 
    
   public String eat()
   {
      return "Chomp Chomp"; 
   }

   public int getId()
   {
       return id;
   }

   public String getName()
   {
       return name;
   }

   public int getyearNamed()
   {
       return yearNamed;
   }

   public abstract String move();
   public abstract String breath();
   public abstract String reproduce();

   // Current state of the object

   @Override 
   public String toString()
   {
       return "\n Animals{" +
               "id=" + id + " " +
               "name=" + name + " " +
               "yearNamed=" + yearNamed + "} ";
   }
}
