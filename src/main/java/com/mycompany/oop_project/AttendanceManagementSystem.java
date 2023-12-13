package com.mycompany.attendancemanagementsystem;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;


public class AttendanceManagementSystem {

    public static void createUser() {

    }

    public static void main(String[] args) throws SQLException {
        Database db = new Database();

        db.connect("StudentAttendance.db");

         db.createAccount("winmari22", "1234", "202200815", "Winmari", "Manzano",
         "09/22/2022",
         "winmari.manzano@sdca.edu.ph");

        User current_user = db.authenticateAccount("winmari22", "1234");
         db.createCourse("Computer Concepts and Fundamentals", "IT100");

        Course current_course = db.getCourse("IT100");

         db.studentAttendance(current_user.student_number, current_course.course_id);
         db.viewStudentAttendance(current_user.student_number);
         db.isPresent(current_user.student_number, "2023-12-07",
         current_course.course_id);
        
        // db.loopThroughResultSet(db.executeSearch("SELECT * FROM Students"));

         
    }
    
    
    
    
}
