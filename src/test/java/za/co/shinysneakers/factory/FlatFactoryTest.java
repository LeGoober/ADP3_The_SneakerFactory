package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Flat;

import static org.junit.jupiter.api.Assertions.*;

class FlatFactoryTest {

    @Test
    void createFlat_shouldReturnFlatWithCorrectAttributes() {
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

        assertNotNull(flat);
        assertEquals(1L, flat.getAddressID());
        assertEquals(12, flat.getStreetNumber());
        assertEquals("Main Street", flat.getStreetName());
        assertEquals("Downtown", flat.getSuburb());
        assertEquals("Cape Town", flat.getCity());
        assertEquals("Western Cape", flat.getProvince());
        assertEquals(8000, flat.getPostalCode());

    }
}
