
package student;

import java.util.Scanner;

/**
 *
 * @author Harish Bondalapati
 */
public class StudentDriver {

    /**
     * Main class to test and invoke Student object and its method
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n*********************************************"
                + "***********\n"
                + "Testing the Student Driver by taking input from console\n"
                + "********************************************************");
        //Declaring and initializing Scanner object
        Scanner scannerObject = new Scanner(System.in);
        
        //Accepting student details as input from console
        System.out.println("Enter first name of the student :");
        String firstNameIn=scannerObject.nextLine();
        System.out.println("Enter last name of the student :");
        String lastNameIn=scannerObject.nextLine();
        System.out.println("Enter Student Id :");
        String studentIdIn=scannerObject.nextLine();
        
        System.out.println("Please note each course is of 3 credit hours."
                + "Please enter the grades(A,B,C,D or F) as prompted");
        System.out.println("Enter grade of Course1 :");
        char gradeOfC1=acceptGrade(scannerObject);
        System.out.println("Enter grade of Course2 :");
        char gradeOfC2=acceptGrade(scannerObject);
        System.out.println("Enter grade of Course3 :");
        char gradeOfC3=acceptGrade(scannerObject);
        
        Student me=new Student(firstNameIn,lastNameIn,studentIdIn,
                Character.toUpperCase(gradeOfC1),
                Character.toUpperCase(gradeOfC2),
                Character.toUpperCase(gradeOfC3),3);
        System.out.println("\nGPA of "+me.getFirstName()+"");
        System.out.println("\nPlease see below details of student:\n"+me);
        
    }
    
    /**
     * Accept a grade(character input) from console
     * 
     * @param scannerObj
     *          Scanner Object to accept input from console
     * @return grade input provided from console
     */
    public static char acceptGrade(Scanner scannerObj){
        char grade=scannerObj.next().charAt(0);
        switch(Character.toUpperCase(grade)){
            case 'A' :
            case 'B' :
            case 'C' :
            case 'D' :
            case 'F' :
                return grade;
            default :
                System.out.print("Invalid input please enter valid grade:\n");
                return acceptGrade(scannerObj);
        }
    }
}
