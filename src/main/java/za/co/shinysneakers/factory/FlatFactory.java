package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.util.Helper;

public class FlatFactory {
    public static Flat createFlat(
        Long address_id,
        short street_number,
        String street_name,
        String suburb,
        String city,
        String province,
        short postal_code,
        short unit_number,
        String flat_name
    ){

        if(Helper.isNullOrEmpty(street_name)){
            return null;
        }
        if(Helper.isValidPostalCode(postal_code)){
            return null;
        }
        if(Helper.isValidStreetNumber(street_number)){
            return null;
        }
        if(Helper.isValidUnitNumber(unit_number)){
            return null;
        }

        return new Flat.Builder()
        .setAddressID(address_id)
        .setStreetNumber(street_number)
        .setStreetName(street_name)
        .setSuburb(suburb)
        .setCity(city)
        .setProvince(province)
        .setPostalCode(postal_code)
        .settUnitNumber(unit_number)
        .setFlatName(flat_name)
        .build();
    }
}
