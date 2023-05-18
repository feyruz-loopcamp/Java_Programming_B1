package day43_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
        make a method that accepts a String, and returns a Map and stores that character as key and count each characters as a value.
        Ex:     apple
            a - 1
            p - 2
            l - 1
            e - 1
     */



    public static void main(String[] args) {
        System.out.println(frequencyOfChar("apple"));
    }


    public static Map <String, Integer> frequencyOfChar (String str) {  // apple --- >split("")

        Map <String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {   // for through the characters of the String

            String key = str.charAt(i) + "";   // This string will hold each character on each cycle

            if(map.containsKey(key)) {   // this method will return boolean if the given key exist among the keys in the map
                // First I check, if the character is already among the keys of the map, then get that key's value and increase it by one and update it.

                map.put(key, map.get(key) + 1);

            } else {
                // If the character is NOT already among the keys of the map, then add it into the map by making its value just 1
                map.put(key, 1);
            }

        }

        return map;
    }
}
