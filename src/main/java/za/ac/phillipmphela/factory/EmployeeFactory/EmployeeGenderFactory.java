package za.ac.phillipmphela.factory.EmployeeFactory;

import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.util.Misc;

public class EmployeeGenderFactory {
    public static EmployeeGender createEmployeeGender(String createGenderId) {
        return new EmployeeGender.Builder().createGenderId(Misc.generateId())
                .createGenderId(createGenderId)
                .build();
    }
}
