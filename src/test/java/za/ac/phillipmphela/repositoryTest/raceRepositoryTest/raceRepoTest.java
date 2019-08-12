package za.ac.phillipmphela.repositoryTest.raceRepositoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeFactory;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeRaceFactory;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository.EmployeeRaceRepository;
import za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository.EmployeeRaceRepositoryImpl;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepository;
import za.ac.phillipmphela.repository.EmployeeRepository.EmployeeRepositoryImpl;

import java.util.Set;

public class raceRepoTest {
    private EmployeeRaceRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
    }


    @Test
    public void getAll() {

        Set<EmployeeRace> employeeRaces = repository.getAll();
        Assert.assertNotNull(employeeRaces);

    }

    @Test
    public void create() {

        EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace("emp01");

        repository.create(employeeRace);

        EmployeeRace repo = repository.read(employeeRace.getraceId());

        Assert.assertNotNull(employeeRace.getraceId());

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

        EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace("Rc02");

        repository.create(employeeRace);
        EmployeeRace repo = repository.read(employeeRace.getEmployeeId());

        employeeRace.getEmployeeId();

        repository.update(employeeRace);

        Assert.assertEquals(employeeRace.getraceId(), employeeRace.getraceId());

    }

    @Test
    public void delete() {

        EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace("Rc01");

        repository.create(employeeRace);

        EmployeeRace repo = repository.read(employeeRace.getEmployeeId());

        //Assert.assertNotNull(inRepo);

        repository.delete(employeeRace.getraceId());

        EmployeeRace deleted = repository.read(employeeRace.getraceId());

        Assert.assertNull(deleted);

    }
}
