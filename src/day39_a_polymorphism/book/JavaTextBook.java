package day39_a_polymorphism.book;
/*
Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods
 */
public class JavaTextBook extends EBook {

    boolean fun;

    @Override
    public void read() {
        System.out.println("Reading");
    }

    @Override
    public void downloadable() {
        System.out.println("Downloading");
    }

    @Override
    public void open() {
        System.out.println("Opening");
    }
}

/*
    int i = 5;
    double d = (double)i;  // upcasting - implicitly

    double d2 = 5;
    double d2 = (double)5;

    double d1 = 5.0;
    int t2 = d1;
    int i2 = (int) d1;  // down casting

    // byte, short, int, long, float double
 */

/*
       child class -- acccess
       super class

       (super class)child class // upcasting
       (sub class)super class //  downcast

 */









