package com.nttdata.reto.infrastructure.dataacces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Timezone {
    public String offset;
    public String description;
}
