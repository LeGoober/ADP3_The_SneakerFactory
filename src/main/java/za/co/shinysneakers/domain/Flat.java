package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import za.co.shinysneakers.domain.property_details.Address;

@Entity
public class Flat extends Address {
    private short unit_number;
    private String flat_name;

    protected Flat(Builder builder) {
        super(
                builder.address_id,
                builder.street_number,
                builder.street_name,
                builder.suburb,
                builder.city,
                builder.province,
                builder.postal_code);
        this.unit_number = builder.unit_number;
        this.flat_name = builder.flat_name;
    }

    public static class Builder {
        private short unit_number;
        private String flat_name;
        @Id
        private Long address_id;
        private short street_number;
        private String street_name;
        private String suburb;
        private String city;
        private String province;
        private short postal_code;

        public Builder settUnitNumber(short unit_number) {
            this.unit_number = unit_number;
            return this;
        }

        public Builder setFlatName(String flat_name) {
            this.flat_name = flat_name;
            return this;
        }

        public Builder setAddressID(Long address_id) {
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

        public Builder copy(Flat flat) {
            this.unit_number = unit_number;
            this.flat_name = flat_name;
            this.street_number = street_number;
            this.street_name = street_name;
            this.suburb = suburb;
            this.city = city;
            this.province = province;
            this.postal_code = postal_code;
            return this;
        }

        public Flat build() {
            return new Flat(this);
        }
    }
}
