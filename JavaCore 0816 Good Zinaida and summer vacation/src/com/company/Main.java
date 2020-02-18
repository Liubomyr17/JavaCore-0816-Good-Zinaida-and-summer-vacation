package com.company;

/*
0816 Good Zinaida and summer vacation
Create a dictionary (Map <String, Date>) and enter ten entries in it according to the principle: “last name” - “date of birth”.
Remove from the dictionary all people born in the summer.

Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The createMap () method should create and return a HashMap dictionary with the element type String, Date consisting of 10 entries.
4. The removeAllSummerPeople () method should remove from the dictionary all people born in the summer.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Bush", new Date("MAY 4 1985"));
        map.put("Ivanov", new Date("JULY 25 1978"));
        map.put("Oland", new Date("NOVEMBER 12 1991"));
        map.put("Ford", new Date("MARCH 21 2003"));
        map.put("Washington", new Date("FEBRUARY 8 1982"));
        map.put("Jeferson", new Date("SEPTEMBER 17 1999"));
        map.put("Mugabe", new Date("APRIL 4 1982"));
        map.put("Adenauer", new Date("DECEMBER 29 2007"));
        map.put("Bismark", new Date("JUNE 3 1975"));
        return map;
    }


    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext())
        {
            Map.Entry<String, Date> pair = iter.next();
            int month = pair.getValue().getMonth();
            if ( (month>=5) && (month <=7) ) {
                iter.remove();
            }
        }
    }


    public static void main(String[] args) {

    }
}





