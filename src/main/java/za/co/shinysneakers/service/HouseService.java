package za.co.shinysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.repository.HouseRepository;

import java.util.List;

@Service
public class HouseService implements IHouseService {

    private final HouseRepository repository;

    @Autowired
    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    @Override
    public House create(House house) {
        return repository.save(house);
    }

    @Override
    public House read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public House update(Long id, House house) {
        if (repository.existsById(id)) {
            return repository.save(house);
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
    public List<House> getHouses() {
        return repository.findAll();
    }
}
