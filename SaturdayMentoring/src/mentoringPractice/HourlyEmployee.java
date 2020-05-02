package mentoringPractice;

public class HourlyEmployee extends Employee {
	double hoursWorked;
	double hourlyRtae;
	
	
	public HourlyEmployee() {
		
	}
	

	


	public HourlyEmployee(String name, String address, int age, String nationality, int salary, String position,
			double hoursWorked, double hourlyRtae) {
		super(name, address, age, nationality, salary, position);
		this.hoursWorked = hoursWorked;
		this.hourlyRtae = hourlyRtae;
	}





	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public double getHourlyRtae() {
		return hourlyRtae;
	}


	public void setHourlyRtae(double hourlyRtae) {
		this.hourlyRtae = hourlyRtae;
	}
	
}
