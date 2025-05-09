package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.util.Helper;

public class HouseFactory {
    public static House createHouse(
        Long address_id,
        short street_number,
        String street_name,
        String suburb,
        String city,
        String province,
        short postal_code,
        int erf_number
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
        if(Helper.isValidErfNumber(erf_number)){
            return null;
        }
        
        return new House.Builder()
        .setAddressID(address_id)
        .setStreetNumber(street_number)
        .setStreetName(street_name)
        .setSuburb(suburb)
        .setCity(city)
        .setProvince(province)
        .setPostalCode(postal_code)
        .setErfNumber(erf_number)
        .build();
    }
}
