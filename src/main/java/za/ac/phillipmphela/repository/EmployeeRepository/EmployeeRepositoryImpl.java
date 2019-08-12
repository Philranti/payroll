package za.ac.phillipmphela.repository.EmployeeRepository;

import za.ac.phillipmphela.domain.Employee.Employee;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> Employees;

    private EmployeeRepositoryImpl(){
        this.Employees = new HashSet<>();
    }
    // problem possibility
    private Employee findEmployee(String EmployeeId) {
        return this.Employees.stream()
                .filter(new Predicate<Employee>() {
                    @Override
                    public boolean test(Employee EmployeeId) {
                        return EmployeeId.getEmployeeId().trim().equals(EmployeeId);
                    }
                })
                .findAny()
                .orElse(null);
    }

    public static EmployeeRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }


    public Employee create(Employee Employee){
        this.Employees.add(Employee);
        return Employee;
    }

    public Employee read(final String genderId){
        Employee Employee = findEmployee(genderId);
        return Employee;
    }

    public void delete(String genderId) {
        Employee Employee = findEmployee(genderId);
        if (Employee != null) this.Employees.remove(Employee);
    }

    public Employee update(Employee Employee){
        za.ac.phillipmphela.domain.Employee.Employee toDelete = findEmployee(Employee.getEmployeeId());
        if(toDelete != null) {
            this.Employees.remove(toDelete);
            return create(Employee);
        }
        return null;
    }


    public Set<Employee> getAll(){
        return this.Employees;
    }
}

