package day36_inheritance.ThisParanVsSuperParan;

public class Child extends Parent {

    public Child() {
        super(5);
    }


    // We can not have both super() and this() in one constructor.
//    public Child(int i) {
//        this ();
//        super(4, 3);
//    }

//    public Child(int i) {
//        this ();
//        super(4, 3);
//    }

}
