/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_introduction;

/**
 *
 * @author Phenom
 */
public class Employee { // new parent class for all school employees
    private String id;
    private String firstname;
    private String lastname;
    
    private String employedSince;
    private String employedTo;
    private float salaryPerMonth;
    private int workExperienceYears;

    // constructors
    public Employee(String id, String firstname, String lastname, String employedSince, String employedTo, float salaryPerMonth, int workExperienceYears) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.employedSince = employedSince;
        this.employedTo = employedTo;
        this.salaryPerMonth = salaryPerMonth;
        this.workExperienceYears = workExperienceYears;
    }

    public Employee(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // all geters and seters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmployedSince() {
        return employedSince;
    }

    public void setEmployedSince(String employedSince) {
        this.employedSince = employedSince;
    }

    public String getEmployedTo() {
        return employedTo;
    }

    public void setEmployedTo(String employedTo) {
        this.employedTo = employedTo;
    }

    public float getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(float salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public int getWorkExperienceYears() {
        return workExperienceYears;
    }

    public void setWorkExperienceYears(int workExperienceYears) {
        this.workExperienceYears = workExperienceYears;
    }

    
    
    
    
    
    
    
    
}
