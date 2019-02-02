/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanish
 */
import java.util.*;
public class UseCourse {
    public static void main(String[] args)
   {

   Scanner in = new Scanner(System.in);
   System.out.println("Enter course Department :");
   String dept = in.next();
   System.out.println("Enter course Number :");
   int course_NUM = in.nextInt();
   System.out.println("Enter course Credits :");
   int crdts = in.nextInt();
//If the user enters a class in any of the following departments, create a LabCourse: BIO, CHM, CIS, or PHY.
   if(dept.equals("BIO") || dept.equals("CHM") || dept.equals("CIS") || dept.equals("PHY"))
   {
       LabCourse lab = new LabCourse(dept, course_NUM, crdts);
       lab.display();
   }

   else
   {
       CollegeCourse College = new CollegeCourse(dept, course_NUM, crdts);
       College.display();
   }
// Then display the course data.

   }
}
