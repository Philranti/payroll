package za.ac.phillipmphela.service.EmployeeServices;

import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.service.EmployeeMainService;

import java.util.Set;

public interface EmployeeService extends EmployeeMainService<Employee, String> {
    Set<Employee> getAll();
}
