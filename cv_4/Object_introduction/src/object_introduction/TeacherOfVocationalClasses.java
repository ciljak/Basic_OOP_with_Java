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
public class TeacherOfVocationalClasses extends Teacher {
    // Vocational topics teacher specific atributes
    private final int WORK_DUTY_IN_HOURS = 22;
    private String completedCourses = "";
    
    // constructors

    public TeacherOfVocationalClasses(String aprobation, String id, String firstname, String lastname, String employedSince, String employedTo, float salaryPerMonth, int workExperienceYears, String completedCourses) {
        super(aprobation, id, firstname, lastname, employedSince, employedTo, salaryPerMonth, workExperienceYears);
        this.completedCourses = completedCourses;
    }
    
    //getters and setters

    public String getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(String completedCourses) {
        this.completedCourses = completedCourses;
    }
    
    /* finnal marked function in parent class can not be overrided
    @override
    public  boolean basicTeacherInfo () { // final method can not be overrided at child class TeacherOfVocationalClasses
        System.out.println("---------------------------------------------------");
        System.out.println("* " +super.getFirstname"() + " " + super.getLastname());
        System.out.println("---------------------------------------------------");
        System.out.println("* With approbation: " + this.approbation );
        System.out.println("* Has working experience: " + super.getWorkExperienceYears());
        System.out.println("---------------------------------------------------");
        return true;
    }
*/
    
    
    
    
    
}
