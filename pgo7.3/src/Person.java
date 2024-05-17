import java.time.LocalDate;

abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    int getAge(){
        return LocalDate.now().getYear() - birthYear;
    }

}
