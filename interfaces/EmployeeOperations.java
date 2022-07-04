package interfaces;
import classes.Employee;

public interface EmployeeOperations
{
	
	
	public abstract void insertEmployee(Employee e);
	public abstract void removeEmployee(Employee e) ;
	public abstract void showAllEmployees();
	
	public abstract Employee getEmployee(String empId);
	
	
}