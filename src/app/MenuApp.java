package app;

import service.PhoneBook;

import java.util.Scanner;

public class MenuApp {

    private final Scanner console = new Scanner(System.in);
    private final PhoneBook phoneBook = new PhoneBook();

    public void run() {
        System.out.println("Добро пожаловать в программу \"Телефонная книга\"\n");
        while (true) {
            System.out.print("""
                    Главное меню:
                    1. Добавление персоны.
                    2. Добавление телефона к существующей персоне.
                    3. Поиск персоны по телефонному номеру.
                    4. Поиск всех телефонов по персоне.
                    5. Вывод всех записей телефонной книги.
                    6. Выход из программы.\n
                    """);
            int number = readInt("Введите цифру главного меню: ");

            switch (number) {

                case 1: addPerson();
                break;
//                case 2: addPhoneNumber();
//                break;
//                case 3: findPerson();
//                break;
//                case 4: findPhoneNumbers();
//                break;
                case 5: toStringPhoneBook();
                break;
                case 6: return;
                default: System.out.println();
                break;
            }
        }
    }

    private void addPerson(){
        String firstName = readLine("Введите имя персоны: ");
        String lastName = readLine("Введите фамилию персоны: ");
        StringBuilder bulder = new StringBuilder();
        String number = readLine("""
        Введите номер(а) телефона(ов) персоны, в формате \"89105559900\"
        Если номеров несколько вводите их через пробел: 
        """);
        String[] numbers = number.split(" ");
        phoneBook.addPersonInPhoneBook(firstName, lastName, numbers);
    }

    private void addPhoneNumber(){
        String firstName = readLine("Введите имя персоны: ");
        String lastName = readLine("Введите фамилию персоны: ");
        String number = readLine("Введите номер телефона которой будет добавлен персоне: ");
        phoneBook.addPhoneNumbers(firstName, lastName, number);
    }

    private void findPerson(){
        String number = readLine("Введите номер телефона по которому будет поиск персоны: ");
        phoneBook.findInPersonPhoneBook(number);
    }

    private void findPhoneNumbers(){
        String firstName = readLine("Введите имя персоны: ");
        String lastName = readLine("Введите фамилию персоны: ");

        phoneBook.findInNumbersPhoneBook(firstName, lastName);
    }

    private void toStringPhoneBook(){
        System.out.println(phoneBook);
    }

    public int readInt(String string) {

        while (true) {
            try {
                System.out.print(string);
                return Integer.parseInt(console.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число согласно пункту меню!");
            }
        }
    }

    private String readLine(String string) {

        System.out.print(string);
        return console.nextLine();
    }




}
