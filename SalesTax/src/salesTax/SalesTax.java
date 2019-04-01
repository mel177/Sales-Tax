package salesTax;
import java.util.*;

public class tax {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SalesTax SalesTax  = new SalesTax();
		Scanner input = new Scanner(System.in);
		ArrayList list = new ArrayList();
		int numProduct = 1;
		while (true) {
			Tax tax = new Tax();
			System.out.println("Add Products: " + numProduct);
			System.out.println("Quantity: ");
			int qnty = input.nextInt();
			tax.qnty = qnty;
			System.out.println("Product Name: ");
			String product = input.next();
			tax.productName = product;
			System.out.println("Price: ");
			float p = input.nextFloat();
			tax.price = p;
			System.out.println("Imported Item[y/n]: ");
			String imp = input.next();
			if(imp.toLowerCase().contentEquals("y"))
				tax.imported = true;
			System.out.println("Exempted Item[y/n]: ");
			String exp = input.next();
			if(exp.toLowerCase().contentEquals("y"))
				tax.exempted = true;
			tax.calculatedSalesTax();
			list.add(tax);
			numProduct++;
			System.out.println("Add More Items[y/n]: ");
			String add = input.next();
			if (add.toLowerCase().equals("n"))
				break;
	}

		float tprice = 0.0f;
		float ttax = 0.0f;
		for(int i = 0; i < list.size(); i++) {
			Taxes tax = list.get(i);
			tprice += tax.price;
			ttax += tax.tax;
			System.out.println(tax);
			}
		System.out.println("Sales Taxes:" + ttax);
		System.out.println("Total: " + (tprice +ttax));
		
	}
}
