package app;

import service.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPersonInPhoneBook("Dasha", "Belyaeva", "89105094552");
        phoneBook.addPersonInPhoneBook("Dasha", "Belyaeva", "89106507890", "89105094552");
        phoneBook.addPersonInPhoneBook("Vlad", "Denisov", "89105648763");
        phoneBook.addPersonInPhoneBook("Vlad", "Denisov", "89105648764");
        phoneBook.addPersonInPhoneBook("Vlad", "Denisov", "89105648765");
        phoneBook.addPersonInPhoneBook("Vlad", "Denisov", "89105648766");
//       phoneBook.addPersonInPhoneBook("Petya", "Ivanov");
//        phoneBook.addPhoneNumbers("Petya", "Ivanov", "89105648863");
//        phoneBook.findInPersonPhoneBook("89105648863");
//        System.out.println(phoneBook.toString());

        phoneBook.findInNumbersPhoneBook("Dasha", "Belyaeva");
        phoneBook.findInNumbersPhoneBook("Vlad", "Denisov");


   }
}