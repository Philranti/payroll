package za.ac.phillipmphela.serviceTest.employeeServiceTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeGenderFactory;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeGenderRepository.EmployeeGenderRepositoryImpl;
import za.ac.phillipmphela.service.EmployeeServices.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderTest {
    private EmployeeGenderRepositoryImpl repository;
    private EmployeeGender gender;
    private EmployeeGenderService service;


    private EmployeeGender getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.gender = EmployeeGenderFactory.createEmployeeGender("Mal201");
    }

    @Test
    public void a_create() {
        EmployeeGender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.gender);
    }

    @Test
    public void c_update() {
        String genderId = "Fem300";
        EmployeeGender updated = new EmployeeGender.Builder().createGenderId(genderId).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(genderId, updated.getEmployeeGender());
    }

    @Test
    public void e_delete() {
        EmployeeGender saved = getSaved();
        this.repository.delete(saved.getEmployeeId());
        d_getAll();
    }

    @Test
    public void b_read() {
        EmployeeGender gender = EmployeeGenderFactory.createEmployeeGender("Fem301");

        repository.read(gender.getEmployeeGender());


        Assert.assertNotNull(gender.getEmployeeGender());
    }

    @Test
    public void d_getAll() {
        Set<EmployeeGender> Races = this.repository.getAll();
        System.out.println("In getall, all = " + Races);
    }
}
