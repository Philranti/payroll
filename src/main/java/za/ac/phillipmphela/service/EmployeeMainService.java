package za.ac.phillipmphela.service;

public interface EmployeeMainService  <T, ID> {
    T create(T type);
    T update(T type);
    void delete(ID id);
    T read(ID id);
}

