package za.ac.phillipmphela.factory.EmployeeFactory;

import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.util.Misc;

public class EmployeeRaceFactory {
    public static EmployeeRace createEmployeeRace(String employeeRaceId) {
        return new EmployeeRace.Builder().createRaceId(Misc.generateId())
                .createRaceId(employeeRaceId)
                .build();
    }
}
