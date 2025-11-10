package app;

import service.PhoneBook;

import java.util.Scanner;

public class MenuApp {

    private final Scanner console = new Scanner(System.in);
    private final PhoneBook phoneBook = new PhoneBook();

    public void run() {
        System.out.println("Добро пожаловать в программу \"Телефонная книга\"");
        while (true) {
            System.out.print("""
                    Выберите пункт меню:
                    1. Добавление персоны.
                    2. Добавление телефона к существующей персоне.
                    3. Поиск персоны по телефонному номеру.
                    4. Поиск всех телефонов по персоне.
                    5. Вывод всех записей телефонной книги.
                    6. Выход из программы.
                    """);
            int number = console.nextInt();

            switch (number) {

                case 1: addPerson();
                break;
                case 2: addPhoneNumber();
                break;
                case 3: findPerson();
                break;
                case 4: findPhoneNumbers();
                break;
                case 5: toStringPhoneBook();
                break;
                case 6: return;
                default: System.out.println();
                break;
            }
        }
    }

    private void addPerson(){

        // метод для чтения
        phoneBook.addPersonInPhoneBook();
    }

    private void addPhoneNumber(){

        phoneBook.addPhoneNumbers();
    }

    private void findPerson(){

        phoneBook.findInPersonPhoneBook();
    }

    private void findPhoneNumbers(){


        phoneBook.findInNumbersPhoneBook();
    }

    private void toStringPhoneBook(){
        phoneBook.toString();
    }

}
