package za.ac.phillipmphela.factoryTest.raceFactoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.EmployeeRace;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeRaceFactory;

public class raceFactoryTest {
    private String raceId;

    @Before
    public void setUp() throws Exception {
        this.raceId = "rc100";

    }

    @Test
    public void buildCourse() {
        EmployeeRace employeeRace = EmployeeRaceFactory.createEmployeeRace(raceId);
        Assert.assertNotNull(employeeRace.getraceId());
        Assert.assertNotNull(employeeRace);
    }
}
