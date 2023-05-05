package day38_a_abstraction.animal;

import day38_a_abstraction.language.Language;

//Concrete class
public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void eat() {
        System.out.println("Parrots chews the seeds");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }


    @Override
    public void hi() {
        System.out.println("Gu gu");
    }

    @Override
    public void bye() {
        System.out.println("Ba ba");
    }
}
