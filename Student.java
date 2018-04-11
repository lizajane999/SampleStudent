/**
 * A class Student.
 * @author  Lisa Miller from Blanca Polo
 * @since   8/20/2017
 */
public class Student {
          
   /** The Student's name. */
   private String name = "";
   /** The Student's ID number. */
   private int id = 0;
   /** The Student's grade point average. */
   private double gpa = -1;
        
   /**
   * Two parameter Student constructor, GPA is default value -1.
   * @param newName the student's name
   * @param newID the student's ID number
   */
   public Student(String newName, int newID) {
      this.name = newName;  
      this.id = newID;
   } //constructor ends.
      
    
   /**
    * Three parameter Student constructor.
    * @param  newName    the student's name
    * @param  newID         the student's ID number
    * @param  newGPA     the student's GPA
   */
   public Student(String newName, int newID, double newGPA) {
      this.name = newName;
      this.id = newID;
      this.gpa = newGPA;
   } //constructor ends.
      
   /**
    * Formats Student object for printing.
    * If GPA is default value, prints. 
    * GPA not yet calculated.
    * @return a String representation of Student
   */
   public String toString() {
      String s = "";
      s = "Name: " + this.name;
      s = s + "\nStudent ID: " + this.id;
      if (this.gpa < 0) {
         s = s + "\nGPA not yet calculated";   
      } 
      else {
         s = s + "\nGPA: " + this.gpa;
      }
      return s;
   }
         
         
   /** Gets methods. */
  
   /**
   * Retrieves the Student ID.
   * @return   the Student's ID number
   */
   public int getID() {
      return this.id;
   }
    
   /**
   * retrieves the Student GPA.
   * @return   the Student's GPA 
   */      
   public double getGPA() {
      return this.gpa;
   }
    
   /**
   * Retrieves the Student name.
   * @return   the Student's name
   */        
   public String getName() {
      return this.name;
   }             
   
   /* Sets methods. */
  
   /**
   * Changes the Student ID.
   * @param newID   the Student's new ID number
   */
   public void setID(int newID) {
      this.id = newID;
   }     
  
   /**
   * Changes the Student GPA.
   * @param newGPA   the Student's new GPA 
   */     
   public void setGPA(double newGPA) {
      this.gpa = newGPA;
   }
  
   /**
   * Changes the Student name.
   * @param newName  the Student's new name
   */        
   public void setName(String newName) {
      this.name = newName;
   }      
   
} // end of class Student

