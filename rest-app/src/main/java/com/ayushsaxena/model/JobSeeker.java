package com.ayushsaxena.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class JobSeeker extends User{
    private String universityName;
    private double cgpa;
    private String schoolName;
    private double schoolPercentage;

    public JobSeeker(String universityName, double cgpa, String schoolName, double schoolPercentage, List<String> skillSet) {
        this.universityName = universityName;
        this.cgpa = cgpa;
        this.schoolName = schoolName;
        this.schoolPercentage = schoolPercentage;
        this.skillSet = skillSet;
    }

    public JobSeeker(String firstName, String lastName, LocalDate birthday, String email, String phone, String universityName, double cgpa, String schoolName, double schoolPercentage, List<String> skillSet) {
        super(firstName, lastName, birthday, email, phone);
        this.universityName = universityName;
        this.cgpa = cgpa;
        this.schoolName = schoolName;
        this.schoolPercentage = schoolPercentage;
        this.skillSet = skillSet;
    }
    
    // will be populated by parsing resume
    private List<String> skillSet;

}
