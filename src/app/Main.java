package app;

import service.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPersonOnPhoneBook("Dasha", "Belayeva", "89105094552");
        phoneBook.addPersonOnPhoneBook("Vlad", "Denisov", "89105648763");

        System.out.println(phoneBook.toString());

    }
}