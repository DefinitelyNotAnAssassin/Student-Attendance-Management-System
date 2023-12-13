package com.mycompany.attendancemanagementsystem;

import java.awt.Component;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.time.LocalDate;
import org.sqlite.SQLiteException;
import java.sql.Date;
import javax.swing.JOptionPane;



public class Database {
      
    public Connection conn = null;

    public void connect(String database_name) {
        String database_url = "jdbc:sqlite:D:\\VB.NET\\AttendanceManagementSystem\\src\\main\\java\\com\\mycompany\\attendancemanagementsystem\\" + database_name;

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
    
  public void loopThroughResultSet(ResultSet resultSet) {
    try {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            System.out.println("Row:");

            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                Object columnValue = resultSet.getObject(i);

                System.out.println("  " + columnName + ": " + columnValue);
            }

            System.out.println(); // Separate rows with an empty line
        }
    } catch (SQLException e) {
        System.out.println("Error while looping through ResultSet: " + e.getMessage());
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

    public boolean isAccountExisting(String student_number) {
        ResultSet result = executeSearch("SELECT * FROM Students WHERE student_number = " + student_number);
        try {
            if (!result.isBeforeFirst()) {
                return false;
            } else {

                return true;
            }
        }

        catch (SQLException e) {
            System.out.println(e);
        }
        return false;

    }

    public void studentAttendance(String student_number, int course_id) {

        try {

            Date today = Date.valueOf(LocalDate.now());

            String isExisting = "SELECT * FROM Attendance WHERE student_id = " + student_number + " "
                    + "AND attendance_date = " + '\'' + today + "\' " + " AND course_id = " + course_id
                    + " AND is_present = 1";
            System.out.println(isExisting);
            ResultSet present = executeSearch(isExisting);

            if (!present.isBeforeFirst()) {
                String sql = "INSERT INTO Attendance (student_id, attendance_date, is_present, course_id) VALUES (?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, student_number);
                statement.setString(2, today.toString());
                statement.setInt(3, 1);
                statement.setInt(4, course_id);
                statement.execute();
                System.out.println("" + student_number + " Attendance Success.");
            } else {
                System.out.println("Attendance / Student Already Present for " + today + "at Course #" + course_id);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    

    public void viewStudentAttendance(String student_number) {

        try {

            if (isAccountExisting(student_number)) {
                String sql = "SELECT Attendance.is_present,Attendance.attendance_date, Attendance.student_id, Courses.course_name, Courses.course_code FROM attendance JOIN Courses on Attendance.course_id = Courses.course_id  WHERE Attendance.student_id = "
                        + student_number;
                ResultSet result = executeSearch(sql);

                if (!result.isBeforeFirst()) {
                    System.out.println("No Attendance Record Found for Student #" + student_number);
                } else {
                    while (result.next()) {
                        System.out.println(
                                "==============================================================================");
                        System.out.println("Course Name: " + result.getString("course_name"));
                        System.out.println("Course Code: " + result.getString("course_code"));
                        System.out.println("Date: " + result.getString("attendance_date"));
                        System.out.println(
                                "==============================================================================");
                        System.out.println("\n\n");
                    }
                }
            } else {
                System.out.println("Invalid Student Number");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void isPresent(String student_number, String date, int course_id) {
        if (isAccountExisting(student_number)) {
            String sql = "SELECT Attendance.is_present, Attendance.attendance_date, Courses.course_name, Courses.course_code FROM Attendance JOIN Courses ON Attendance.course_id = Courses.course_id WHERE Attendance.attendance_date = "
                    + '\'' + date + '\''
                    + " AND student_id = " + student_number + " AND Attendance.course_id = " + course_id;
            try {
                ResultSet result = executeSearch(sql);
                if (!result.isBeforeFirst()) {
                    System.out.println("No Attendance Record Found for Student #" + student_number + "on " + date
                            + " at Course #" + course_id);
                } else {
                    System.out.println(
                            student_number + " is present on " + result.getString("course_name") + " at " + date);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }

        } else {
            System.out.println("Invalid Student Number");
        }
    }

    public void createAccount(String username, String password, String student_number, String first_name,
            String last_name, String birthdate, String email) {
        String sql = "INSERT INTO Students (username, password, student_number, first_name, last_name, birthdate, email) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, student_number);
            statement.setString(4, first_name);
            statement.setString(5, last_name);
            statement.setString(6, birthdate);
            statement.setString(7, email);

            statement.execute();
             JOptionPane.showMessageDialog(null, "Account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error creating account: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public User authenticateAccount(String username, String password) {
        String authenticate = "SELECT * FROM Students WHERE username = " + "\'" + username + "\' " + "AND password = "
                + '\'' + password + '\'';

        try {
            ResultSet result = executeSearch(authenticate);
            if (!result.isBeforeFirst()) {
               JOptionPane.showMessageDialog(null, "Incorrect username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                
                
                
                
                User user = new User();
                return user;
            } else {
                JOptionPane.showMessageDialog(null, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                while (result.next()) {
                    String first_name, last_name, email, student_number;
                    String birthDate;

                    first_name = result.getString("first_name");
                    last_name = result.getString("last_name");
                    birthDate = result.getString("birthdate");
                    email = result.getString("email");
                    student_number = result.getString("student_number");
                    User account = new User(username, first_name, last_name, email, birthDate, student_number);
                    return account;
                }

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;

    }

    public void createCourse(String course_name, String course_code) {
        String sql = "INSERT INTO Courses (course_name, course_code) VALUES (?, ?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, course_name);
            statement.setString(2, course_code);
            statement.execute();

            System.out.println("Course Added");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void viewCourse(String course_code) {
        String sql = "SELECT * FROM Courses WHERE course_code = " + "\'" + course_code + "\'";

        ResultSet result = executeSearch(sql);
        try {
            if (!result.isBeforeFirst()) {
                System.out.println("Invalid Course Code");
            } else {

                while (result.next()) {
                    System.out.println("Course ID: " + result.getInt("course_id"));
                    System.out.println("Course Name: " + result.getString("course_name"));
                    System.out.println("Course Code: " + result.getString("course_code"));

                }
            }
        }

        catch (SQLException e) {
            System.out.println(e);
        }

    }

    public Course getCourse(String course_code) {
        String sql = "SELECT * FROM Courses WHERE course_code = " + '\'' + course_code + '\'';
        System.out.println(sql);
        ResultSet result = executeSearch(sql);
        try {
            if (!result.isBeforeFirst()) {
                System.out.println("Invalid Course Code");
                return null;
            } else {

                while (result.next()) {
                    Course c = new Course(result.getString("course_name"), result.getString("course_code"),
                            result.getInt("course_id"));
                    return c;
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    
}
