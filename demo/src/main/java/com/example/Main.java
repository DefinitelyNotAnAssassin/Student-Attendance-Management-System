package com.example;

import com.Database;
import java.sql.SQLException;

public class Main {

  public static void createUser() {}

  public static void main(String[] args) throws SQLException {

    Database db = new Database();

    db.connect("StudentAttendance.db");
    db.createAccount(
        "student", "1234", "1234", "Student", "Student", "12-08-2023", "student@gmail.com");
  }
}
