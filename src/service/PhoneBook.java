package service;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
    private static final HashMap<Person, PhoneNumbers> phoneBook = new HashMap<>();

    public void addPersonOnPhoneBook(String firstName, String lastName, String... arrayNumbers) {

        HashSet<String> validationNumbers = containsValueOnPhoneBook(arrayNumbers);
        Person person = new Person(firstName, lastName);

        if (containsKeyOnPhoneBook(person)) {
            PhoneNumbers numbers = phoneBook.get(person);
            Set<String> number = numbers.getNumbers();
            for (String valid : validationNumbers) {
                number.add(valid);
            }
        } else {
            PhoneNumbers numbers = new PhoneNumbers(validationNumbers);
            phoneBook.put(person, numbers);
        }

    }

    private boolean containsKeyOnPhoneBook(Person person) {
        return phoneBook.containsKey(person);
    }

    private HashSet<String> containsValueOnPhoneBook(String[] arrayNumbers) {

        HashSet<String> validationNumbers = new HashSet<>();
        Collection<PhoneNumbers> values = phoneBook.values();

        for (String number : arrayNumbers) {
            for (PhoneNumbers value : values) {
                if (value.getNumbers().contains(number)) {
                    System.out.println("Номер: " + number + " принадлежит другому человеку или уже добавлен");
                    break;
                }
            }
            validationNumbers.add(number);
        }
        return validationNumbers;
    }
}
