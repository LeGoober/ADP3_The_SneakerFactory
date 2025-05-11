package za.co.shinysneakers.service;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.factory.FlatFactory;

import static org.junit.jupiter.api.Assertions.*;

class FlatServiceTest {
    private IFlatService service;
    Flat flat = FlatFactory.createFlat(
            1L,
            (short) 12,
            "Main Street",
            "Downtown",
            "Cape Town",
            "Western Cape",
            (short) 8000,
            (short) 101,
            "Skyline Towers"
    );
    @Test
    void create() {
        Flat create = service.create(flat);
        assertNotNull(create);
        System.out.println("Created Flat: " + create);
    }

    @Test
    void read() {
        Flat read = service.read(flat.getAddressID());
        assertNotNull(read);
        System.out.println("Read Flat: " + read);
    }

    @Test
    void update() {
        Flat updated = service.update(flat.getAddressID(), flat);
        assertNotNull(updated);
        System.out.println("Updated Flat: " + updated);
    }

    @Test
    void delete() {
        boolean deleted = service.delete(flat.getAddressID());
        assertTrue(deleted);
        System.out.println("Deleted Flat with ID: " + flat.getAddressID());
    }

    @Test
    void getFlats() {
        var flats = service.getFlats();
        assertNotNull(flats);
        System.out.println("Flats List: " + flats);
    }
}