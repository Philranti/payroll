package za.ac.phillipmphela.factory.EmployeeFactory;

import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.util.Misc;

public class EmployeeFactory  {
    public static Employee createEmployee(String employeeId, String firstname, String lastname, String gender, String race) {
        return new Employee.Builder().createEmployeeId(Misc.generateId())
               .createEmployeeId(employeeId)
                .createFirstname(firstname)
                .createLastname(lastname)
                .createGender(gender)
                .createRace(race)
                .build();
    }
}
