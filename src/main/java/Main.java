public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.makeSound();
        dog.makeSound();

        cat.eat("dogfood");
        dog.eat("Fish");

        cat.showMood(true);
        cat.showMood(false);
        dog.showMood(true);
        dog.showMood(false);


    }
}
