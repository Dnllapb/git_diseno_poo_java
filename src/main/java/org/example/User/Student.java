package org.example.User;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
    private float averageGrade;

    List<Course> enrolledCourses;

    public Student(String id, String name, float averageGrade) {

        super(id, name);
        this.averageGrade = 0f;
    }

    public boolean enrroll(Course course) {
        if (enrolledCourses == null) {
            enrolledCourses = new ArrayList<Course>();
        }
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "{'id': "+id +", 'name':"+name+", 'averageGrade': "+ averageGrade
                + ",:'total enrolled courses': "+enrolledCourses.size();
    }

}
