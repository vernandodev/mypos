package com.vernandodev.mypos.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class Registration {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

}
