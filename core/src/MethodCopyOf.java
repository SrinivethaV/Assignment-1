import java.util.Arrays;
public class MethodCopyOf {
	public static void main(String args[])
	    {
	        
	        int[] org = new int[] {41, 62 ,39};
	  
	        System.out.println("Setted Array");
	        for (int i = 0; i < org.length; i++)
	            System.out.print(org[i] + " ");
	  
	        
	        int[] copy = Arrays.copyOf(org, 5);
	  
	        
	        copy[3] = 11;
	        copy[4] = 95;
	  
	        System.out.println("\nNew array copy after modifications:");
	        for (int i = 0; i < copy.length; i++)
	            System.out.print(copy[i] + " ");
	    }
	}


