package com.nttdata.reto.infrastructure.dataacces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Info {
    public String seed;
    public int results;
    public int page;
    public String version;
}
