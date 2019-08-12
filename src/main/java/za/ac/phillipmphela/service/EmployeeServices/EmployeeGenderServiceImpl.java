package za.ac.phillipmphela.service.EmployeeServices;

import org.springframework.stereotype.Service;
import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository.EmployeeGenderRepository;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository.EmployeeGenderRepositoryImpl;

import java.util.Set;

@Service
public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl() {
        repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService(){

        if(service == null){
            return new EmployeeGenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return repository.getAll();
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return repository.create(employeeGender);
    }

    @Override
    public EmployeeGender read(String read) {
        return repository.read(read);
    }

    @Override
    public EmployeeGender update(EmployeeGender updateGender) {
        return repository.update(updateGender);
    }

    @Override
    public void delete(String delete) {

        repository.delete(delete);

    }
}
