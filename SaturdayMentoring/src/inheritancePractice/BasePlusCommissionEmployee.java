package inheritancePractice;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	double base;
	public BasePlusCommissionEmployee() {
		
	}
	public BasePlusCommissionEmployee(String name, int ssn, Gender sex, String address, double grossSale,
			double commissionRate, double base) {
		super(name, ssn, sex, address, grossSale, commissionRate);
		this.base = base;
	}
	public double getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	@Override
	public double earning() {
		return base + super.earning();
	}
	@Override
	public void displayAllDetails() {
		super.displayAllDetails();
		super.displayEarning();
	}
	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [base=" + base + "]";
	}
	public void displayEarning() {
		System.out.println(earning());
	}
}
