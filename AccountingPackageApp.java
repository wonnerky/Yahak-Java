import java.util.Scanner;
import accountingPackage.AccountingPackage;

public class AccountingPackageApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		AccountingPackage.vos = scan.nextDouble();		
		AccountingPackage.expenseRate = 0.3;
		AccountingPackage.print();
	}

	
}
