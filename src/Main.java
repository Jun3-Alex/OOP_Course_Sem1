package OOP_Course.Lesson1.Seminar.OOPSeminar1.src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HotDrinks h1 = new HotDrinks("1", 1, 1, 1);
        HotDrinks h2 = new HotDrinks("2", 2, 2, 2);
        HotDrinks h3 = new HotDrinks("5", 4, 3, 3);
        HotDrinks h4 = new HotDrinks("15", 123, 1, 4);
        HotDrinks h5 = new HotDrinks("20", 6, 5, 5);

        HotDrinksVendingMachine vendingMachine = new HotDrinksVendingMachine(new ArrayList<>());
        vendingMachine.addHotDrinks(h1);
        vendingMachine.addHotDrinks(h2);
        vendingMachine.addHotDrinks(h3);
        vendingMachine.addHotDrinks(h4);
        vendingMachine.addHotDrinks(h5);
        System.out.println(vendingMachine.getProduct("20", 5, 5));
    }
}
