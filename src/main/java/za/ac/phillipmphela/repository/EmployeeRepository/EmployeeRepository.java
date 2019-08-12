package za.ac.phillipmphela.repository.EmployeeRepository;

import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.repository.EmployeeMainRepository;

import java.util.Set;

public interface EmployeeRepository extends EmployeeMainRepository<Employee, String> {
    Set<Employee> getAll();
}
