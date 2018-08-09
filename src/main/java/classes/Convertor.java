package classes;

import interfaces.RomanNumeralGenerator;

import java.util.TreeMap;

public class Convertor implements RomanNumeralGenerator {

    public String generate(int number) {
        TreeMap<Integer, String> numeralValues = new TreeMap();
        numeralValues.put(1, "I");
        numeralValues.put(4, "IV");
        numeralValues.put(5, "V");
        numeralValues.put(9, "IX");
        numeralValues.put(10, "X");
        numeralValues.put(40, "XL");
        numeralValues.put(50, "L");
        numeralValues.put(90, "XC");
        numeralValues.put(100, "C");
        numeralValues.put(400, "CD");
        numeralValues.put(500, "D");
        numeralValues.put(900, "CM");
        numeralValues.put(1000, "M");

        StringBuilder numeral = new StringBuilder();

        if ((number > 0) && (number < 4000)) {
            int nearestNumber = numeralValues.floorKey(number);
            if (number == nearestNumber) {
                return numeralValues.get(number);
            }
            return numeralValues.get(nearestNumber) + generate(number - nearestNumber);
        }
        return "Please only enter numbers between 1 - 3999";
    }

}