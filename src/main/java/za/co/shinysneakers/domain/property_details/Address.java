package za.co.shinysneakers.domain.property_details;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
    // Configuring the Domain Object
    @Id
    private Long address_id;
    private short street_number;
    private String street_name;
    private String suburb;
    private String city;
    private String province;
    private short postal_code;

    // Constructor
    protected Address(Long address_id, short street_number, String street_name, String suburb,
            String city, String province, short postal_code) {
        this.address_id = address_id;
        this.street_number = street_number;
        this.street_name = street_name;
        this.suburb = suburb;
        this.city = city;
        this.province = province;
        this.postal_code = postal_code;
    }

    public Long getAddressID() {
        return address_id;
    }

    public short getStreetNumber() {
        return street_number;
    }

    public String getStreetName() {
        return street_name;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public short getPostalCode() {
        return postal_code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", street_number=" + street_number +
                ", street_name='" + street_name + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postal_code=" + postal_code +
                '}';
    }

}
