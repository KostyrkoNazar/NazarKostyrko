package lesson_04.Hospitality;

import java.util.Date;

public class OperationsStaff extends Staff {

    public OperationsStaff(String title, String givenName, String middleName, String familyName, FullName name, Date birtDate, Gender gender, Address homeAddress, Phone phone, Date joined, String education, String certification, String languages) {
        super(title, givenName, middleName, familyName, name, birtDate, gender, homeAddress, phone, joined, education, certification, languages);
    }

    public OperationsStaff(Date joined, String education, String certification, String languages) {
        super(joined, education, certification, languages);
    }
}