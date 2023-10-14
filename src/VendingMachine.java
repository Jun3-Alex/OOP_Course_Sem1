package OOP_Course.Lesson1.Seminar.OOPSeminar1.src;

public interface VendingMachine {
    Product getProduct(String name);

    Product getProduct(String name, double volume);

    Product getProduct(String name, double cost, int temperature);
}
