package za.ac.phillipmphela.service.EmployeeServices;

import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.service.EmployeeMainService;

import java.util.Set;

public interface EmployeeRaceService extends EmployeeMainService<EmployeeRace, String> {
        Set<EmployeeRace> getAll();
}
