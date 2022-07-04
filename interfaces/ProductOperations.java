package interfaces;

import java.lang.*;
import classes.*;

public interface ProductOperations 
{
	
	public abstract void insertProduct(Product p); 
	public abstract void removeProduct(Product p); 
	public abstract void showAllProducts();
	
	public abstract Product getProduct(String pid);
	
	
}