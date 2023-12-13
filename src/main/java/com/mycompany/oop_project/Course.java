package com.mycompany.attendancemanagementsystem;

public class Course {
    String course_name, course_code;
    int course_id;

    public Course(String course_name, String course_code, int course_id) {
        this.course_name = course_name;
        this.course_code = course_code;
        this.course_id = course_id;

    }

    // Hack : When values are NULL then disregard the object

    public Course() {

    }
}
