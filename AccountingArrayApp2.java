import java.util.Scanner;

public class AccountingArrayApp2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double vos = scan.nextDouble();
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = vos * vatRate;
		double total = vos + vat;
		double expense = vos * expenseRate;
		double income = vos - expense;
		
		double shareA;
		double shareB;
		double shareC;
		double[] rate = {0.5, 0.3, 0.2, 1.0, 0, 0};		
		
		if(income > 10000.0) {
			shareA = income * rate[0];
			shareB = income * rate[1];
			shareC = income * rate[2];
		} else {
			shareA = income * rate[3];
			shareB = income * rate[4];
			shareC = income * rate[5];
		}
		
		System.out.println("Value of Supply : " + vos);
		System.out.println("Vat : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Sahre A : "+ shareA);
		System.out.println("Sahre B : "+ shareB);
		System.out.println("Sahre C : "+ shareC);
		
		
		

	}

}
