package lesson8.homework_2;

import java.util.Date;

/**
 * Created by dereban on 24.05.2017.
 */
public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;
    Student[] students;

    public Course ( Date startDate, String name, int hoursDuration, String teacherName, Student[] students ) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.students = students;
    }
}
