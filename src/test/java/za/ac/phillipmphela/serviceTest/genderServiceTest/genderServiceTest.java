package za.ac.phillipmphela.serviceTest.genderServiceTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.domain.Race.Race;
import za.ac.phillipmphela.factory.GenderFactory.GenderFactory;
import za.ac.phillipmphela.repository.GenderRepositories.GenderRepositoryImpl;
import za.ac.phillipmphela.service.GenderServices.GenderService;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class genderServiceTest {

    private GenderRepositoryImpl repository;
    private Gender gender;
    private GenderService service;


    private Gender getSaved() {
        return this.repository.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.createEmployee("Fem301", "Female");
    }

    @Test
    public void a_create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.gender);
    }

    @Test
    public void c_update() {
        String genderId = "Fem300";
        Gender updated = new Gender.Builder().createGenderId(genderId).build();
        System.out.println("In update, updated = " + updated);
        this.repository.update(updated);
        Assert.assertSame(genderId, updated.getGenderId());
    }

    @Test
    public void e_delete() {
        Gender saved = getSaved();
        this.repository.delete(saved.getGenderId());
        d_getAll();
    }

    @Test
    public void b_read() {
        Gender gender = GenderFactory.createEmployee("Fem301", "Female");

        repository.read(gender.getGenderId());


        Assert.assertNotNull(gender.getGenderId());
    }

    @Test
    public void d_getAll() {
        Set<Gender> Races = this.repository.getAll();
        System.out.println("In getall, all = " + Races);
    }

}