package salesTax;

public class tax {
	int qnty = 0;
	String productName = null;
	float price = 0.0f;
	boolean imported = false;
	boolean exempted = false;
	float tax = 0.0f;

	void calculatedSalesTax() {
		// use else if whenever applicable
		// if you use only 'if' everywhere, all the 'if' checks will be done
		// which will waste computation time
		// whereas using 'else if ' will not check other 'if' conditions if any one is true.
		float totalTax = 0.0f;
		if(imported)
			totalTax = 0.0f;
		else
			if(!exempted)
				totalTax = .1f;
			else
				if((imported) && (!exempted))
					totalTax = .15f;
		tax = totalTax * price;

	}

	public String toString() {
		float p = price + tax;
		return qnty + " " + productName + " at " + p;
	}

}
