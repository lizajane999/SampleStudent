import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
* StudentTest - a JUnit test for Student.java
* @author Lisa Miller
* @since 8/28/16
*/

public class StudentTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * Constructor test 1
   * Checks three parameter constructor and getName method
   */
   @Test public void constructorTest1(){
      Student s = new Student("Janice Doe", 596, 2.74);
      Assert.assertEquals("GetName returns incorrect name.", s.getName(), "Janice Doe");
   
   }

   /**
   * Constructor test 2
   * Checks three parameter constructor and getID method
   */
   @Test public void constructorTest2(){
      Student s = new Student("Jayzee Doe", 13, 1.6);
      Assert.assertEquals("getId returns incorrect Student ID", s.getID(), 13);
   
   }
   
   /**
   * Constructor test 3
   * Checks three parameter constructor and getGPA method
   */
   @Test public void constructorTest3(){
      Student s = new Student("Jocelyn Doe", 13, 4.5);
      Assert.assertEquals("getGPA returns incorrect GPA", s.getGPA(), 4.5, 0.0f);
   
   }
   
   /**
   * Constructor default GPA test
   * Checks that two parameter constructor sets GPA to -1
   */
   @Test public void defaultGPATest(){
      Student s = new Student("Jane Doe", 1);
      Assert.assertEquals("GPA is not set to the correct default value.", s.getGPA(), -1.0, 0.0f);
   
   }
   
   /**
   * testing toString method
   * checks that toString is properly formatted.
   */
   @Test public void toStringTest1(){
      Student s = new Student("Jane Doe", 1, 3.5);
      String sName = s.getName();
      int sID = s.getID();
      double sGPA = s.getGPA();
      Assert.assertEquals("toString return String format is not correct.",  
         "Name: Jane Doe\nStudent ID: 1\nGPA: 3.5", s.toString());
   
   }
   /**
   * testing toString method with default GPA
   * checks that toString is properly formatted.
   */
   @Test public void toStringTest2(){
      Student s = new Student("John Doe", 22);
      String sName = s.getName();
      int sID = s.getID();
      double sGPA = s.getGPA();
      Assert.assertEquals("toString return String format is not correct if GPA not set.",  
         "Name: John Doe\nStudent ID: 22\nGPA not yet calculated", s.toString());
   
   }
   /**
   * Tests setName method
   * Checks to see that new name is set
   */
   @Test public void setNameTest(){
      Student s = new Student("Jon Doe", 234, 3.7);
      String newName = new String("Jackson Buck");
      s.setName(newName);
      Assert.assertTrue("setName method problem, call to getName after returns incorrect name", s.getName().equals(newName));   
   }
   /**
   * Tests setGPA method
   * Checks to see that new gpa is set
   */
   @Test public void setGPATest(){
      Student s = new Student("Jane Doe", 27, 2.6);
      double newGPA = 3.45;
      s.setGPA(newGPA);
      Assert.assertTrue("setGPA method problem, call to getGPA after returns incorrect value", s.getGPA()== newGPA);   
  }
  
  /**
   * Tests setID method
   * Checks to see that new ID is set
   */
   @Test public void setIDTest(){
      Student s = new Student("Jane Doe", 27, 2.6);
      int newID = 277;
      s.setID(newID);
      Assert.assertTrue("setID method problem, call to getID after returns incorrect value", s.getID()== newID);   
  }

}
