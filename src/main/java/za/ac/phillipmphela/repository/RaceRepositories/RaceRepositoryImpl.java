package za.ac.phillipmphela.repository.RaceRepositories;

import za.ac.phillipmphela.domain.Race.Race;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class RaceRepositoryImpl implements RaceRepository {
    private static RaceRepositoryImpl repository = null;
    private Set<Race> Races;

    private RaceRepositoryImpl(){
        this.Races = new HashSet<>();
    }
    // problem possibility
    private Race findRace(String RaceId) {
        return this.Races.stream()
                .filter(new Predicate<Race>() {
                    @Override
                    public boolean test(Race RaceId) {
                        return RaceId.getRaceId().trim().equals(RaceId);
                    }
                })
                .findAny()
                .orElse(null);
    }

    public static RaceRepositoryImpl getRepository(){
        if (repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }


    public Race create(Race Race){
        this.Races.add(Race);
        return Race;
    }

    public Race read(final String genderId){
        Race Race = findRace(genderId);
        return Race;
    }

    public void delete(String genderId) {
        Race Race = findRace(genderId);
        if (Race != null) this.Races.remove(Race);
    }

    public Race update(Race Race){
        za.ac.phillipmphela.domain.Race.Race toDelete = findRace(Race.getRaceId());
        if(toDelete != null) {
            this.Races.remove(toDelete);
            return create(Race);
        }
        return null;
    }


    public Set<Race> getAll(){
        return this.Races;
    }
}
