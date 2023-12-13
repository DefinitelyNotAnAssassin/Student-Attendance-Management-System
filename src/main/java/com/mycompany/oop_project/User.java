package com.mycompany.attendancemanagementsystem;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    String student_number, first_name, last_name, email;
    String username;
    String birthdate;

    public User(String username, String first_name, String last_name, String email, String birthdate,
            String student_number) {

        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.birthdate = birthdate;
        this.student_number = student_number;

    }

    public User() {

    }

}
