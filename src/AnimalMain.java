import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {


        // creating instances of Animal Class with different constructors

        Animal dog = new Animal ("Tommy");
        System.out.println(dog);

        Animal cat = new Animal (false);
        System.out.println(cat);

        Animal dog1 = new Animal ("Sam", true);
        System.out.println(dog1);


        // create Scanner class

        Scanner user = new Scanner(System.in);

        // Create Array list of animals

        ArrayList<Animal> animals = new ArrayList<>();

        
       
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {

            System.out.print("Please enter a name: ");

            String name1 = user.nextLine();

            if (name1.isEmpty()) {

                break;

            }

            System.out.print("Is it a dog? Yes or no: ");

            String ans = user.nextLine();

            // definining boolean and converting ans to boolean

            boolean newAns;

            if (ans.equalsIgnoreCase("Yes")) {

                newAns = true;

            } else {

                newAns = false;
            }

            // System.out.println(newAns);

            animals.add(new Animal(name1, newAns));

        }

        for (Animal animal : animals) {

            System.out.println(animal);

            user.close();

        }

    }

   
}

