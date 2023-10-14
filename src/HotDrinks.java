package OOP_Course.Lesson1.Seminar.OOPSeminar1.src;

public class HotDrinks extends BottleOfWater {
    private int temperature;
    public HotDrinks(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name = " + super.getName() +
                ";temperature = " + temperature +
                ";volume = " + super.getVolume() +
                ";cost = " + super.getCost() +
                '}';
    }
}
