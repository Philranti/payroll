package za.ac.phillipmphela.repository.EmployeeRepositories.EmployeeRaceRepository;

import za.ac.phillipmphela.domain.Employee.EmployeeRace;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {
    private static EmployeeRaceRepositoryImpl repository = null;
    private Set<EmployeeRace> EmployeeRaces;

    private EmployeeRaceRepositoryImpl(){
        this.EmployeeRaces = new HashSet<>();
    }
    // problem possibility
    private EmployeeRace findEmployeeRace(String EmployeeRaceId) {
        return this.EmployeeRaces.stream()
                .filter(new Predicate<EmployeeRace>() {
                    @Override
                    public boolean test(EmployeeRace EmployeeRaceId) {
                        return EmployeeRaceId.getraceId().trim().equals(EmployeeRaceId);
                    }
                })
                .findAny()
                .orElse(null);
    }

    public static EmployeeRaceRepositoryImpl getRepository(){
        if (repository == null) repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }


    public EmployeeRace create(EmployeeRace EmployeeRace){
        this.EmployeeRaces.add(EmployeeRace);
        return EmployeeRace;
    }

    public EmployeeRace read(final String genderId){
        EmployeeRace EmployeeRace = findEmployeeRace(genderId);
        return EmployeeRace;
    }

    public void delete(String genderId) {
        EmployeeRace EmployeeRace = findEmployeeRace(genderId);
        if (EmployeeRace != null) this.EmployeeRaces.remove(EmployeeRace);
    }

    public EmployeeRace update(EmployeeRace EmployeeRace){
        za.ac.phillipmphela.domain.Employee.EmployeeRace toDelete = findEmployeeRace(EmployeeRace.getraceId());
        if(toDelete != null) {
            this.EmployeeRaces.remove(toDelete);
            return create(EmployeeRace);
        }
        return null;
    }


    public Set<EmployeeRace> getAll(){
        return this.EmployeeRaces;
    }
}
