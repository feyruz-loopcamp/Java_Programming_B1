package day41_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();   // reference is  -  ITSELF
        List<String> list1 = new ArrayList<>();         // reference is  -  Interface
                                                        // Reference side is List interface but object side is ArrayList class
        list1.add("a"); // 0
        list1.add("b"); // 1
        list1.add("c"); // 2
        list1.add("d");
        list1.add(null);
        list1.add("a"); // ArrayList accepts duplicates
        System.out.println(list1);
        System.out.println(list1.get(2));



        List<String> list2 = new LinkedList<>();            // reference is  -  Interface
                                                            // Reference side is List interface but object side is LinkedList class
        list2.add("a"); // 0
        list2.add("b"); // 1
        list2.add("c"); // 2
        list2.add("d");
        list2.add(null);
        list2.add("a");
        System.out.println(list2);
        System.out.println(list2.get(2));



        List<String> list3 = new Vector<>();            // reference is  -  Interface
                                                        // Reference side is List interface but object side is Vector class
        list3.add("a"); // 0
        list3.add("b"); // 1
        list3.add("c"); // 2
        list3.add("d");
        list3.add(null);
        list3.add("a");
        System.out.println(list3);
        System.out.println(list3.get(2));





    }
}
