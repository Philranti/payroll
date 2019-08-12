package za.ac.phillipmphela.repository.RaceRepositories;

import za.ac.phillipmphela.domain.Race.Race;
import za.ac.phillipmphela.repository.EmployeeMainRepository;

import java.util.Set;

public interface RaceRepository  extends EmployeeMainRepository<Race, String> {
    Set<Race> getAll();
}
