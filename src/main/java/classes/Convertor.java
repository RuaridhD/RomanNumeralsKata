package classes;

import interfaces.RomanNumeralGenerator;

public class Convertor implements RomanNumeralGenerator {

    public String generate(int number) {
        StringBuilder numeral = new StringBuilder();
        if ((number > 0) && (number < 4000)) {
            if (number == 4) {
                numeral.append("IV");
                return numeral.toString();
            } else {
                for (int i = 0; i < number; i++) {
                    numeral.append("I");
                }
                return numeral.toString();
            }
        }
        return "Please only enter numbers between 1 - 3999";
    }
}