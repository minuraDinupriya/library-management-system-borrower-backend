package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BorrowerDto {
    private long bid;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String address2;
    private String country;
    private String contactNumber;
}
