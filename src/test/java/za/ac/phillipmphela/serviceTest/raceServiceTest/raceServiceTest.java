package za.ac.phillipmphela.serviceTest.raceServiceTest;


import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.phillipmphela.domain.Race.Race;
import za.ac.phillipmphela.factory.RaceFactory.RaceFactory;
import za.ac.phillipmphela.repository.RaceRepositories.RaceRepositoryImpl;
import za.ac.phillipmphela.service.RaceServices.RaceService;
import za.ac.phillipmphela.service.RaceServices.RaceServiceImpl;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class raceServiceTest {
    private RaceRepositoryImpl repository;
    private Race Race;
    private RaceService service;


    private Race getSaved(){
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.Race = RaceFactory.createRace("Rc04", "Indian");
    }

    @Test
    public void a_create() {
        Race created = this.repository.create(this.Race);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.Race);
    }

    @Test
    public void c_update() {
        String raceId = "Rc04";
        Race updated = new Race.Builder().createRaceId(raceId).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(raceId, updated.getRaceId());
    }

    @Test
    public void e_delete() {
        Race saved = getSaved();
        this.repository.delete(saved.getRaceId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Race race = RaceFactory.createRace("Rc04", "Indian");

        repository.read(race.getRaceId());



        Assert.assertNotNull(race.getRaceId());
    }

    @Test
    public void d_getAll() {
        Set<Race> Races = this.repository.getAll();
        System.out.println("In getall, all = " + Races);
    }

}
