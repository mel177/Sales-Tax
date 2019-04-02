package salesTax;
import java.util.*;

public class SalesTax {

	// Creating object 'tax' of Class type 'Tax'
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SalesTax SalesTax  = new SalesTax();
		Scanner input = new Scanner(System.in);
		// The ArrayList 'list' should have have the type as 'Tax' specified in <>
		ArrayList list = new ArrayList();
		int numProduct = 1;
		while (true) {
			tax Tax = new tax();
			System.out.println("Add Products: " + numProduct);
			System.out.println("Quantity: ");
			int qnty = input.nextInt();
			Tax.qnty = qnty;
			System.out.println("Product Name: ");
			String product = input.next();
			Tax.productName = product;
			System.out.println("Price: ");
			float p = input.nextFloat();
			Tax.price = p;
			System.out.println("Imported Item[y/n]: ");
			String imp = input.next();
			if(imp.toLowerCase().contentEquals("y"))
				Tax.imported = true;
			System.out.println("Exempted Item[y/n]: ");
			String exp = input.next();
			if(exp.toLowerCase().contentEquals("y"))
				Tax.exempted = true;
			Tax.calculatedSalesTax();
			list.add(Tax);
			numProduct++;
			System.out.println("Add More Items[y/n]: ");
			String add = input.next();
			if (add.toLowerCase().equals("n"))
				break;
	}

		float tprice = 0.0f;
		float ttax = 0.0f;
		for(int i = 0; i < list.size(); i++) {
			tax Tax = (tax)list.get(i);
			tprice += Tax.price;
			ttax += Tax.tax;
			System.out.println(Tax);
			}
		System.out.println("Sales Taxes:" + ttax);
		System.out.println("Total: " + (tprice +ttax));
		
	}
}