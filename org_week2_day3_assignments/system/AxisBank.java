package org.system;

public class AxisBank extends BankInfo{

		public void deposit() {
			System.out.println("Deposit method in AxisBank Class");
		}
		public static void main(String[] args) {
			AxisBank ab = new  AxisBank();
			ab.saving();
			ab.fixed();
			ab.deposit();
	}

}
