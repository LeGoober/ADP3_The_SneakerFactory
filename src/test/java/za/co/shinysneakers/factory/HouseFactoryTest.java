package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.House;

import static org.junit.jupiter.api.Assertions.*;

class HouseFactoryTest {

    @Test
    void createHouse_shouldReturnHouseWithCorrectAttributes() {
        House house = HouseFactory.createHouse(
                2L,
                (short) 25,
                "Maple Avenue",
                "Greenside",
                "Johannesburg",
                "Gauteng",
                (short) 2193,
                123456 // erf number
        );

        assertNotNull(house);
        assertEquals(2L, house.getAddressID());
        assertEquals(25, house.getStreetNumber());
        assertEquals("Maple Avenue", house.getStreetName());
        assertEquals("Greenside", house.getSuburb());
        assertEquals("Johannesburg", house.getCity());
        assertEquals("Gauteng", house.getProvince());
        assertEquals(2193, house.getPostalCode());

    }
}
