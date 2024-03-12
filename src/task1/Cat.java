package task1;
public class Cat extends Animal{


    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "\nКот: " + name;
    }


    public void makeSound() {
        System.out.println("Мяу!");
    }

}