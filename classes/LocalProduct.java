package classes;
import java.lang.*;

public class LocalProduct extends Product
{
	
	private double discountRate;
	
	
	public void setDiscountRate(double discountRate)
	{
		this.discountRate=discountRate;
	}
	
	
	public double getDiscountRate()
	{
		return discountRate;
	}	
 
	
	public  void showInfo()
	{
		System.out.println("Product i'd :"+pid);
		System.out.println("Product Name :"+name);
		System.out.println("Product Available Quantity :"+availableQuantity);
		System.out.println("Product Price :"+price);
		System.out.println("Product Discount Rate :"+discountRate);
	}
	
}