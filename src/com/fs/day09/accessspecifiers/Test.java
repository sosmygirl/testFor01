package com.fs.day09.accessspecifiers;

import com.fs.day09.test.Student;
import com.fs.day09.test.UniversityStudent;

public class Test {
    public static void main(String[] args) {
        Student st = new Student();
        st.gradepu = "一年3班";
        UniversityStudent ust = new UniversityStudent();
        ust.gradepu = "";
        HighStudent highStudent = new HighStudent();
        highStudent.gradepu = "";

    }

}
