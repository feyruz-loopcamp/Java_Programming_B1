package day30_a_arraylist;

import my_util.StringUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
    Input: {"ted", "talk", "learn"} -- > Collections.reverse (list) -- > {"learn", "talk", "ted"}
    Output: {"det", "klat", "nrael"}
 */
public class ReverseAll {

    public static ArrayList <String> reverseAll (ArrayList <String> list) {

        ArrayList <String> reversedList = new ArrayList<>();

        for ( String each : list) {
            reversedList.add(StringUtil.reverseStr(each));
        }

        return reversedList;

    }

    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(list);
        System.out.println(reverseAll(list));
    }

}

