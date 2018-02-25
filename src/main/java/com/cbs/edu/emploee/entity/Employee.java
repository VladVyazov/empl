package com.cbs.edu.emploee.entity;

import lombok.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String login;
    private String password;
    private int age;
    private double salary;
    private boolean isMarried;
    private Date birthday;
    private boolean admin;
}
