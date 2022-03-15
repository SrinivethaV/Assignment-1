package question5;

import javax.activity.InvalidActivityException;

public class User_registration {
	
		public void registerUser(String username, String userCountry) throws Throwable {
			if (!userCountry.equals("India"))
				throw new Exception();
			else
				System.out.println("User registration done successfully");
			
			
		}

		public static void main(String[] args) throws Throwable {
			// TODO Auto-generated method stub
			User_registration registration = new User_registration();
			
			try {
				registration.registerUser("Jonas", "UK");
				//registration.registerUser("Nivi", "India");
			} catch (InvalidActivityException e) {
				//System.out.println(e.getMessage());
			}
		}

	}

