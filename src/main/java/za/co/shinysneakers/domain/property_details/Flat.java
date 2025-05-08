package za.co.shinysneakers.domain.property_details;

import za.co.shinysneakers.domain.Address;

public class Flat extends Address {
    private int erf_number;

    public static class Builder{
        private int erf_number;
        private Builder setErfNumber(int erf_number){
            this.erf_number = erf_number;
            return this;
        }
    }
}
