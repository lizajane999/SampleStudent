/**
* A driver program for Student objects.
* @author Lisa Miller
* @since 4/2/2018
*/

public class School {
   /**
   * main method.
   * @param args not used.
   */
   public static void main(String [] args) {
   
      Student s1 = new Student("Bob", 12,  3.5);
      Student s2 = new Student("Jane", 13, 0.5);
      Student s3 = new Student("Ikaika", 23, 9.8);
      String s = "";
      int i = 0;
      double d = 0.0;
      //cant access private instance variable
//       s = s1.sName;
      s = s1.getName();
      System.out.println(s);
      
      i = s2.getID();
      System.out.println(i);
      
      d = s1.getGPA();
      System.out.println(d);
      
      System.out.println(s2.toString());
      s2.setGPA(3.25);
      //d = s2.getGPA();
      //System.out.println(d);
      System.out.println(s2.toString());
//       System.out.println(s1.toString());
//       System.out.println(s2.toString());
//       System.out.println(s3.toString());
   
   
   }

}