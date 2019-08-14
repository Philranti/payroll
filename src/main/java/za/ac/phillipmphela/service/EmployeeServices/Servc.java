package za.ac.phillipmphela.service.EmployeeServices;

import za.ac.phillipmphela.domain.Employee.Employee;
import za.ac.phillipmphela.domain.Employee.EmployeeGender;
import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.factory.EmployeeFactory.EmployeeFactory;
import za.ac.phillipmphela.service.GenderServices.GenderService;

public class Servc {
    public Employee createEmployee(String fnme, String lnmen, String gender) {
        Employee employee = EmployeeFactory.createEmployee(fnme, lnmen, lnmen, gender, gender);
        //  Gender G = GenderService.getGender(gender);
        // EmployeeGender ge = EmployeeGender.Builder(employee.getEmployeeId(),G.getGenderId());
        EmployeeServiceImpl.getService().create(employee);
// EmployeeGenderService.create(ge);



/*
private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(int empId, String firstName, String lastName, int genderId, int raceId) {

        Employee employee = EmployeeFactory.getEmployee(empId, firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empId, genderId);
        employeeGenderService.create(employeeGender);

        Race race = RaceFactory.buildRace(raceId, "Race");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender(genderId, "None");
        genderService.create(gender);
    }

 */

//
        return employee;
    }

}