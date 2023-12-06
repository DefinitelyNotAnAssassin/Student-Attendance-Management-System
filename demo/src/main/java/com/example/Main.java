package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import com.Database;

public class Main {

    public static void createUser() {

    }

    public static void main(String[] args) throws SQLException {
        Database db = new Database();

        db.connect("students.db");

        System.out.println(db.isAccountExisting("'Winmari'", "'Manzano'", "'202200815'"));
    }
}