package za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository;

import za.ac.phillipmphela.domain.Employee.EmployeeGender;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class EmployeeGenderRepositoryImpl  implements EmployeeGenderRepository {

    private static EmployeeGenderRepositoryImpl repository = null;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGenders = new HashSet<>();
    }
// problem possibility
    private EmployeeGender findEmployeeGender(String employeeGenderId) {
        return this.employeeGenders.stream()
                .filter(new Predicate<EmployeeGender>() {
                    @Override
                    public boolean test(EmployeeGender employeeGenderId) {
                        return employeeGenderId.getEmployeeGender().trim().equals(employeeGenderId);
                    }
                })
                .findAny()
                .orElse(null);
    }

    public static EmployeeGenderRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }


    public EmployeeGender create(EmployeeGender employeeGender){
        this.employeeGenders.add(employeeGender);
        return employeeGender;
    }

    public EmployeeGender read(final String genderId){
        EmployeeGender employeeGender = findEmployeeGender(genderId);
        return employeeGender;
    }

    public void delete(String genderId) {
        EmployeeGender employeeGender = findEmployeeGender(genderId);
        if (employeeGender != null) this.employeeGenders.remove(employeeGender);
    }

    public EmployeeGender update(EmployeeGender employeeGender){
        EmployeeGender toDelete = findEmployeeGender(employeeGender.getEmployeeGender());
        if(toDelete != null) {
            this.employeeGenders.remove(toDelete);
            return create(employeeGender);
        }
        return null;
    }


    public Set<EmployeeGender> getAll(){
        return this.employeeGenders;
    }
}
