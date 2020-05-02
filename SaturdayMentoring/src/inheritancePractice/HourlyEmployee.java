package inheritancePractice;

public class HourlyEmployee extends Employee implements Displayable {

		double hoursWorked;
		double rate;
	


	public HourlyEmployee () {
		
	}

	

	public HourlyEmployee(String name, int ssn, Gender sex, String address, double hoursWorked, double rate) {
		super(name, ssn, sex, address);
		this.hoursWorked = hoursWorked;
		this.rate = rate;
	}



	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public  double earning() {
		return hoursWorked*rate;
	}
	public void displayAllDetails() {
		System.out.println(super.toString());
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", rate=" + rate + "]";
	}
	public void displayEarning() {
		System.out.println(earning());
	}
	
}
