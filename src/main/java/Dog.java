public class Dog extends Animal{


    @Override
    public void makeSound() {
        System.out.println("vov");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
