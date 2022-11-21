
/**
 * Write a description of class StudentGPAMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
import chn.util.*;
public class StudentGPAMain
{
    public static void main(String args[])
    {
        ConsoleIO console = new ConsoleIO();
        
        System.out.print("\nStudent's name: ");
        String name = console.readLine();
        
        System.out.print("Student's ID: ");
        String id = console.readToken();
        
        StudentGPA stu = new StudentGPA(name, id);
        
        System.out.println("\nInitial GPA: 0.0");
        
        System.out.print("\nEnter a grade: ");
        stu.addGrade(console.readInt());
        System.out.print("GPA: " + Format.right(stu.getGPA(), 4, 2) + "\n");
        
        System.out.print("\nEnter a grade: ");
        stu.addGrade(console.readInt());
        System.out.print("GPA: " + Format.right(stu.getGPA(), 4, 2) + "\n");
        
        System.out.print("\nEnter a grade: ");
        stu.addGrade(console.readInt());
        System.out.print("GPA: " + Format.right(stu.getGPA(), 4, 2) + "\n");
    }
}
