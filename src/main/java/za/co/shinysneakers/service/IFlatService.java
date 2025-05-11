package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.Flat;
import java.util.List;

public interface IFlatService extends IService<Flat, Long> {
    List<Flat> getFlats(); // Optional flat-specific method
}
