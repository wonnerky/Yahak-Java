import java.util.Scanner;

public class AccountingIfApp {

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
		
		if(income > 10000.0) {
			shareA = income * 0.5;
			shareB = income * 0.3;
			shareC = income * 0.2;
		} else {
			shareA = income * 1.0;
			shareB = income * 0;
			shareC = income * 0;
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
