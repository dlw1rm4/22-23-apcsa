
/**
 * Write a description of class StudentGPA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentGPA
{
    String myName;
    String myID;
    int myTotalPoints;
    int myNumGrades;
    double myGPA;
    public StudentGPA(String name, String id)
    {
        myName = name;
        myID = id;
        myTotalPoints = 0;
        myNumGrades = 0;
        myGPA = 0;
    }
    public void addGrade(int grade)
    {
        myNumGrades++;
        myTotalPoints += grade;
    }
    public double getGPA()
    {
        return (double) myTotalPoints / myNumGrades;
    }
}
