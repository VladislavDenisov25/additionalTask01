package service;

import java.util.Set;

public class PhoneNumbers {
    private Set<String> numbers;

    public PhoneNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    public Set<String> getNumbers() {
        return numbers;
    }


    @Override
    public String toString() {  // +7-(999)-123-45-67

        if (numbers.isEmpty() || numbers == null){
            return " ";
        }
        StringBuilder bulder = new StringBuilder();
        for (String number : numbers) {
                bulder.append(String.format("+%s-(%s)-%s-%s-%s", number.substring(0, 1),
                        number.substring(1, 4), number.substring(4, 7), number.substring(7, 9), number.substring(9, 11))).append(", ");

        }
        bulder.setCharAt(bulder.length() - 2, '.');
        return bulder.toString();
    }
}
