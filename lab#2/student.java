// Filename student.java
// Written by Tanish
// Written on 1/15/17
/* Create a class named Student. A Student has fields for an ID number, number of
credit hours earned, and number of points earned. (For example, many schools
compute grade point averages based on a scale of 4, so a three-credit-hour class in
which a student earns an A is worth 12 points.) Include methods to assign values
to all fields. A Student also has a field for grade point average. Include a method
to compute the grade point average field by dividing points by credit hours
earned. Write methods to display the values in each Student field. Save this class
as Student.java.
*/
public class student {   
    private int id;
		private int hours;
		private int points;
		private double GPA;  
		
		
		public student(int id,int points , int hours){
			setStudentId(id);
			setHours(hours);
			setPoints(points);
			setGPA();
			
			
			
		}
		public student(){
			setStudentId(9999);
			setHours(3);
			setPoints(12);
			setGPA();
			
			
		}
              
                public void setStudentId(int id)
			{
				this.id = id;
			}
		public int getStudId()
			{
				return id;
			}
		public void setHours(int hours)
			{
				this.hours = hours;
			}
		public int getHours()
			{
				return hours;
			}
		public void setPoints(int points)
			{
				this.points = points;
			}
		public int getPoints()
			{
				return points;
			}
		public void setGPA()
			{
				GPA = points/ hours;
			}
		public double getGPA()
			{
				return GPA;
			}
                
		public void displayStudentDetails()
			{
                            
				System.out.println("Student Id: " + getStudId());
				System.out.println("Credit Hours Earned: " + getHours());
				System.out.println("Points Earned: " + getPoints());
				System.out.println("Grade Point Average: " + getGPA());
			}
 
	
 
    }
    

