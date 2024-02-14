package com.nttdata.reto.infrastructure.dataacces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Picture {
    public String large;
    public String medium;
    public String thumbnail;
}
