package classes;

import interfaces.RomanNumeralGenerator;

public class Convertor implements RomanNumeralGenerator {

    public String generate(int number) {
        StringBuilder numeral = new StringBuilder();
        int counter = number;
        if ((number > 0) && (number < 4000)) {
            if (number >= 5) {
                numeral.append("V");
                counter -= 5;
            }
            if (number == 4) {
                numeral.append("IV");
                counter -= 4;
            }
            for (int i = 0; i < counter; i++) {
                numeral.append("I");
            }
            return numeral.toString();

        }
        return "Please only enter numbers between 1 - 3999";
    }
}