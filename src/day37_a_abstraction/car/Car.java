package day37_a_abstraction.car;

public abstract class Car {

    // Abstract method has to be in abstract Class
    // You can NOT have abstract methods in NON_ABSTRACT class
    public abstract void start();


}


/*
   SO FAR:

        -ABSTRACT method does NOT have body
        -Abstract method tell WHAT it does but not HOW
        -Abstract method HAS TO BE in abstract class
        -Whatever class extends ABSTRACT class HAS TO implement ABSTRACT class
        -The FIRST NON-ABSTRACT class HAS TO IMPLEMENT all the MULTI-LEVEL abstract inheritance.
        -Abstract Class can NOT be instantiated / object of it can NOT be created
 */