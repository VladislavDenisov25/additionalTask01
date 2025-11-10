package service;

import constants.ConstantsApp;

import java.util.*;

public class PhoneBook {
    private static final HashMap<Person, PhoneNumbers> phoneBook = new HashMap<>();

    public void addPersonInPhoneBook(String firstName, String lastName, String... arrayNumbers) {

        Person person = new Person(firstName, lastName);
        HashSet<String> validationNumbers = containsValueInPhoneBook(arrayNumbers);

        if (containsKeyInPhoneBook(person)) {
            PhoneNumbers numbers = phoneBook.get(person);
            Set<String> number = numbers.getNumbers();
                for (String valid : validationNumbers) {
                    number.add(valid);
                }
            System.out.printf(ConstantsApp.ADD_PERSON_PHONE_BOOK_INFO_1, person.toString(), validationNumbers.toString());
        } else {
            PhoneNumbers numbers = new PhoneNumbers(validationNumbers);
            phoneBook.put(person, numbers);
            System.out.printf(ConstantsApp.ADD_PERSON_PHONE_BOOK_INFO_2, person.toString(), numbers.toString());
        }
    }

    public void addPhoneNumbers(String firstName, String lastName, String phoneNumber) {

        Person person = new Person(firstName, lastName);
        if (containsKeyInPhoneBook(person)) {

            HashSet<String> validationNumbers = containsValueInPhoneBook(new String[]{phoneNumber});
            if (validationNumbers.isEmpty()){
                return;
            }

            PhoneNumbers numbers = phoneBook.get(person);
            Set<String> number = numbers.getNumbers();
            for (String valid : validationNumbers) {
                number.add(valid);
            }
        } else {
            System.out.printf(ConstantsApp.PERSON_NOT_FOUND);
        }
    }

    public void findInPersonPhoneBook(String phoneNumber){
        for (Map.Entry<Person, PhoneNumbers> entry : phoneBook.entrySet()) {
            PhoneNumbers entryValue = entry.getValue();
            for (String number : entryValue.getNumbers()) {
                if (phoneNumber.equals(number)){
                    System.out.printf(ConstantsApp.FIND_PHONE_NUMBER_INFO, phoneNumber, entry.getKey().toString());
                }
            }
        }
    }

    public void findInNumbersPhoneBook(String firstName, String lastName){

        Person person = new Person(firstName, lastName);
        for (Map.Entry<Person, PhoneNumbers> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(person)){
                System.out.println(entry.getValue().toString());
            }
        }
    }

    private boolean containsKeyInPhoneBook(Person person) {
        return phoneBook.containsKey(person);
    }

    private HashSet<String> containsValueInPhoneBook(String[] arrayNumbers) {

        HashSet<String> validationNumbers = new HashSet<>();
        Collection<PhoneNumbers> values = phoneBook.values();

        for (String number : arrayNumbers) {
            for (PhoneNumbers value : values) {
                if (value.getNumbers().contains(number)) {
                    System.out.printf(ConstantsApp.CONTAINS_VALUE_INFO, number);
                  //  return new HashSet<>();
                    break;
                }
            }
            validationNumbers.add(number);
        }

        if (validationNumbers.isEmpty()){
            validationNumbers = new HashSet<>();
        }
        return validationNumbers;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Person, PhoneNumbers> entry : phoneBook.entrySet()) {
            builder.append(entry.getKey().toString()).append(ConstantsApp.SPACE).append(entry.getValue().toString()).append(ConstantsApp.NEW_LINE);
        }
        return builder.toString();
    }
}
