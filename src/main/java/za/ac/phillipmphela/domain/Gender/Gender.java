package za.ac.phillipmphela.domain.Gender;

import java.util.Objects;

public class Gender {
    String genderId;
    String gender = "male, female";

    private Gender(){

    }

    private Gender(Builder builder) {
        this.genderId = builder.genderId;
        this.gender = builder.gender;

    }

    public String getGenderId() {
        return genderId;
    }

    public String getGender() {
        return gender;
    }

    public static class Builder{

        private String genderId, gender;

        public Builder createGenderId(String genderId) {
            this.genderId = genderId;
            return this;
        }

        public Builder Gender(String gender) {
            this.genderId = gender;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }

        public Builder copy(Gender gender){
            this.genderId = gender.genderId;
            this.gender = gender.gender;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender1 = (Gender) o;
        return Objects.equals(genderId, gender1.genderId) &&
                Objects.equals(gender, gender1.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genderId, gender);
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
