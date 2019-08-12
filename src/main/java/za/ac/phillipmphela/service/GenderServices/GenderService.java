package za.ac.phillipmphela.service.GenderServices;

import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.service.EmployeeMainService;

import java.util.Set;

public interface GenderService extends EmployeeMainService<Gender, String> {
    Set<Gender> getAll();
}
