package za.ac.phillipmphela.serviceTest.employeeServiceTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeRaceFactory;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository.EmployeeRaceRepositoryImpl;
import za.ac.phillipmphela.service.EmployeeServices.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceTest {
    private EmployeeRaceRepositoryImpl repository;
    private EmployeeRace employeeRace;
    private EmployeeRaceService service;


    private EmployeeRace getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.createEmployeeRace("Rc01");
    }

    @Test
    public void create() {
        EmployeeRace created = this.repository.create(this.employeeRace);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employeeRace);
    }

    @Test
    public void update() {
        String raceId = "Rc02";
        EmployeeRace updated = new EmployeeRace.Builder().createRaceId(raceId).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(raceId, updated.getraceId());
    }

    @Test
    public void delete() {
        EmployeeRace saved = getSaved();
        this.repository.delete(saved.getraceId());
        getAll();
    }

    @Test
    public void read() {
        EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace("Rc01");

        repository.read(employeeRace.getraceId());


        Assert.assertNotNull(employeeRace.getraceId());
    }

    @Test
    public void getAll() {
        Set<EmployeeRace> Races = this.repository.getAll();
        System.out.println("In getall, all = " + Races);
    }
}
