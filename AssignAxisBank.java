package week3day1;

public class AssignAxisBank extends AssignBankInfo {

	public void deposit() {
		System.out.println("The new deposit amount is : 600000");

	}

	public static void main(String[] args) {
		AssignAxisBank obj = new AssignAxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();

	}

}
