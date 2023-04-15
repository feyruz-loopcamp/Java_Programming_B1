package day30_b_custom_classes;
/*
    have instance variables called name and price
 */
public class Item {
    String name;
    double price;


    public String toString() {
        return "Name = '" + name + '\'' +
                "\nPrice = " + price;
    }
}
