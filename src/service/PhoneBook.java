package service;

import java.util.*;

public class PhoneBook {
    private static final HashMap<Person, PhoneNumbers> phoneBook = new HashMap<>();

    public void addPersonOnPhoneBook(String firstName, String lastName, String... arrayNumbers) {

        Person person = new Person(firstName, lastName);
        HashSet<String> validationNumbers = containsValueOnPhoneBook(arrayNumbers);

        if (validationNumbers.isEmpty()) {
            phoneBook.put(person, new PhoneNumbers(new HashSet<>()));
            System.out.println("Контакт добавлен, без контактного номер телефона!");
            return;
        }

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

    public void addPhoneNumbers(String firstName, String lastName, String phoneNumber) {

        Person person = new Person(firstName, lastName);
        if (containsKeyOnPhoneBook(person)) {

            HashSet<String> validationNumbers = containsValueOnPhoneBook(new String[]{phoneNumber});
            if (validationNumbers.isEmpty()){
                return;
            }

            PhoneNumbers numbers = phoneBook.get(person);
            Set<String> number = numbers.getNumbers();
            for (String valid : validationNumbers) {
                number.add(valid);
            }
        } else {
            System.out.printf("Контакт: %s не найден в телефонной книге!");
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
                    System.out.println("Номер: " + number + " принадлежит другому человеку или уже добавлен!");
                    return new HashSet<>();
                }
            }
            validationNumbers.add(number);
        }
        return validationNumbers;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Person, PhoneNumbers> entry : phoneBook.entrySet()) {
            builder.append(entry.getKey().toString()).append(" ").append(entry.getValue().toString()).append("\n");
        }
        return builder.toString();
    }
}
