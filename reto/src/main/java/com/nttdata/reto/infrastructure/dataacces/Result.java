package com.nttdata.reto.infrastructure.dataacces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Result {
    public String gender;
    public Name name;
    public Location location;
    public String email;
    public Login login;
    public DOB dob;
    public Registered registered;
    public String phone;
    public String cell;
    public ID id;
    public Picture picture;
    public String nat;
}
