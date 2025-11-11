package service;

import constants.ConstantsApp;

import java.util.Set;

public class PhoneNumbers {
    private final Set<String> numbers;

    public PhoneNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {

        if (numbers.isEmpty()) {
            return ConstantsApp.SPACE;
        }
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            builder.append(String.format(ConstantsApp.NUMBER_FORMAT,
                    number.charAt(0), number.substring(1, 4), number.substring(4, 7),
                    number.substring(7, 9), number.substring(9, 11))).append(ConstantsApp.COMMA);

        }
        builder.setCharAt(builder.length() - 2, '.');
        return builder.toString();
    }
}
