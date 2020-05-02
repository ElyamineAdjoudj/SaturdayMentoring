package inheritancePractice;

public class SalariedEmployee extends Employee implements Displayable {
	
	int salary;
	int bonus;
	int deduction;

	public SalariedEmployee() {
		
	}

	public SalariedEmployee(String name, int ssn, String address,Gender sex, int salary, int bonus, int deduction) {
		super(name, ssn,sex, address);
		this.salary = salary;
		this.bonus = bonus;
		this.deduction = deduction;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public int getDeduction() {
		return deduction;
	}

	public void setDedcution(int dedcution) {
		this.deduction = dedcution;
	}
	
	@Override
	public  double earning() {
		return  salary+bonus-deduction;
	}
	
	public void displayAllDetails() {
		System.out.println(super.toString());
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", bonus=" + bonus + ", deduction=" + deduction + "]";
	}

	public void displayEarning() {
		System.out.println(earning());
	}
	
	
	
	
	
	
	
	
	
	
	
}
