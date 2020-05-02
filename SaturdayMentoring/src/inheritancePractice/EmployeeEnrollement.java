package inheritancePractice;

public class EmployeeEnrollement {

	public static void main(String[] args) {
		
		Department d1=new Department("Accounting", 101);
		
		SalariedEmployee se=new SalariedEmployee("Kamele", 102654321, "79 wallis ave", Gender.male, 3000, 500, 100);
		d1.addEmployee(se);
		
		HourlyEmployee he=new HourlyEmployee("Steve", 123456789, Gender.male, "55 main", 45.5, 55.6);
		d1.addEmployee(he);
		
		CommissionEmployee ce= new CommissionEmployee("Amira", 321654987, Gender.female, "55 broadway", 5000, 0.25);
		d1.addEmployee(ce);
		
	
		d1.printEmployeeBasicData();
		System.out.println("*************************");
		System.out.println("Our department has "+ d1.getEmployeeCount()+" Employees");
		System.out.println("*************************");
		d1.printAllDetails();
		
	}

}
