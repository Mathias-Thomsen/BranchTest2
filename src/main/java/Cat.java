public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("miaw");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood == true) {
            System.out.println("katten spinder");
        } else {
            System.out.println("katten hvæser");
        }
    }
}
