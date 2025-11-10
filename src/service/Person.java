package service;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firstName  +
                ", lastName=" + lastName +
               "}";
    }

    @Override
    public boolean equals(Object obj) {
            if (this == obj) return true; // Проверка на ссылку на тот же объект
            if (obj == null || getClass() != obj.getClass()) return false; // Проверка типа
            Person other = (Person) obj; // Приведение типа
            return Objects.equals(this.firstName, other.firstName)
                    && Objects.equals(this.lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
