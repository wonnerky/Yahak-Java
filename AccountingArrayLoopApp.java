import java.util.Scanner;

public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double vos = scan.nextDouble();
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = vos * vatRate;
		double total = vos + vat;
		double expense = vos * expenseRate;
		double income = vos - expense;
		char[] name = {'A', 'B', 'C'};
		double[] share = new double[3];
		double[] rate = {0.5, 0.3, 0.2, 1.0, 0, 0};		
		
		if(income > 10000.0) {
			share[0] = income * rate[0];
			share[1] = income * rate[1];
			share[2] = income * rate[2];
		} else {
			share[0] = income * rate[3];
			share[1] = income * rate[4];
			share[2] = income * rate[5];
		}
		
		System.out.println("Value of Supply : " + vos);
		System.out.println("Vat : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		for(int i=0; i<3; i++) {
			System.out.println("Share " + name[i] + " : " + share[i]);
		}
	}

}
