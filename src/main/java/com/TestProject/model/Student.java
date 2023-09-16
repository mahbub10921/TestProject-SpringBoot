package com.TestProject.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Data
@RequiredArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "firstname should not be null")
    private String firstname;

    @NotNull(message = "firstname should not be null")
    private String lastname;

    @Email(message = "invalid Email")
    private String email;

    @NotNull(message = "username should not be null")
    private String username;

    @NotNull(message = "password should not be null")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    Address address;



}
