import java.util.Arrays;

public class Student {
	private String name;
	private int studentID;
	private double[] grades;

	public Student() { // DEFAULT 
	   name = "John Doe";
	   grades = new double[5];
	   studentID = 0;

	}
	
	public Student(String n, int id) { // n and ID CONSTRUCTOR
		name = n;
		studentID = id;
		grades = new double[5];
	}
		   
	public String getName()  {
		return name;
	}
	public int getID()       {
		return studentID;
	}
	
	public double getGrade(int i)  {
		return grades[i];
	}
	

	public double getAvgGPA() { 
		double sum = 0.0;
		for(int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		double averageGPA = sum/grades.length;
		if(averageGPA < 3.0) {
			System.out.println("Warning: Your GPA is less than 3.0!");
		}
		return averageGPA;
	}
	
	public int numOfFailedClass() {
		int x = 0;
		for(int i = 0; i < grades.length; i++) {
			if(grades[i] < 3.0) {
				x++;
			}
		}
		return x;
	}
		   
	public void setName(String n) {
		name = n;
	}
	public void setID(int id)     {
		studentID = id;
	}
	
	public void setGrade(int i, double g) {
		grades[i] = g;
	}
	
	public void setGrades(double g1, double g2, double g3, double g4, double g5)  {
		grades[0] = g1;
		grades[1] = g2;
		grades[2] = g3;
		grades[3] = g4;
		grades[4] = g5;
	}
	
	public String toString()  {
		return (name + ": " + studentID + ": " + Arrays.toString(grades));
	} 
}
