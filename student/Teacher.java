
public class Teacher {
   private String name;
   private int employeeID;
   private double salary;
   
   public Teacher() {
	   name = "John Doe";
      employeeID = 0;
      salary = 0.0;
   }
   
   public Teacher(String n, int id, double sal) {
      name = n;
      employeeID = id;
      salary = sal;
   }
   
   public String getName()  {
      return name;
   }
   public int getID(){
      return employeeID;
   }
   public double getSalary()  { 
      return salary;
   }
   
   public void setName(String n) {
      name = n;
   }
   public void setID(int id)     {
      employeeID = id;
   }
   public void setSalary(double sal) {
      salary = sal;
   }
   
   public void raiseSalaryByPercent(double x) {
      x = x/100;
      salary *= (1+x);
   }
   

   public String toString()  {
      return (name + ": " + employeeID + ": " + salary);
   } 
}
