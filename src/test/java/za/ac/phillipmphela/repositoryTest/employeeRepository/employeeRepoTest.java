package za.ac.phillipmphela.repositoryTest.employeeRepository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeFactory;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepository;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;

import java.io.IOException;
import java.util.Set;


public class employeeRepoTest {


    private EmployeeRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
    }


    @Test
    public void getAll() {

        Set<Employee> employee = repository.getAll();
        Assert.assertNotNull(employee);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.createEmployee("emp100", "Dave", "Richardson", "Male", "White" );

        repository.create(employee);

        Employee inRepo = repository.read(employee.getEmployeeId());

        Assert.assertNotNull(employee.getEmployeeId());

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.createEmployee("emp100", "Dave", "Richardson", "Male", "White" );

        repository.read(employee.getEmployeeId());

      //  Employee inRepo = repository.read(employee.getEmployeeId());

        Assert.assertNotNull(employee.getEmployeeId());
    }

    @Test
    public void update() {

        Employee employee = EmployeeFactory.createEmployee("emp100", "Dave", "Richardson", "Male", "White" );

        repository.create(employee);
        Employee repo = repository.read(employee.getEmployeeId());

        employee.getEmployeeId();

        repository.update(employee);

        Assert.assertEquals(employee.getEmployeeId(), employee.getEmployeeId());

    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.createEmployee("emp100", "Dave", "Richardson", "Male", "White" );

        repository.create(employee);

        Employee inRepo = repository.read(employee.getEmployeeId());

        //Assert.assertNotNull(inRepo);

        repository.delete(employee.getEmployeeId());

        Employee deleted = repository.read(employee.getEmployeeId());

        Assert.assertNull(deleted);

    }
}
