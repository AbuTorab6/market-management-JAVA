import java.lang.*;
import classes.*;
import interfaces.*;
import fileio.*;
import java.util.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Market m = new Market();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		boolean choice = true;
		
		while(choice)
		{
			System.out.println("Choose from the following options: ");
			System.out.println("---------------------------------------");
			System.out.println("1. Employee Management");
			System.out.println("2. Shop Management");
			System.out.println("3. Shop Product Management");
			System.out.println("4. Product Quantity Add-Sell");
			System.out.println("5. Exit");
			System.out.println("---------------------------------------\n");
			
			System.out.print("You have choosed: ");
			int option = sc.nextInt();
			
			switch(option)
			{
				case 1:
				    
					System.out.println("*********************");
				    System.out.println("Employee Management");
					System.out.println("What do you want to do?\n");
			        System.out.println("---------------------------------------");
			        System.out.println("1. Insert New Employee");
			        System.out.println("2. Remove Existing Employee");
			        System.out.println("3. Show All Employees");
			        System.out.println("4. Search An Employee");
			        System.out.println("5. Go Back");
					System.out.println("---------------------------------------\n");
					System.out.print("Enter your option: ");
					int input1 = sc.nextInt();
					
					
					
					switch(input1)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Insert New Employee");
							
							System.out.println("Enter Employee ID: ");
							String empId1 = sc.next();
							
							System.out.println("Enter Employee Name: ");
							String name1 = sc.next();
							
							System.out.println("Enter Employee Salary: ");
							double salary = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary);
							
							m.insertEmployee(e1);
							
							
						    System.out.println("#######################");
						    break;
							
						case 2:
						
						    System.out.println("#####################");
							System.out.println("Remove Existing Employee");
							
							System.out.print("Enter Employee ID: ");
							String empId2 = sc.next();
							
							Employee e2 = m.getEmployee(empId2);
							m.removeEmployee(e2);
						
							
						    System.out.println("#######################");
						    break;
							
						case 3:
						
						    System.out.println("#######################");
						    System.out.println("Show All Employees");
							
							m.showAllEmployees();
						    System.out.println("#######################");
						    break;
							
						case 4:
						
						    System.out.println("#######################");
						    System.out.println("Search An Employee");
							
							System.out.print("Enter Employeee ID: ");
							String empId4 = sc.next();
							
							Employee e4 = m.getEmployee(empId4);
							
							if(e4 != null)
							{
								System.out.println("Employee ID: "+e4.getEmpId());
								System.out.println("Employee Name: "+e4.getName());
								System.out.println("Employee Salary: "+e4.getSalary());
							}
							else
							{
								System.out.println("Employee Does not Exists");
							}
							
						    System.out.println("#######################");
						    break;
							
						case 5:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
						default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
						
					}
					System.out.println("*********************");
				    break;
					
				case 2:
				    
					System.out.println("*********************");
				    
				    System.out.println("Shop Management");
					System.out.println("What do you want to do?\n");
			        System.out.println("---------------------------------------");
			        System.out.println("1. Insert New Shop");
			        System.out.println("2. Remove Existing Shop");
			        System.out.println("3. Show All Shops");
			        System.out.println("4. Search A Shop");
			        System.out.println("5. Go Back");
					System.out.println("---------------------------------------\n");
					System.out.print("Enter your option: ");
					int input2 = sc.nextInt();

					switch(input2)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Insert New Shop");
							
							System.out.println("Enter Shop ID: ");
							String sid1 = sc.next();
							
							System.out.println("Enter shop Name: ");
							String name1 = sc.next();
							
							
							
							Shop s1 = new Shop();
							s1.setSid(sid1);
							s1.setName(name1);
							
							
							m.insertShop(s1);
							
							
						    System.out.println("#######################");
						    break;
							
						case 2:
						
						    System.out.println("#######################");
						    System.out.println("Remove Existing Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							
							Shop s2 = m.getShop(sid2);
							m.removeShop(s2);
							
						    System.out.println("#######################");
						    break;
							
						case 3:
						
						    System.out.println("#######################");
						    System.out.println("Show All Shops");
							
							m.showAllShops();
						    System.out.println("#######################");
						    break;
							
						case 4:
						
						    System.out.println("#######################");
						    System.out.println("Search A Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							
							Shop s4 = m.getShop(sid4);
							
							if(s4 != null)
							{
								System.out.println("Shop ID: "+s4.getSid());
								System.out.println("Shop Name: "+s4.getName());
								s4.showAllProducts();
							}
							else
							{
								System.out.println("Shop Does not Exists");
							}
							
						    System.out.println("#######################");
						    break;
							
						case 5:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
						default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid Choice");
						    System.out.println("#######################");
						    break;
						
					}
					
				    System.out.println("*********************");
				    break;
					
				case 3:
				    
					System.out.println("*********************");
				    System.out.println("Shop Product Management");
					
					System.out.println("What do you want to do?\n");
			        System.out.println("---------------------------------------");
			        System.out.println("1. Insert New Product for a Shop");
			        System.out.println("2. Remove An Existing Product of a Shop");
			        System.out.println("3. Show All Products of a Shop");
			        System.out.println("4. Search A Product of a Shop");
			        System.out.println("5. Go Back");
					System.out.println("---------------------------------------\n");
					System.out.print("Enter your option: ");
					int input3 = sc.nextInt();
					
					switch(input3)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Insert New Product for a Shop");
							
							System.out.println("Which Type of Product Do you want to create?");
							System.out.println("1. Local Product");
							System.out.println("2. Imported Product");
							System.out.println("3. Go Back");
							
							System.out.print("Your Type: ");
							int type = sc.nextInt();
							
							Product p = null;
							
							if(type == 1)
							{
								System.out.print("Enter Product ID: ");
								String pi1= sc.next();
								System.out.print("Enter Product Name: ");
								String product1 = sc.next();
								System.out.print("Enter Available Quantity of Product: ");
								int aq1= sc.nextInt();
								System.out.print("Enter Price of Product: ");
								double pr1 = sc.nextDouble();
								System.out.print("Enter Discount Rate: ");
								double dr1 = sc.nextDouble();
								
								LocalProduct lp = new LocalProduct();
								
								lp.setPid(pi1);
								lp.setName(product1);
								lp.setAvailableQuantity(aq1);
								lp.setPrice(pr1);
								lp.setDiscountRate(dr1);
								
								p = lp;
							}
							else if(type == 2)
							{
								System.out.print("Enter Product ID: ");
								String pi1= sc.next();
								System.out.print("Enter Product Name: ");
								String product1 = sc.next();
								System.out.print("Enter Available Quantity of Product: ");
								int aq1= sc.nextInt();
								System.out.print("Enter Price of Product: ");
								double pr1 = sc.nextDouble();
								System.out.print("Enter Country Name: ");
								String cn1 = sc.next();
								
								ImportedProduct ip = new ImportedProduct();
								
								ip.setPid(pi1);
								ip.setName(product1);
								ip.setAvailableQuantity(aq1);
								ip.setPrice(pr1);
								ip.setCountryName(cn1);
								
								p = ip;
							}
							else if(type == 3)
							{
								System.out.println("Go Back");
							}
							else
							{
								System.out.println("Invalid Type");
							}
							
							if(p != null)
							{
								System.out.print("Enter Shop ID: ");
								String sid1 = sc.next();
							try
							{
								m.getShop(sid1).insertProduct(p);
							}
							catch(NullPointerException npe)
		                    {
			                    System.out.println("NullPointerException occured");
		                    }
							
							}
							
						    System.out.println("#######################");
						    break;
							
						case 2:
						
						    System.out.println("#######################");
						    System.out.println("Remove An Existing Product of a Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Product ID: ");
							String pi2 = sc.next();
							/*System.out.print("Enter Available Quantity of Product: ");
							int aq2= sc.nextInt();
							System.out.print("Enter Price of Product: ");
							double product2 = sc.nextDouble();
							*/
							try
							{
								m.getShop(sid2).removeProduct(m.getShop(sid2).getProduct(pi2));
							}
						    catch(NullPointerException npe)
							{
								System.out.println("NullPointerException occured");
							}
							
						    System.out.println("#######################");
						    break;
							
						case 3:
						
						    System.out.println("#######################");
						    System.out.println("Show All Products of a Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid3 = sc.next();
							
							m.getShop(sid3).showAllProducts();
							
						    System.out.println("#######################");
						    break;
							
						case 4:
						
						    System.out.println("#######################");
						    System.out.println("Search A Product of a Shop");
							
							System.out.print("Enter Shop ID: ");
							String sid4 = sc.next();
							System.out.print("Enter Product ID: ");
							String pi4 = sc.next();
							/*System.out.print("Enter Available Quantity of Product: ");
							int aq1= sc.nextInt();
							System.out.print("Enter Price of Product: ");
							double product1 = sc.nextDouble();
							*/
						try	
						{
							Product pp = m.getShop(sid4).getProduct(pi4);
							
							if(pp != null)
							{
								pp.showInfo();
							}
						}	
                        catch(NullPointerException npe)
		                    {
			                    System.out.println("NullPointerException occured");
		                    }						
							
						    System.out.println("#######################");
						    break;
							
						case 5:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
						default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid option");
						    System.out.println("#######################");
						    break;
					}
					
				    System.out.println("*********************");
				    break;
					
				case 4:
				    
					System.out.println("*********************");
				    System.out.println("Product Quantity Add-Sell");
					
					System.out.println("What do you want to do?\n");
			        System.out.println("---------------------------------------");
			        System.out.println("1. Add Product");
			        System.out.println("2. Sell Product");
			        System.out.println("3. Show Add Sell History");
			        System.out.println("4. Go Back");
					System.out.println("---------------------------------------\n");
					System.out.print("Enter your option: ");
					int input4 = sc.nextInt();
					
					switch(input4)
					{
						case 1:
						
						    System.out.println("#######################");
						    System.out.println("Add product\n");
							
							System.out.print("Enter Shop ID: ");
							String sid1 = sc.next();
							System.out.print("Enter Product ID: ");
							String pi1 = sc.next();
							System.out.print("Enter Added Amount: ");
							int amount1 = sc.nextInt();
						try
						{
							if(amount1>0)
							{
								m.getShop(sid1).getProduct(pi1).addQuantity(amount1);
							}
						}
						catch(NullPointerException npe)
		                    {
			                    System.out.println("NullPointerException occured");
		                    }
							
							frwd.writeInFile("Quantity Added: "+ amount1+" in "+ pi1);
							
						    System.out.println("#######################");
						    break;
							
						case 2:
						
						    System.out.println("#######################");
						    System.out.println("Sell product\n");
							
							System.out.print("Enter Shop ID: ");
							String sid2 = sc.next();
							System.out.print("Enter Product ID: ");
							String pi2 = sc.next();
							System.out.print("Enter Sell Amount: ");
							int amount2 = sc.nextInt();
						try
						{
							if(amount2>0 && amount2 <= m.getShop(sid2).getProduct(pi2).getAvailableQuantity())
							{
								m.getShop(sid2).getProduct(pi2).sellQuantity(amount2);
							}
						}
						catch(NullPointerException npe)
		                    {
			                    System.out.println("NullPointerException occured");
		                    }
							
							frwd.writeInFile("Quantity Sell: "+ amount2+" in "+ pi2);
							
							
						    System.out.println("#######################");
						    break;
							
						case 3:
						
						    System.out.println("#######################");
						    System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
						    System.out.println("#######################");
						    break;
							
						case 4:
						
						    System.out.println("#######################");
						    System.out.println("Go Back");
						    System.out.println("#######################");
						    break;
							
						default:
						
						    System.out.println("#######################");
						    System.out.println("Invalid option");
						    System.out.println("#######################");
						    break;
					}
					  
					
					
				    System.out.println("*********************");
				    break;
					
				case 5:
				    
					System.out.println("*********************");
				    System.out.println("Exit");
					choice = false;
				    System.out.println("*********************");
				    break;
					
				default:
				    
					System.out.println("*********************");
				    System.out.println("Invalid option");
				    System.out.println("*********************");
				    break;
			}
		}
	}
}