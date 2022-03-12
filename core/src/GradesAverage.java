import java.util.Scanner;

public class GradesAverage {
	    private final int LOWEST_GRADE  = 0;
	    private final int HIGHEST_GRADE = 100;
	    
	  
	    private int[] grades;
	    
	    private Scanner in;
	    
	   
	    public static void main(String[] args)
	    {
	    	GradesAverage aGradesAverage = new GradesAverage();
	        aGradesAverage.in = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numOfStudents = aGradesAverage.in.nextInt();
	                
	        aGradesAverage.run(numOfStudents);
	    }
	    private void run(int numOfStudents)
	    {
	        if (numOfStudents <= 0) {
	            System.out.println("Invalid number of students.");
	            return;
	        }        
	        grades = new int[numOfStudents];
	        
	        double Sum = 0;
	        int    i   = 0;
	        while (i < numOfStudents)
	        {
	            System.out.printf("Enter the Grade for student %1$d: ", (i+1));
	            int grade = in.nextInt();
	            
	           
	            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) {
	                grades[i] = grade;
	                Sum      += grade;
	                i++;
	                continue;
	            }
	            System.out.println("Invalid grade, try again...");
	        }
	        System.out.printf("The average is %1$.2f\n", (Sum / numOfStudents));
	    }
	}


