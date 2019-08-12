package za.ac.phillipmphela.factoryTest.genderFactoryTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeGenderFactory;

public class genderFactoryTest {


    private String genderId;

    @Before
    public void setUp() throws Exception {
        this.genderId = "male2001";

    }

    @Test
    public void buildCourse() {
        EmployeeGender employeeGender = EmployeeGenderFactory.createEmployeeGender(this.genderId);
        Assert.assertNotNull(employeeGender.getEmployeeGender());
        Assert.assertNotNull(employeeGender);
    }
}
