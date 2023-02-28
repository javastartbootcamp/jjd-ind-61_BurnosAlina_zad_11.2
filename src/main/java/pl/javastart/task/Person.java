package pl.javastart.task;

public class Person {

    private static final int MIN_LETTERS = 2;
    private static final int MIN_AGE = 1;
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        if (firstName == null || lastName == null || firstName.length() <= MIN_LETTERS ||
                lastName.length() <= MIN_LETTERS) {
            throw new NameUndefinedException("Osoba musi posiadać imię i nazwisko! (Dłuższe od" +
                    MIN_LETTERS + " liter!)");
        }
        ageCorrection(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    void ageCorrection(int age) {
        if (age < MIN_AGE) {
            throw new IncorrectAgeException("Wiek musi być większy niż " + MIN_AGE);
        }
    }

    public void setAge(int age) {
        ageCorrection(age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
