package za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository;

import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.repository.EmployeeMainRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends EmployeeMainRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
