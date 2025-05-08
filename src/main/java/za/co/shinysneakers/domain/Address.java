package za.co.shinysneakers.domain;

public class Address {
    //Configuring the Domain Object
    private Long address_id;
    private short street_number;
    private String street_name;
    private String suburb;
    private String city;
    private String province;
    private short postal_code;

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

    //Constructor
    protected Address() {}

    //Builder constructor for Domain
    private Address(Builder builder) {
        this.address_id = builder.address_id;
        this.street_number = builder.street_number;
        this.street_name = builder.street_name;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
    }

    public static class Builder {
        private Long address_id;
        private short street_number;
        private String street_name;
        private String suburb;
        private String city;
        private String province;
        private short postal_code;

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

        public Builder copy(){
            this.address_id = address_id;
            this.street_number = street_number;
            this.street_name = street_name;
            this.suburb = suburb;
            this.city = city;
            this.province = province;
            this.postal_code = postal_code;
            return this;
        }

        public Address build(Address address) {
            return new Address(this);
        }
    }
}
