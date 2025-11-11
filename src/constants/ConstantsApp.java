package constants;

public class ConstantsApp {

    public static final String MENU = """
            Главное меню:
            1. Добавление 🎩персоны.
            2. Добавление ☎️телефона к существующей 🎩персоне.
            3. Поиск 🎩персоны по ☎️номеру телефона.
            4. Поиск всех ☎️телефонов по 🎩персоне.
            5. Вывод всех записей 📖телефонной книги.
            6. Выход из программы.
            
            """;

    public static final String HELLO = "Добро пожаловать в программу \"📖Телефонная книга\"\n";
    public static final String ERROR_MENU_NUMBER = "⚠️Такого пункта меню несуществует!⚠️\n";
    public static final String ERROR_NUMBER_FORMAT = "Нужно ввести целое число!\n";

    public static final String INPUT_NUMBER_MENU = "Введите цифру которая соотвествует одному из пунктов главного меню: ";
    public static final String INPUT_PHONE_NUMBERS = """
            Введите ☎️номер(а) телефона(ов) персоны, в формате "89105559900"
            Если ☎️номеров несколько вводите их через пробел:
            """;

    public static final String INPUT_PHONE_NUMBER = "Введите ☎️номер телефона: ";
    public static final String INPUT_FIRST_NAME = "Введите имя персоны: ";
    public static final String INPUT_LAST_NAME = "Введите фамилию персоны: ";

    public static final String NEW_LINE = "\n";
    public static final String SPACE = " ";
    public static final String COMMA = ", ";

    public static final String FULL_NAME_FORMAT = "{%s %s}";
    public static final String NUMBER_FORMAT = "+%s-(%s)-%s-%s-%s"; // +7-(999)-123-45-67

    public static final String ADD_PERSON_PHONE_BOOK_INFO_1 = "🎩Персона: %s уже существует в 📖телефонной книге, к ней добавлен(ы) ☎️номер(а): %s\n";
    public static final String ADD_PERSON_PHONE_BOOK_INFO_2 = "🎩Персона: %s добавлена, её ☎️номер(а): %s\n";
    public static final String PERSON_NOT_FOUND = "🎩Персона: %s не найдена в 📖телефонной книге!\n";

    public static final String FIND_PHONE_NUMBER_INFO = "☎️Номер телефона: %s принадлежит 🎩персоне: %s\n";
    public static final String CONTAINS_VALUE_INFO = "☎️Номер телефона: %s не будет добавлен, он уже записан в 📖телефонную книгу!\n";



}
