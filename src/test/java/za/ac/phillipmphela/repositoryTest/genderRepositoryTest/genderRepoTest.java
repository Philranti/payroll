package za.ac.phillipmphela.repositoryTest.genderRepositoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeGenderFactory;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository.EmployeeGenderRepository;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository.EmployeeGenderRepositoryImpl;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;

import java.io.IOException;
import java.util.Set;

public class genderRepoTest {
    private EmployeeGenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {

        Set<EmployeeGender> employeeGenders = repository.getAll();
        Assert.assertNotNull(employeeGenders);

    }

    @Test
    public void create() {
        EmployeeGender employeeGender = EmployeeGenderFactory.createEmployeeGender("male1000");
        repository.create(employeeGender);

        Assert.assertNotNull(employeeGender.getEmployeeGender());

    }
}
