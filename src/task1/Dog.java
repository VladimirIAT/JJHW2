package task1;
public class Dog extends Animal{


    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "\nСобака: " + name;
    }

    public void makeSound() {
        System.out.println("Гав!");
    }

}
