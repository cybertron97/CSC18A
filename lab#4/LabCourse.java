/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanish
 */
public class LabCourse extends CollegeCourse {
    public LabCourse(String dept, int course_NUM, int crdts){
        super(dept,course_NUM,crdts);
        fee=fee+50;
                    
    }
    //overiding the data 
    public void display()
{
System.out.println("This is a LAB course");
System.out.println("Department: " + department);
System.out.println("Course number:  " + course_number);
System.out.println("Credits:  " + credits);
System.out.println("Fee: $ " + fee);
}
    
}
