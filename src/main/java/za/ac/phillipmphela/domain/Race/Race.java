package za.ac.phillipmphela.domain.Race;

import java.util.Objects;

public class Race {
    private String raceId;
    private  String race = "black, white, indians, coloureds";

    private Race(){

    }

    private Race(Builder builder){
        this.raceId = builder.raceId;
        this.race = builder.race;
    }

    public String getRaceId() {
        return raceId;
    }

    public String getRace() {
        return race;
    }

    public static class Builder{
        private String raceId, race;

        public Builder createRaceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder Race(String race) {
            this.race = race;
            return this;
        }

        public Race build() {
            return new Race(this);
        }


        public Builder copy(Race rc){
            this.raceId = rc.raceId;
            this.race = rc.race;
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Race race1 = (Race) o;
        return Objects.equals(raceId, race1.raceId) &&
                Objects.equals(race, race1.race);
    }

    @Override
    public int hashCode() {
        return Objects.hash(raceId, race);
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceId='" + raceId + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
