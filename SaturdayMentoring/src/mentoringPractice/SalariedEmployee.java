package mentoringPractice;

public class SalariedEmployee extends Employee {
	
	int bonus;
	int deduction;
	
	public SalariedEmployee() {
		
	}

	

	public SalariedEmployee(String name, String address, int age, String nationality, int salary, String position,
			int bonus, int deduction) {
		super(name, address, age, nationality, salary, position);
		this.bonus = bonus;
		this.deduction = deduction;
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

	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}
	
	
}
