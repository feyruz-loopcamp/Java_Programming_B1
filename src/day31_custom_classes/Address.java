package day31_custom_classes;

public class Address {
    String street;
    String city;
    String state;
    int zipcode;


    // Create a constructor that accepts 4 parameters with the same name as your instance variables. Then assign your local variables to you instance variables.
    public Address (String street, String city, String state, int zipcode){
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
    }

}
