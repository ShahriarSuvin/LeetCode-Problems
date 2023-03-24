package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String romanNumber){
        Map<Character,Integer> numberMap = new HashMap<>();
        numberMap.put('I',1);
        numberMap.put('V',5);
        numberMap.put('X',10);
        numberMap.put('L',50);
        numberMap.put('C',100);
        numberMap.put('D',500);
        numberMap.put('M',1000);

        int result =0;

        for (int i = 0; i<romanNumber.length(); i++){
            char ch = romanNumber.charAt(i);

            if (i>0 && numberMap.get(ch)> numberMap.get(romanNumber.charAt(i-1))){
                result+= numberMap.get(ch) - 2 * numberMap.get(romanNumber.charAt(i-1));
            }else {
                result+=numberMap.get(ch);
            }
        }
        return result;
    }

    public static void main(String[] args)  {
        System.out.println(romanToInteger("CMXII"));
    }
}
