package za.ac.phillipmphela.repositoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.phillipmphela.domain.Employee.Employee;
import  za.ac.phillipmphela.factory.EmployeeFactory.EmployeeFactory;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepoImpTest {
    private EmployeeRepositoryImpl repository;
    private Employee employee;

    private Employee getSavedEmployee() {
        Set<Employee> savedEmployee = this.repository.getAll();
        return savedEmployee.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository().getRepository();
        this.employee = EmployeeFactory.createEmployee("emp1234", "Peter", "Pollock", "male", "White");
    }

    @Test
    public void a_create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        d_getAll();
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void b_read() {
        Employee savedEmployee1 = getSavedEmployee();
        this.repository.read(savedEmployee1.getEmployeeId());
        d_getAll();

    }

    @Test
    public void e_delete() {
        Employee savedEmployee = getSavedEmployee();
        this.repository.delete(savedEmployee.getEmployeeId());
        d_getAll();
    }

    @Test
    public void c_update() {
        String newName = "emp2000";
        Employee employee = new Employee.Builder().createEmployeeId(newName)
                .createFirstname("Thabang")
                .createLastname("Molefe")
                .createGender("Male")
                .createRace("Black")
                .build();
        System.out.println("In update, about_to_updated = " + employee);
        Employee updated = this.repository.update(employee);
        System.out.println("In update, updated = " + employee);
        Assert.assertEquals(newName, employee.getEmployeeId());
        d_getAll();
    }

    @Test
    public void d_getAll() {
        Set<Employee> all = this.repository.getAll();
        System.out.println("In getAll, all = " + all);
//        Assert.assertSame(1, all.size());
    }
}
