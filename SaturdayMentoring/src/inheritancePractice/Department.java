package inheritancePractice;

import java.util.ArrayList;

public class Department {
	
	String dptName;
	int dptNumber;
	ArrayList<Employee> empList;
	
	public Department() {
		
	}

	public Department(String dptName, int dptNumber) {
		super();
		this.dptName = dptName;
		this.dptNumber = dptNumber;	
		empList=new ArrayList<Employee>();
	}
	public void addEmployee(Employee employee) {
		empList.add(employee);
	}
	public void removeEmployee(int idx) {
		empList.remove(idx);
	}
	public int getEmployeeCount() {
		return empList.size();
		
	}
	public void printEmployeeBasicData() {
		 
			for (int i = 0; i < empList.size(); i++) {
				System.out.println(empList.get(i).getSsn()+" "+empList.get(i).getAddress()+" "+empList.get(i).getName()+" "+empList.get(i).getSex());
			}
		}
		public void printAllDetails() {
			for (int i = 0; i < empList.size(); i++) {
				if(empList.get(i) instanceof SalariedEmployee) 
					((SalariedEmployee) empList.get(i)).displayAllDetails();
				
				if(empList.get(i) instanceof CommissionEmployee) 
					((CommissionEmployee) empList.get(i)).displayAllDetails();
				
				if(empList.get(i) instanceof BasePlusCommissionEmployee) 
					((BasePlusCommissionEmployee) empList.get(i)).displayAllDetails();
				
				if(empList.get(i) instanceof HourlyEmployee) {
					((HourlyEmployee) empList.get(i)).displayAllDetails();
			}
			
		}
		
		
		}
	
}

