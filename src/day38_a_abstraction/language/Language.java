package day38_a_abstraction.language;

public interface Language {

    String PLANET = "Earth"; // by default, it is static final


    // By default, the methods with NO body in INTERFACE, is public abstract method.
    void hi();

    void bye();

}
