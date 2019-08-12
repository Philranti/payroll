package za.ac.phillipmphela.serviceTest.employeeServiceTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeFactory;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;
import za.ac.phillipmphela.service.EmployeeServices.EmployeeService;

import java.util.Set;

public class EmployeeServiceTest {
    private EmployeeRepositoryImpl repository;
    private Employee employee;
    private EmployeeService service;


    private Employee getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.createEmployee("emp300", "Michael", "Morton", "Male", "Coloured");
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void update() {
        String employeeId = "emp100";
        Employee updated = new Employee.Builder().createEmployeeId(employeeId).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(employeeId, updated.getEmployeeId());
    }

    @Test
    public void delete() {
        Employee saved = getSaved();
        this.repository.delete(saved.getEmployeeId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Employee employee = EmployeeFactory.createEmployee("emp300", "Michael", "Morton", "Male", "Coloured");;

        repository.read(employee.getEmployeeId());


        Assert.assertNotNull(employee.getEmployeeId());
    }

    @Test
    public void d_getAll() {
        Set<Employee> employees = this.repository.getAll();
        System.out.println("In getall, all = " + employees);
    }
}
