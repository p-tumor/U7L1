import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tails");
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        Cat cat2 = new Cat("Spotty");
        cats.add(cat2);
        Cat cat3 = new Cat("Dale");
        cats.add(cat3);
        Cat cat4 = new Cat("Hendrickson");
        cats.add(cat4);
    }
}
