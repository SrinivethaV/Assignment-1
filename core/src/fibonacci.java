
public class fibonacci {
	    
		 public static void main(String[] args) {
		             fibonacci Fibonacci= new fibonacci();
		                 Fibonacci.printFiboacciAndAverage(20);
		    }
		    
		    private void printFiboacciAndAverage(int n) {
		           long   fb1 = 1;
		        long   fb2 = 1;
		        long   fbn = 0;
		            long   sum = 0;
		        
		        if (n <= 0) {
		                System.out.println("Please correct no of items and try again.");
		            return;
		        }
		        
		        System.out.println("The first " + n + " Fibonacci numbers are:");        
		        for(int i = 1; i <= n; i++) {
		            switch (i) {
		                case 1: 
		                	fbn = fb1;
		                break;
		                case 2: 
		                	fbn = fb2; 
		                break;    
		                default:
		                	fbn = fb1 + fb2;
		                      fb1 = fb2;
		                 fb2 = fbn;
		            }
		            sum += fbn;
		                  System.out.print(fbn + " ");
		        }
		        System.out.println(); 
		      
		          System.out.printf("The average is %.4f \n", (double)sum / n);
		    }
		    
		}

