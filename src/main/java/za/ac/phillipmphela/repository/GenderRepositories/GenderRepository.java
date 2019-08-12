package za.ac.phillipmphela.repository.GenderRepositories;

import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.repository.EmployeeMainRepository;

import java.util.Set;

public interface GenderRepository extends EmployeeMainRepository<Gender, String> {
    Set<Gender> getAll();
}
