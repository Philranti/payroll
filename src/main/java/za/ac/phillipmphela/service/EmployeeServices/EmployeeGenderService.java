package za.ac.phillipmphela.service.EmployeeServices;

import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.service.EmployeeMainService;

import java.util.Set;

public interface EmployeeGenderService extends EmployeeMainService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
