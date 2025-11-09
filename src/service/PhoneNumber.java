package service;

import java.util.Set;

public class PhoneNumber {
    private Set<String> numbers;

    public PhoneNumber(Set<String> number) {
        this.numbers = number;
    }

    public Set<String> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() { // +7-(999)-123-45-67
        StringBuilder bulder = new StringBuilder();
        for (String number : numbers) {
            bulder.append(String.format("+%s-(%s)-%s-%s-%s",number.substring(0, 1),
                    number.substring(1, 4), number.substring(4, 7), number.substring(7, 9), number.substring(9, 11))).append(", ");
        }
        bulder.setCharAt(bulder.length() - 1, '.');
        return bulder.toString();
    }
}
