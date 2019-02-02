/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanish
 */
public class CollegeCourse {
protected String department; // (for example, ENG), the
protected int course_number;// (for example, 101), the
protected int credits; //(for example, 3), and the
protected double fee; // for the course (for example, $360).


public CollegeCourse(String dept, int course_NUM, int crdts)
{
    // All of the fields are required as arguments to the constructor
department = dept;
course_number = course_NUM;
credits = crdts;
fee = credits*120; // at $120 per credit hour.
}
// Include a display() method 
public void display()
{
System.out.println("Department: " + department);
System.out.println("Course number: " + course_number);
System.out.println("Credits:  " + credits);
System.out.println("Total Fee:$  " + fee);
}
    
    
}
