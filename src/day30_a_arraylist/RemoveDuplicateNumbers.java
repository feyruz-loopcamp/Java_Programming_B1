package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Input: {1, 3, 5, 1, 4, 5, 9};
    Output: {3, 4, 9};
 */
public class RemoveDuplicateNumbers {

    public static ArrayList <Integer> removeDup (ArrayList <Integer> list) {
        list.removeIf( each -> Collections.frequency(list, each) > 1 );
        return list;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(nums);
        System.out.println(removeDup(nums));
    }


}
