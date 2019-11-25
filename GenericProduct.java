import java.text.NumberFormat;

public class GenericProduct {
	// Initialize fields
	private int productCode;
	private String productDescription;
	private double productPrice;
	private int productCount;
	
	
	// Construct with default values
	public GenericProduct() {
		this(0, "Undefined", 0.00, 0);
	}
	
	// Construct with user provided values
	public GenericProduct(int productCode, String productDescription,
		double productPrice, int productCount) {
		this.productCode = productCode;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCount = productCount;
	}
	
	// method provided in assignment prompt
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.productPrice);
		return formattedPrice;
	}
	
	// Formatted summary of product
	public String toString() {
		String output = String.format("%n--- %s ---", productDescription);
		output += String.format("%nPrice: %7s", getPriceFormatted());
		output += String.format("%nCode: %4d", productCode);
		output += String.format("%nCount: %3d%n", productCount);
		return output;
	}
	
	// Generic getters & setters
	public int getProductCode() {
		return productCode;
	}


	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public int getProductCount() {
		return productCount;
	}
	

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

}
