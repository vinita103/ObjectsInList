
/**
 * Animal
 */
public class Animal {

    // creating Attibutes

    private String name;
    private boolean ifItIsADog;

    // creating constructor with parameters

    public Animal(String name, boolean ifItIsADog) {

        this.name = name;
        this.ifItIsADog = ifItIsADog;

    }

    // creating getter method to get name

    public String getName() {

        return name;

    }
    // creating getter method to get if it is a dog

    public boolean getifItIsADog() {

        return ifItIsADog;

    }

    // creating toString method to print animal details

    @Override

    public String toString() {

        return getName() + " is a dog " + " = " + getifItIsADog();

    }

}