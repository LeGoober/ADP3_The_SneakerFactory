package za.co.shinysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.repository.FlatRepository;

import java.util.List;

@Service
public class FlatService implements IFlatService {

    private final FlatRepository repository;

    @Autowired
    public FlatService(FlatRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flat create(Flat flat) {
        return repository.save(flat);
    }

    @Override
    public Flat read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Flat update(Long id, Flat flat) {
        if (repository.existsById(id)) {
            return repository.save(flat);
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Flat> getFlats() {
        return repository.findAll();
    }
}
