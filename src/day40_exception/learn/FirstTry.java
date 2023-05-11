package day40_exception.learn;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First line");

        String word = "Java";


        try {
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }

        System.out.println("Last line");


    }
}
