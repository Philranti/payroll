package za.ac.phillipmphela.service.RaceServices;

import org.springframework.stereotype.Service;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.domain.Race.Race;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository.EmployeeRaceRepository;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepository;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;
import za.ac.phillipmphela.repository.RaceRepositories.RaceRepository;
import za.ac.phillipmphela.repository.RaceRepositories.RaceRepositoryImpl;
import za.ac.phillipmphela.service.EmployeeServices.EmployeeServiceImpl;

import java.util.Set;

@Service
public class RaceServiceImpl implements RaceService{

    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl() {
        repository = RaceRepositoryImpl.getRepository();
    }

    public static RaceServiceImpl getService(){

        if(service == null){
            return new RaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(String read) {
        return repository.read(read);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(String delete) {

        repository.delete(delete);

    }
}
