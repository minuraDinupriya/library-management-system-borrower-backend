package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bid;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String address2;
    private String country;
    private String contactNumber;
}