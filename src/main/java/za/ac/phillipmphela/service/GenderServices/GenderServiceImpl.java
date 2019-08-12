package za.ac.phillipmphela.service.GenderServices;

import org.springframework.stereotype.Service;
import za.ac.phillipmphela.domain.Gender.Gender;
import za.ac.phillipmphela.repository.GenderRepositories.GenderRepository;
import za.ac.phillipmphela.repository.GenderRepositories.GenderRepositoryImpl;

import java.util.Set;

@Service
public class GenderServiceImpl implements GenderService{

    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl() {
        repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService(){

        if(service == null){
            return new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender Gender) {
        return repository.create(Gender);
    }

    @Override
    public Gender read(String read) {
        return repository.read(read);
    }

    @Override
    public Gender update(Gender Gender) {
        return repository.update(Gender);
    }

    @Override
    public void delete(String delete) {

        repository.delete(delete);

    }
}
