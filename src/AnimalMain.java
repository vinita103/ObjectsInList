import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {

    public static void main(String[] args) {

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

