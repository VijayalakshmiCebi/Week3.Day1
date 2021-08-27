package week3.Day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("AxisBank deposit");
	}
	
	

	public static void main(String[] args) {
		BankInfo bObj = new BankInfo();
		AxisBank aObj = new AxisBank();
		System.out.println("calling Bankinfo methods");
		bObj.deposit();
		bObj.fixed();
		bObj.saving();
		System.out.println("calling AxisBank methods");
		aObj.deposit();
		aObj.fixed();
		aObj.saving();

	}

}
