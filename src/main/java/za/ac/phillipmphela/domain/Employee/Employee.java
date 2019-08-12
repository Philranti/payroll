package za.ac.phillipmphela.domain.Employee;

import java.util.Objects;

public class Employee {

    private String employeeId, firstname, lastname, gender, race;

    private Employee(){

    }

    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.gender = builder.gender;
        this.race = builder.race;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static class Builder{

        private String employeeId, firstname, lastname, gender, race;

        public Builder createEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder createFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder createLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder createGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder createRace(String race) {
            this.race = race;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

        public Builder copy(Employee employee){
            this.employeeId = employee.employeeId;
            this.firstname = employee.firstname;
            this.lastname = employee.lastname;
            this.gender = employee.gender;
            this.race = employee.race;

            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public String toString() {
        return "Builder{" +
                "employeeId='" + employeeId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
