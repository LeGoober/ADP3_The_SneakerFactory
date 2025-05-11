package za.co.shinysneakers.service;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.factory.HouseFactory;

import static org.junit.jupiter.api.Assertions.*;

class HouseServiceTest {
    private IHouseService service;

    House house = HouseFactory.createHouse(
            2L,
            (short) 34,
            "Oak Avenue",
            "Greenside",
            "Johannesburg",
            "Gauteng",
            (short) 2193,
            789101
    );

    @Test
    void create() {
        House created = service.create(house);
        assertNotNull(created);
        System.out.println("Created House: " + created);
    }

    @Test
    void read() {
        House read = service.read(house.getAddressID());
        assertNotNull(read);
        System.out.println("Read House: " + read);
    }

    @Test
    void update() {
        House updated = service.update(house.getAddressID(), house);
        assertNotNull(updated);
        System.out.println("Updated House: " + updated);
    }

    @Test
    void delete() {
        boolean deleted = service.delete(house.getAddressID());
        assertTrue(deleted);
        System.out.println("Deleted House with ID: " + house.getAddressID());
    }

    @Test
    void getHouses() {
        var houses = service.getHouses();
        assertNotNull(houses);
        System.out.println("Houses List: " + houses);
    }
}
