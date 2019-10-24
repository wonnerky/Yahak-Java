import java.util.Scanner;

public class AccountingApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Double vos = scan.nextDouble();
		Double vat = vos*0.1;
		System.out.println("Value of Supply : "+vos);
		System.out.println("Vat : "+ vat);
		System.out.println("Total : "+(vos+vat));
		
		Double expenseRatio = scan.nextDouble();
		Double expense = vos*(expenseRatio/100);
		System.out.println("Expense : " + expense);
		Double income = vos - expense;
		double shareA = scan.nextDouble();
		double shareB = scan.nextDouble();
		double shareC = scan.nextDouble();
		
		System.out.println("Sahre A : "+ (income * shareA)/(shareA + shareB + shareC));
		System.out.println("Sahre B : "+ (income * shareB)/(shareA + shareB + shareC));
		System.out.println("Sahre C : "+ (income * shareC)/(shareA + shareB + shareC));
		
		
		

	}

}
