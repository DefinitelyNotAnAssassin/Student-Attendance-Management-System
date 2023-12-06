package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sqlite.SQLiteException;

public class Database {
    public Connection conn = null;

    public void connect(String database_name) {
        String database_url = "jdbc:sqlite:D:\\Projects\\StudentAttendanceSystem\\demo\\src\\" + database_name;

        try {
            this.conn = DriverManager.getConnection(database_url);

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void executeStatement(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ResultSet executeSearch(String sql) {
        try {
            Statement stmt = this.conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);
            return result;

        } catch (SQLException e) {
            System.out.println(e);
            ResultSet result = null;
            return result;
        }
    }

    public void viewResult(ResultSet result) {
        try {
            while (result.next()) {
                String firstname, middlename, lastname, program, section, student_number;
                int age;

                firstname = result.getString("firstname");
                middlename = result.getString("middlename");
                lastname = result.getString("lastname");
                program = result.getString("program");
                section = result.getString("section");
                student_number = result.getString("student_number");
                age = result.getInt("age");

                System.out.println("Student Number: " + student_number);
                System.out.println("Firstname: " + firstname);
                System.out.println("Middlename: " + middlename);
                System.out.println("Lastname: " + lastname);
                System.out.println("Program: " + program);
                System.out.println("Section: " + section);
                System.out.println("Age: " + age);

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void createAccount(String firstname, String middlename, String lastname, String program, String section,
            String student_number, int age) {
        String sql = "INSERT INTO student_account (firstname, middlename, lastname, program, section, student_number, age) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, firstname);
            statement.setString(2, middlename);
            statement.setString(3, lastname);
            statement.setString(4, program);
            statement.setString(5, section);
            statement.setString(6, student_number);
            statement.setInt(7, age);

            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public boolean isAccountExisting(String firstname, String lastname, String student_number) throws SQLException {
        ResultSet result = executeSearch(
                "SELECT * FROM student_account WHERE firstname = " + firstname + " AND lastname = "
                        + lastname + " AND student_number = " + student_number);

        if (!result.isBeforeFirst()) {
            return false;
        } else {

            return true;
        }
    }

}
