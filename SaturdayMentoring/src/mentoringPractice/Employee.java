package mentoringPractice;

public class Employee extends Individual{
	int salary;
	String position;
	
	public Employee() {
		
	}

	

	public Employee(String name, String address, int age, String nationality, int salary, String position) {
		super(name, address, age, nationality);
		this.salary = salary;
		this.position = position;
	}



	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	

}
