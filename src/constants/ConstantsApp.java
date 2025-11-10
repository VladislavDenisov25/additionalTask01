package constants;

public class ConstantsApp {

    public static final String MENU = """
            Главное меню:
            1. Добавление персоны.
            2. Добавление телефона к существующей персоне.
            3. Поиск персоны по телефонному номеру.
            4. Поиск всех телефонов по персоне.
            5. Вывод всех записей телефонной книги.
            6. Выход из программы.\n
            """;

    public static final String HELLO = "Добро пожаловать в программу \"Телефонная книга\"\n";
    public static final String ERROR_NUMBER_FORMAT = "Введите целое число согласно пункту меню!";

    public static final String INPUT_NUMBER_MENU = "Введите цифру главного меню: ";
    public static final String INPUT_PHONE_NUMBERS = """
            Введите номер(а) телефона(ов) персоны, в формате \"89105559900\"
            Если номеров несколько вводите их через пробел: 
            """;

    public static final String INPUT_PHONE_NUMBER = "Введите номер телефона: ";
    public static final String INPUT_FIRST_NAME = "Введите имя персоны: ";
    public static final String INPUT_LAST_NAME = "Введите фамилию персоны: ";

    public static final String NEW_LINE = "\n";
    public static final String SPACE = " ";
    public static final String COMMA = ", ";

    public static final String FULL_NAME_FORMAT = "Person {%s %s} ";
    public static final String NUMBER_FORMAT = "+%s-(%s)-%s-%s-%s";

    public static final String ADD_PERSON_PHONE_BOOK_INFO_1 = "Персона: %s добавлена ранее, к ней были добавлены номера: %s\n";
    public static final String ADD_PERSON_PHONE_BOOK_INFO_2 = "Персона: %s добавлена, к ней были добавлены номера: %s\n";
    public static final String PERSON_NOT_FOUND = "Персона: %s не найдена в телефонной книге!\n";

    public static final String FIND_PHONE_NUMBER_INFO = "Номер телефона: %s принадлежит персоне: %s\n";
    public static final String CONTAINS_VALUE_INFO = "Номер: %s не будет добавлен, он принадлежит другой персоне или уже добавлен!\n";

}
