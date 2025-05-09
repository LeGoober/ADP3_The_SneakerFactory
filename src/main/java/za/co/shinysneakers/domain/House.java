package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import za.co.shinysneakers.domain.property_details.Address;
@Entity
public class House extends Address {
    private int erf_number;

    public int getErfNumber() {
        return erf_number;
    }

    protected House(Builder builder) {
        super(
                builder.address_id,
                builder.street_number,
                builder.street_name,
                builder.suburb,
                builder.city,
                builder.province,
                builder.postal_code);
        this.erf_number = builder.erf_number;
    }

    public static class Builder {
        private int erf_number;

        private Long address_id;
        private short street_number;
        private String street_name;
        private String suburb;
        private String city;
        private String province;
        private short postal_code;

        public Builder setErfNumber(int erf_number) {
            this.erf_number = erf_number;
            return this;
        }

        public Builder setAddressID(Long address_id){
            this.address_id = address_id;
            return this;
        }
        public Builder setStreetNumber(short street_number) {
            this.street_number = street_number;
            return this;
        }

        public Builder setStreetName(String street_name) {
            this.street_name = street_name;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(short postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        public Builder copy(House house) {
            this.erf_number = erf_number;
            this.street_number = street_number;
            this.street_name = street_name;
            this.suburb = suburb;
            this.city = city;
            this.province = province;
            this.postal_code = postal_code;
            return this;
        }

        public House build() {
            return new House(this);
        }

    }
}
