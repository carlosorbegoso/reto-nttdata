package com.nttdata.reto.infrastructure.dataacces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Login {
    String uuid;
    String username;
    String password;
    String salt;
    String md5;
    String sha1;
    String sha256;
}
