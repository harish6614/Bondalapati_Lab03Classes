
package student;

/**
 * The class contains Store attributes which can be used to define a Store.
 * This class can be used to determine GPA(Grade point average) ,grade points
 * current grade ,etc. of a student
 * 
 * @author Harish Bondalapati
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentId;
    private char gradeOfCourse1;
    private char gradeOfCourse2;
    private char gradeOfCourse3;
    private int creditHoursOfC1;
    private int creditHoursOfC2;
    private int creditHoursOfC3;
    
    /**
     * Initializes a newly created Student object without setting values to 
     * attributes
     * 
     */
    public Student(){
    }
    
    /**
     * Initializes a Student object for which all the courses have equal
     * credit hours
     * 
     * @param firstName
     * @param lastName
     * @param studentId
     * @param gradeCourse1
     * @param gradeCourse2
     * @param gradeCourse3
     * @param creditHours
     */
    public Student(String firstName, String lastName, String studentId,
            char gradeCourse1, char gradeCourse2, char gradeCourse3,
            int creditHours){
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentId=studentId;
        this.gradeOfCourse1=gradeCourse1;
        this.gradeOfCourse2=gradeCourse2;
        this.gradeOfCourse3=gradeCourse3;
        this.creditHoursOfC1=creditHours;
        this.creditHoursOfC2=creditHours;
        this.creditHoursOfC3=creditHours;
    }
    
    /**
     * Initializes a Student object with each course and its credit hours
     * passed as arguments
     * 
     * @param firstName
     * @param lastName
     * @param studentId
     * @param gradeCourse1
     * @param creditHoursOfC1
     * @param gradeCourse2
     * @param creditHoursOfC2
     * @param gradeCourse3
     * @param creditHoursOfC3
     */
    public Student(String firstName, String lastName, String studentId,
            char gradeCourse1,int creditHoursOfC1, char gradeCourse2,
            int creditHoursOfC2, char gradeCourse3,int creditHoursOfC3){
        this.firstName=firstName;
        this.lastName=lastName;
        this.studentId=studentId;
        this.gradeOfCourse1=gradeCourse1;
        this.gradeOfCourse2=gradeCourse2;
        this.gradeOfCourse3=gradeCourse3;
        this.creditHoursOfC1=creditHoursOfC1;
        this.creditHoursOfC2=creditHoursOfC2;
        this.creditHoursOfC3=creditHoursOfC3;
    }

    /**
     * Returns the first name of the student
     * 
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of a student
     * 
     * @param firstName
     * sets
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the student
     *
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of a student
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the student identification number of the student
     * 
     * @return student id
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Sets the student id with the argument passed
     * 
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * Returns the grade of course1 of the student
     * 
     * @return grade of course1
     */
    public char getGradeOfCourse1() {
        return gradeOfCourse1;
    }

    /**
     * Sets the grade of course1 with the argument passed
     * 
     * @param gradeOfCourse1
     */
    public void setGradeOfCourse1(char gradeOfCourse1) {
        this.gradeOfCourse1 = gradeOfCourse1;
    }

    /**
     * Returns the grade of course2 of the student
     * 
     * @return grade of course2
     */
    public char getGradeOfCourse2() {
        return gradeOfCourse2;
    }

    /**
     * Sets the grade of course2 with the argument passed
     * 
     * @param gradeOfCourse2
     */
    public void setGradeOfCourse2(char gradeOfCourse2) {
        this.gradeOfCourse2 = gradeOfCourse2;
    }

    /**
     * Returns the grade of course3 of the student
     * 
     * @return grade of course3
     */
    public char getGradeOfCourse3() {
        return gradeOfCourse3;
    }

    /**
     * Sets the grade of course3 with the argument passed
     * 
     * @param gradeOfCourse3
     */
    public void setGradeOfCourse3(char gradeOfCourse3) {
        this.gradeOfCourse3 = gradeOfCourse3;
    }

    /**
     * Returns the credit hours of course1 of the student
     * 
     * @return credit hours of course1
     */
    public int getCreditHoursOfC1() {
        return creditHoursOfC1;
    }

    /**
     * Sets the Credit Hours of course1 with the argument passed
     * 
     * @param creditHoursOfC1
     */
    public void setCreditHoursOfC1(int creditHoursOfC1) {
        this.creditHoursOfC1 = creditHoursOfC1;
    }

    /**
     * Returns the credit hours of course2 of the student
     * 
     * @return credit hours of course2
     */
    public int getCreditHoursOfC2() {
        return creditHoursOfC2;
    }

    /**
     * Sets the Credit Hours of course2 with the argument passed
     * 
     * @param creditHoursOfC2
     */
    public void setCreditHoursOfC2(int creditHoursOfC2) {
        this.creditHoursOfC2 = creditHoursOfC2;
    }

    /**
     * Returns the credit hours of course3 of the student
     * 
     * @return credit hours of course3
     */
    public int getCreditHoursOfC3() {
        return creditHoursOfC3;
    }

    /**
     * Sets the Credit Hours of course3 with the argument passed
     * 
     * @param creditHoursOfC3
     */
    public void setCreditHoursOfC3(int creditHoursOfC3) {
        this.creditHoursOfC3 = creditHoursOfC3;
    }
    
    /**
     * Returns total grade points earned by the student
     * 
     * @return grade points
     */
    public double getTotalGradePoints(){
        double gradePoints;
        gradePoints=this.toGradePoint(gradeOfCourse1)*creditHoursOfC1 +
                this.toGradePoint(gradeOfCourse2)*creditHoursOfC2 +
                this.toGradePoint(gradeOfCourse3)*creditHoursOfC3;
        return gradePoints;
    }
    
    /**
     * Returns grade point average(GPA) of the student.
     * 
     * The formula used for GPA is total grade points earned divided by the
     * total credit hours attempted.
     * 
     * Total grade points earned is calculated by summing grade points 
     * for each course.
     * <br>
     * Total Grade Points=sum(GradePointOfCourse*CreditHoursOfCourse)
     * <br>
     * Total Credit Hours=sum(CreditHoursOfCourse)
     * <br>
     * GPA=Total Grade Points/Total Credit Hours
     * <br>
     * Please find below reference used to calculate GPA.
     * <br>
     * <a href="http://www.back2college.com/gpa.htm#unicode">Link Reference</a>
     * 
     * 
     * @return grade point average(GPA)
     */
    public double getGPA(){
        double gpa;
        gpa=this.getTotalGradePoints()/
                (creditHoursOfC1+creditHoursOfC2+creditHoursOfC3);
        return gpa;
    }
    
    /**
     * Returns overall Student's grade
     * 
     * @return overall grade
     */
    public char studentGrade(){
        if(gradeOfCourse1 == 'F' || gradeOfCourse2 == 'F' || 
                gradeOfCourse3 == 'F' ){
            return 'F';
        }
        else{
            switch((int)this.getGPA()){
                case 4 : return 'A';
                case 3 : return 'B';
                case 2 : return 'C';
                case 1 : return 'D';
                default : return 'F';
            }
        }
    }
        
    /**
     * Return grade points equivalent for the character grade passed
     * 
     * @param grade
     * @return grade points equivalent to the grade
     */
    public double toGradePoint(char grade){
        double gradePoints;
        switch(Character.toUpperCase(grade)){
            case 'A':
                gradePoints=4.0;
                break;
            case 'B':
                gradePoints=3.0;
                break;
            case 'C':
                gradePoints=2.0;
                break;
            case 'D':
                gradePoints=1.0;
                break;
            case 'F':
                gradePoints=0.0;
                break;
            default:
                gradePoints=0.0;
                break;
        }
        return gradePoints;
    }    
    
    @Override
    public String toString(){
        return "Name :"+lastName+", "+firstName
                +"\nStudent ID :"+studentId
                +"\nGrade of Course1 :"+gradeOfCourse1
                +"\nGrade of Course2 :"+gradeOfCourse2
                +"\nGrade of Course3 :"+gradeOfCourse3
                +"\nTotal Credit hours Attempted :"+(creditHoursOfC1
                +creditHoursOfC2+creditHoursOfC3)
                +"\nGPA(Grade Point Average) :"+this.getGPA()
                +"\nCurrent Grade :"+this.studentGrade();
    }
}
