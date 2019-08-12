package za.ac.phillipmphela.domain.Employee;

import java.util.Objects;

public class EmployeeRace {
   private String raceId, employeeId;

   private EmployeeRace(){

   }

    private EmployeeRace(Builder builder) {
        this.raceId = builder.raceId;
        this.employeeId = builder.employeeId;

    }

    public String getraceId() {
        return raceId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public static class Builder{

        private String raceId, employeeId;

        public Builder createRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder createEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }


        public EmployeeRace build() {
            return new EmployeeRace(this);
        }

        public Builder copy(EmployeeRace raceId){
            this.raceId = raceId.raceId;
            this.employeeId = raceId.employeeId;
            return this;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeRace that = (EmployeeRace) o;
        return Objects.equals(raceId, that.raceId) &&
                Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, employeeId);
    }

    @Override
    public String toString() {
        return "EmployeeRace{" +
                "raceId='" + raceId + '\'' +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}

