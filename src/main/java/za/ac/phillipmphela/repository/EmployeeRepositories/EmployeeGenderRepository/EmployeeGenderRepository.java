package za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository;

import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.repository.EmployeeMainRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends EmployeeMainRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
