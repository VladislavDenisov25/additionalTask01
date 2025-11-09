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
        return Objects.equals(this.firstName, firstName) && Objects.equals(this.getLastName(), getLastName());
    }

    @Override
    public int hashCode() {
        return 31 * this.firstName.hashCode() * this.lastName.hashCode();
    }
}
