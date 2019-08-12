package za.ac.phillipmphela.service.RaceServices;

import za.ac.phillipmphela.domain.Race.Race;
import za.ac.phillipmphela.service.EmployeeMainService;

import java.util.Set;

public interface RaceService extends EmployeeMainService<Race, String> {
    Set<Race> getAll();
}
