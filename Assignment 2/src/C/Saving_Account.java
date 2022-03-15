package C;

public class Saving_Account {

		private double interest=5.0;
		private double maxWithdrawAmountLimit;
		private double minimumBalance;

		public Saving_Account(String name, String accountNumber, double accountBalance, 
				double interest,double minimumBalance) {
			super();
			this.interest=interest;
			this.minimumBalance=minimumBalance;
			
			this.maxWithdrawAmountLimit=accountBalance-minimumBalance;
		}
		
		public double getBalance() {
			return getBalance()*(100+interest)/100;
		}
		
		public void withdraw(double amount) {
			if(amount<=maxWithdrawAmountLimit) {
				setAccount_Balance(getBalance()-amount);
				System.out.println("amount "+ amount+" is withdrawn");
			}else
				System.out.println("You can not withdraw as min balance required ...");
		}


		private void setAccount_Balance(double d) {
			
			
		}

		@Override
		public String toString() {
			return super.toString()+ 
					" interest=" + interest + ","
					+ " maxWithdrawAmountLimit=" + maxWithdrawAmountLimit
					+ ", minimumBalance=" + minimumBalance + "]";
		}
	}



