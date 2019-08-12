package za.ac.phillipmphela.domain.Employee;

import java.util.Objects;

public class EmployeeGender {
    private String genderId, employeeId;


    private EmployeeGender(){

    }


    private EmployeeGender(Builder builder) {
        this.genderId = builder.genderId;
        this.employeeId = builder.employeeId;

    }

    public String getEmployeeGender() {
        return genderId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static class Builder{

        private String genderId, employeeId;

        public Builder createGenderId(String genderId) {
            this.genderId = genderId;
            return this;
        }
        public Builder createEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeGender build() {
            return new EmployeeGender(this);
        }


        public Builder copy(EmployeeGender genderId){
            this.genderId = genderId.genderId;
            this.employeeId = genderId.employeeId;
            return this;
        }
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeGender that = (EmployeeGender) o;
        return Objects.equals(genderId, that.genderId) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId, employeeId);
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "genderId='" + genderId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
