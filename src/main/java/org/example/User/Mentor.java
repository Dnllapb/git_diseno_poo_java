package org.example.User;

import java.util.List;

public class Mentor extends User{

    private float yearsOfExperience;

    private boolean isActive;

    List<Course> coursesToTeach;

    public Mentor (String id, String name, float yearsOfExperience, boolean isActive)
    {
        super(id,name);
        this.yearsOfExperience = yearsOfExperience;
        this.isActive = isActive;

    }

    public float getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<Course> getCoursesToTeach() {
        return coursesToTeach;
    }

    public void setCoursesToTeach(List<Course> coursesToTeach) {
        this.coursesToTeach = coursesToTeach;
    }
}
