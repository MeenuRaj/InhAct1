//This is the main class
import java.text.NumberFormat;

public class Product   //this is how to make a class abstract
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    
    public Product()
    {
        code = "";
        description = "";
        price = 0;
        System.out.println("This is the super class");
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public static void setCount(int count) {
		Product.count = count;
	}
	public String getFormattedPrice() {
		 NumberFormat currency = 
		            NumberFormat.getCurrencyInstance();
		        return currency.format(price);
		
	}
	// create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
    
    public boolean equals(Product product)
    {
    	if (this.code == product.getCode() && this.description == product.getDescription() && this.price == product.getPrice())
    		return true;
    	else
    		return false; 
    }

}

