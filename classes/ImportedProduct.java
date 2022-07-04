package classes;
import java.lang.*;

public class ImportedProduct extends Product
{
	
	
	private String countryName;
	
	
	public void setCountryName(String countryName) 
	{
		this.countryName=countryName;
	}
	
	

	public String getCountryName()
	{
		return countryName;
	}
	
	
	
	
	
	public  void showInfo()
	{
		System.out.println("Product i'd :"+pid);
		System.out.println("Product Name :"+name);
		System.out.println("Product Available Quantity :"+availableQuantity);
		System.out.println("Product Price :"+price);
		System.out.println("Product Country Name :"+countryName);
	}
	
	
}