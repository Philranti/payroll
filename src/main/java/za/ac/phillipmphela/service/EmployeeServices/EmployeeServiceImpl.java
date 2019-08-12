package za.ac.phillipmphela.service.EmployeeServices;

import org.springframework.stereotype.Service;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepository;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;

import java.util.Set;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl() {
        repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){

        if(service == null){
            return new EmployeeServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Employee> getAll() {
        return repository.getAll();
    }

    @Override
    public Employee create(Employee Employee) {
        return repository.create(Employee);
    }

    @Override
    public Employee read(String read) {
        return repository.read(read);
    }

    @Override
    public Employee update(Employee Employee) {
        return repository.update(Employee);
    }

    @Override
    public void delete(String delete) {

        repository.delete(delete);

    }
    
}
