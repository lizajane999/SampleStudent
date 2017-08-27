/**
 * A class for Students
 * @author  Lisa Miller from Blanca Polo
 * @since   8/28/16
 */
public class Student{
         
  //instance variables
   
  private String name = "";
  private int id =0;
  private double gpa = -1; //because it is impossible to get a negative GPA
     
  /**
   * Two parameter Student constructor, GPA is default value -1
   * @param    name    the student's name
   * @param    id      the student's ID number
   */
   public Student(String name, int id){
      this.name = name;  
      this.id = id;
   } //constructor ends.
     
   
  /**
   * Three parameter Student constructor
   * @param    name    the student's name
   * @param    id         the student's ID number
   * @param    gpa     the student's GPA
   */
   public Student(String name, int id, double gpa){
      this.name = name;
      this.id = id;
      this.gpa = gpa;
   } //constructor ends.
     
   /**
   * Formats Student object for printing
   * If GPA is default value, prints 
   * GPA not yet calculated
   * @return a String representation of Student
   */
   public String toString( ){
        String s = "";
        s = "Name: "+ this.name;
        s = s+ "\nStudent ID: " + this.id;
        if(this.gpa < 0){

                s= s+"\nGPA not yet calculated";   
        }
        else{
                s = s+"\nGPA: " + this.gpa;
        }
       return s;
   }
//         
        
   /** Gets methods */
   
   /**
   * Retrieves the Student ID
   * @return   the Student's ID number
   */
   public int getID( ){
      return this.id;
   }
   
   /**
   * retrieves the Student GPA
   * @return   the Student's GPA 
   */      
   public double getGPA( ){
      return this.gpa;
   }
   
   /**
   * Retrieves the Student name
   * @return   the Student's name
   */        
   public String getName( ){
      return this.name;
   }             
  
   /* Sets methods */
   
   /**
   * Changes the Student ID
   * @param newID   the Student's new ID number
   */
   public void setID(int newID ){
      this.id = newID;
   }     
   
   /**
   * Changes the Student GPA
   * @param newGPA   the Student's new GPA 
   */     
   public void setGPA(double newGPA ){
      this.gpa = newGPA;
   }
   
   /**
   * Changes the Student name
   * @param newName  the Student's new name
   */        
   public void setName(String newName ){
      this.name = newName;
   }      
  
}// end of class Student

