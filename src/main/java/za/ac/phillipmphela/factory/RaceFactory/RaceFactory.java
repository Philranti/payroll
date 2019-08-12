package za.ac.phillipmphela.factory.RaceFactory;

import za.ac.phillipmphela.domain.Race.Race;
import za.ac.phillipmphela.util.Misc;

public class RaceFactory {
    public static Race createRace(String raceId, String race) {
        return new Race.Builder().createRaceId(Misc.generateId())
                .createRaceId(raceId)
                .Race(race)
                .build();
    }
}