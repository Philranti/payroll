package za.ac.phillipmphela.factory.GenderFactory;

import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.util.Misc;

public class GenderFactory {
    public static Gender createEmployee(String genderId, String genderName) {
        return new Gender.Builder().createGenderId(Misc.generateId())
                .createGenderId(genderId)
                .Gender(genderName)
                .build();
    }
}
