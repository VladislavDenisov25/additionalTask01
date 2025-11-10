package app;

import constants.ConstantsApp;
import service.PhoneBook;

import java.util.Scanner;

public class MenuApp {

    private final Scanner console = new Scanner(System.in);
    private final PhoneBook phoneBook = new PhoneBook();

    public void run() {
        System.out.println(ConstantsApp.HELLO);
        while (true) {
            System.out.print(ConstantsApp.MENU);
            int number = readInt(ConstantsApp.INPUT_NUMBER_MENU);

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
        String[] personName = readPersonName();
        String number = readLine(ConstantsApp.INPUT_PHONE_NUMBERS);
        String[] numbers = number.split(ConstantsApp.SPACE);
        phoneBook.addPersonInPhoneBook(personName[0], personName[1], numbers);
    }

    private void addPhoneNumber(){
        String[] personName = readPersonName();
        String number = readLine(ConstantsApp.INPUT_PHONE_NUMBER);
        phoneBook.addPhoneNumbers(personName[0], personName[1], number);
    }

    private void findPerson(){
        String number = readLine(ConstantsApp.INPUT_PHONE_NUMBER);
        phoneBook.findInPersonPhoneBook(number);
    }

    private void findPhoneNumbers(){
        String[] personName = readPersonName();
        phoneBook.findInNumbersPhoneBook(personName[0], personName[1]);
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
                System.out.println(ConstantsApp.ERROR_NUMBER_FORMAT);
            }
        }
    }

    private String readLine(String string) {

        System.out.print(string);
        return console.nextLine();
    }

public String[] readPersonName(){
    String firstName = readLine(ConstantsApp.INPUT_FIRST_NAME);
    String lastName = readLine(ConstantsApp.INPUT_LAST_NAME);
    return new String[]{firstName, lastName};
}


}
