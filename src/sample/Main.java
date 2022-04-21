package sample;

public class Main {
    public static void main(String[] args) {
        Cat kitty = new Cat();
        Dog doggy = new Dog();
        Veterinarian vet = new Veterinarian();

        kitty.setName("Ciri");
        kitty.setWeight(2);
        kitty.setColor("grey");
        kitty.setRation("Josera");

        doggy.setName("Milo");
        doggy.setWeight(4);
        doggy.setColor("black");
        doggy.setRation("Pedigree");

        vet.treatment(kitty);
    }
}
