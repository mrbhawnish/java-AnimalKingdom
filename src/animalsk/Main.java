package animalsk;

import java.util.ArrayList;
import java.util.List;



public class Main
{
    /**
     * Filters the list of animals based on the given criteria, printing the results to the screen
     *
     * @param animals the list of Animals to filter
     * @param tester  a lambda expression on how the list should be filtered
     */

  
    public static void printAnimals(List<Animal> animals, CheckAnimal tester)
    {
        for (Animal a : animals)
        {
            if (tester.test(a))
            {
                System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getyearNamed());
            }
        }
    }

    /**
     * The main driving method for this application
     *
     * @param args Not used in this application
     */
    public static void main(String[] args)
    {
        List<Animal> animalsArrayList = new ArrayList<>();

        // add the mammals
        animalsArrayList.add(new Mammals("Panda", 1869));
        animalsArrayList.add(new Mammals("Zebra", 1778));
        animalsArrayList.add(new Mammals("Koala", 1816));
        animalsArrayList.add(new Mammals("Sloth", 1804));
        animalsArrayList.add(new Mammals("Armadillo", 1758));
        animalsArrayList.add(new Mammals("Raccoon", 1758));
        animalsArrayList.add(new Mammals("Bigfoot",2021));

        // add the birds
        animalsArrayList.add(new Birds("Pigeon",1837));
        animalsArrayList.add(new Birds("Peacock", 1821));
        animalsArrayList.add(new Birds("Toucan", 1758));
        animalsArrayList.add(new Birds("Parrot", 1824));
        animalsArrayList.add(new Birds("Swan", 1758));

        // add the fish
        animalsArrayList.add(new Fish("Salmon", 1758));
        animalsArrayList.add(new Fish("Catfish",1817));
        animalsArrayList.add(new Fish("Perch", 1758));

        System.out.println("*** MVP ***");
        System.out.println();
        System.out.println("*** List all the animals in descending order by year named ***");
        animalsArrayList.sort((a1, a2) -> a2.getyearNamed() - a1.getyearNamed());
        System.out.println(animalsArrayList.toString());

        System.out.println();
        System.out.println("*** List all the animals alphabetically ***");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animalsArrayList.toString());

        System.out.println();
        System.out.println("*** List all the animals order by how they move ***");
        animalsArrayList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println(animalsArrayList.toString());

        System.out.println();
        System.out.println("*** List only those animals the breath with lungs ***");
        printAnimals(animalsArrayList, a -> a.breath().equalsIgnoreCase("lungs"));

        System.out.println();
        System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***");
        //printAnimals(animalsArrayList, a -> (a.breath().equalsIgnoreCase("lungs") 
        printAnimals(animalsArrayList, a -> (a.breath().equalsIgnoreCase("lungs") && a.getyearNamed()== 1758));
        System.out.println();
        System.out.println("*** List only those animals that lay eggs and breath with lungs ***");
        printAnimals(animalsArrayList, a -> (a.reproduce().equalsIgnoreCase("eggs") && a.breath().equalsIgnoreCase("lungs")));
     
        System.out.println();
        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalsArrayList, a -> a.getyearNamed() == 1758);
        

        System.out.println("\n*** Stretch Goal ***");
        System.out.println();
        System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***");
        animalsArrayList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(animalsArrayList, a -> (a instanceof Mammals));
    }
}
