package classes;
import java.lang.*;
import interfaces.*;

public class Market implements ShopOperations,EmployeeOperations 
{
	
	
	private Shop shops[]=new Shop[100];
	private Employee employees[] =new Employee[100];
	
	
	
	
	
	
	public void insertShop(Shop s)
	{
		
		int flag=0;
		
		
		for (int i=0; i<shops.length; i++)
		{
			if(shops[i]==null)
			{
				shops[i]=s;
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Shop Inserted");
		}
		else
		{
			System.out.println("Shop Does Not Inserted");
		}
			
	}
	
	
	
	
	
	
	
	
	public void removeShop(Shop s)
	{
		
		
		
		int flag=0;
		
		
		for (int i=0; i<shops.length; i++)
		{
			if(shops[i]==s)
			{
				shops[i]=null;
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("Shop Removed");
		}
		else
		{
			System.out.println("Shop Does Not Removed");
		}
			
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public void showAllShops()
	{
		
		for (int i=0; i<shops.length; i++)
		{
			if(shops[i]!=null)
			{
				System.out.println("Shop I'd :"+shops[i].getSid());
				System.out.println("Shop Name :"+shops[i].getName());
				shops[i].showAllProducts();
			}
		}
		
	}
	
	
	
	
	
	public  Shop getShop(String sid)
	{
		Shop s=null;
		
		for (int i=0; i<shops.length; i++)
		{
			if(shops[i]!=null)
			{
				if(shops[i].getSid().equals(sid))
				{
					s=shops[i];
					break;
				}
			}
		}
		
		
		return s;
		
	}



















public void insertEmployee(Employee e)
	{
		
		
		
		int flag=0;
		for(int i=0;i<employees.length;i++)
		{
			if (employees[i]==null)
			{
				employees[i]=e;
				flag=1;
				break;
			}
		}
		
		if (flag==1)
		{
			System.out.println("employee inserted");
		}
		else
		{
			System.out.println("employee can not inserted");
		}
		
		
		
	}
	
	
	
	
	
	public void removeEmployee(Employee e)
	{
		
		
		
		int flag=0;
		for(int i=0;i<employees.length;i++)
		{
			if (employees[i]==e)
			{
				employees[i]=null;
				flag=1;
				break;
			}
		}
		
		if (flag==1)
		{
			System.out.println("employee removed");
		}
		else
		{
			System.out.println("employee can not removed");
		}
		
		
		
		
	}
	
	
	
	
	
	
	public void showAllEmployees()
	{
		
		for(int i=0;i<employees.length;i++)
		{
			if (employees[i]!=null)
			{
				System.out.println("employee name:"+employees[i].getName());
				System.out.println("emp Id:"+employees[i].getEmpId());
				System.out.println("Salary:"+employees[i].getSalary());
				
			}
		}
		
	}
	
	
	public  Employee getEmployee(String empId)
	{
		
		
		
		Employee e=null;
			
			for(int i=0; i<employees.length;i++)
			{
				if (employees[i]!=null)
				{
					if ( employees[i].getEmpId().equals(empId) )
					{
						e=employees[i];
						break;
					}
				}
			}
			
			return e;
		
		
		
	}
	
	
	
	
}