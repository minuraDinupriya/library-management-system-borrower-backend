package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LogInDto {
    private Long id;
    private String userName;
    private String password;

    public LogInDto(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
