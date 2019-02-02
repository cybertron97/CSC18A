// Filename ShowStudent.java
// Written by Tanish
// Written on 1/15/17
/* Write a class named ShowStudent that instantiates a Student object from the
class you created and assign values to its fields. Compute the Student grade point
average, and then display all the values associated with the Student. Save the
application as ShowStudent.java
*/
public class ShowStudent {
    public static void main(String[] args){{
	student s = new student();
	
	s.setStudentId(1234);
	s.setHours(3);
	s.setPoints(12);
	s.setGPA();
	s.displayStudentDetails();
        System.out.println("");
	
}
}
}
