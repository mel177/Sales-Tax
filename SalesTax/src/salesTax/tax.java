

package salesTax;

public class tax {
	int qnty = 0;
	String productName = null;
	float price = 0.0f;
	boolean imported = false;
	boolean exempted = false;
	float tax = 0.0f;
	
	void calculatedSalesTax() {
		float totalTax = 0.0f;
		if(imported)
			totalTax = 0.0f;
		if(!exempted)
			totalTax = .1f;
		if((imported) && (!exempted))
			totalTax = .15f;
		tax = totalTax * price;
			
	}
	
	public String toString() {
		float p = price + tax;
		return qnty + " " + productName + " at " + p;
	}

}
