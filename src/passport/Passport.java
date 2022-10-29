package passport;

import java.util.Date;
import java.util.Objects;

public class Passport {
    private String passportNumber;
    private String surname;
    private String firstName;
    private String middleName;
    private Date birthDate;

    public Passport(String passportNumber, String surname, String firstName, String middleName, Date birthDate) {
        if (passportNumber == null || passportNumber.isEmpty() ||
                surname == null || surname.isEmpty() ||
                firstName == null || firstName.isEmpty() ||
                middleName == null || middleName.isEmpty() ||
                birthDate == null
        ) {
            throw new IllegalArgumentException("Некорректные входные параметры: все поля должны быть заполнены!");
        }

        this.passportNumber = passportNumber;
        this.surname = surname;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportNumber, passport.passportNumber) && Objects.equals(surname, passport.surname) && Objects.equals(firstName, passport.firstName) && Objects.equals(middleName, passport.middleName) && Objects.equals(birthDate, passport.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
