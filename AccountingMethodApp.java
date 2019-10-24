import java.util.Scanner;

public class AccountingMethodApp {
	public static double vos;
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		vos = scan.nextDouble();		
		expenseRate = 0.3;
		print();
	}

	private static double[] getShare() {
		double[] share = new double[3];
		double[] rate = {0.5, 0.3, 0.2, 1.0, 0, 0};	
		
		if(getIncome() > 10000.0) {
			for(int i=0; i<share.length; i++)
				share[i] = getIncome() * rate[i];
		} else {
			for(int i=0; i<share.length; i++)
				share[i] = getIncome() * rate[i+3];
		}
		
		return share;
	}

	private static void print() {
		char[] name = {'A', 'B', 'C'};
		double[] share = getShare();
		System.out.println("Value of Supply : " + vos);
		System.out.println("Vat : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		for(int i=0; i<3; i++) {
			System.out.println("Share " + name[i] + " : " + share[i]);
		}
	}

	private static double getIncome() {
		return vos - getExpense();
	}

	private static double getExpense() {
		return vos * expenseRate;
	}

	private static double getTotal() {
		return vos + getVAT();
	}

	private static double getVAT() {
		vatRate = 0.1;
		return vos * vatRate;
	}
}
