package za.ac.phillipmphela.factoryTest.employeeRepositoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeFactory;

public class employeeFactoryTest  {

    private String employeeId, firstname, lastname, gender, race;

    @Before
    public void setUp() throws Exception {
        this.employeeId = "wer1234";
        firstname = "Phillip";
        lastname = "Mphela";
        gender = "male";
        race = "black";
    }

    @Test
    public void buildCourse() {
        Employee employee = EmployeeFactory.createEmployee(this.employeeId, this.firstname, this.lastname, this.gender, this.race);
        Assert.assertNotNull(employee.getEmployeeId());
        Assert.assertNotNull(employee);
    }

}
