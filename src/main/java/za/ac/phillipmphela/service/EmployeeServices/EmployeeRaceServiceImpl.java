package za.ac.phillipmphela.service.EmployeeServices;

import org.springframework.stereotype.Service;
import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository.EmployeeRaceRepository;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository.EmployeeRaceRepositoryImpl;

import java.util.Set;

@Service
public class EmployeeRaceServiceImpl implements EmployeeRaceService {


    private static EmployeeRaceServiceImpl service = null;
    private EmployeeRaceRepository repository;

    private EmployeeRaceServiceImpl() {
        repository = EmployeeRaceRepositoryImpl.getRepository();
    }

    public static EmployeeRaceService getService(){

        if(service == null){
            return new EmployeeRaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeRace create(EmployeeRace Employee) {
        return repository.create(Employee);
    }

    @Override
    public EmployeeRace read(String read) {
        return repository.read(read);
    }

    @Override
    public EmployeeRace update(EmployeeRace Employee) {
        return repository.update(Employee);
    }

    @Override
    public void delete(String delete) {

        repository.delete(delete);

    }

}
