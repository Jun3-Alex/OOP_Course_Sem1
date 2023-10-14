package OOP_Course.Lesson1.Seminar.OOPSeminar1.src;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrinks> hotDrinks;

    public HotDrinksVendingMachine(List<HotDrinks> BottleOfWatter) {
        this.hotDrinks = BottleOfWatter;
    }

    public List<HotDrinks> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrinks> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }
    @Override
    public Product getProduct(String name) {
        for (HotDrinks drink : hotDrinks) {
            if (drink.getName().equals(name)) {
                return drink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotDrinks drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                return drink;
            }
        }
        return null;
    }


    public Product getProduct(String name, double volume, int temperature) {
        for (HotDrinks drink : hotDrinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume &&
                    drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
    public void addHotDrinks(HotDrinks hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}
