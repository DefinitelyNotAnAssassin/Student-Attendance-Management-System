package com.example;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

import com.Database;

public class Main {

    public static void createUser() {

    }

    public static void main(String[] args) throws SQLException {

        Database db = new Database();

        db.connect("StudentAttendance.db");
        db.createAccount("student", "1234", "1234", "Student", "Student", "12-08-2023", "student@gmail.com");

    }
}