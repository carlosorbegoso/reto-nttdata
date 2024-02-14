package com.nttdata.reto.infrastructure.dataacces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Location {
    public Street street;
    public String city;
    public String state;
    public String country;
    public String postcode;
    public Coordinates coordinates;
    public Timezone timezone;
}
