
import java.util.Scanner; 
public class nextdate {
	public static void main(String[] args) {
			
			
			int day, month, year;
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("day");
			day = scanner.nextInt();

			System.out.println("month");
			month = scanner.nextInt();

			System.out.println("year");
			year = scanner.nextInt();

			System.out.println("current date: " + day + "/" + month + "/" + year);

			
			int noOfDaysInaMonth[]={-1, 31,28,31,30,31,30,31,31,30,31,30,31};

			  if(isLeapYear(year)){
				noOfDaysInaMonth[2]=29;
			  }
			  
			  day=day+1; 

			  if(day > noOfDaysInaMonth[month]){
				day=1;
				month++;
				if(month > 12){
					month=1;
					year++;
				}

			  }  
			  System.out.println("next date: " + day + "/" + month + "/" + year);  
		}

		public static boolean isLeapYear(int year) {
			if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
				return true;
			else
				return false;
		}
	}


