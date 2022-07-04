package interfaces;
import classes.*;

public interface ShopOperations 
{
	
	public abstract void insertShop(Shop s); 
	public abstract void removeShop(Shop s);
	public abstract void showAllShops(); 
	
	
	public abstract Shop getShop(String sid); 
}