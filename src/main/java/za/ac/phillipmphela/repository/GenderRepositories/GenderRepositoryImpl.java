package za.ac.phillipmphela.repository.GenderRepositories;

import za.ac.phillipmphela.domain.Gender.Gender;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class GenderRepositoryImpl implements GenderRepository {
    private static GenderRepositoryImpl repository = null;
    private Set<Gender> Genders;

    private GenderRepositoryImpl(){
        this.Genders = new HashSet<>();
    }
    // problem possibility
    private Gender findGender(String GenderId) {
        return this.Genders.stream()
                .filter(new Predicate<Gender>() {
                    @Override
                    public boolean test(Gender GenderId) {
                        return GenderId.getGenderId().trim().equals(GenderId);
                    }
                })
                .findAny()
                .orElse(null);
    }

    public static GenderRepositoryImpl getRepository(){
        if (repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }


    public Gender create(Gender Gender){
        this.Genders.add(Gender);
        return Gender;
    }

    public Gender read(final String genderId){
        Gender Gender = findGender(genderId);
        return Gender;
    }

    public void delete(String genderId) {
        Gender Gender = findGender(genderId);
        if (Gender != null) this.Genders.remove(Gender);
    }

    public Gender update(Gender Gender){
        za.ac.phillipmphela.domain.Gender.Gender toDelete = findGender(Gender.getGenderId());
        if(toDelete != null) {
            this.Genders.remove(toDelete);
            return create(Gender);
        }
        return null;
    }


    public Set<Gender> getAll(){
        return this.Genders;
    }
}
