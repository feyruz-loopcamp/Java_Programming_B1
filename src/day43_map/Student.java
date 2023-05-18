package day43_map;

/*
    Declare 3 instance variables: name, gp, id
    Create a constructor that accepts 3 arguments and initialize using them in constructor.
    Make a toString method to String the info about object.
 */
public class Student {
    String name;
    double gpa;
    int id;

    public Student(String name, double gpa, int id) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa='" + gpa + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
