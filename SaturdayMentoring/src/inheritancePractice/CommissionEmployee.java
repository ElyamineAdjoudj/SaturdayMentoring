package inheritancePractice;

public class CommissionEmployee extends Employee implements Displayable {
	
	double grossSale;
	double commissionRate;
	public CommissionEmployee() {
		
	
	}
	public CommissionEmployee(String name, int ssn, Gender sex, String address, double grossSale,
			double commissionRate) {
		super(name, ssn, sex, address);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}
	public double getGrossSale() {
		return grossSale;
	}
	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double earning() {
		return grossSale*commissionRate;
	}
	public void displayAllDetails() {
		System.out.println(super.toString());
		System.out.println(toString());
		
	}
	@Override
	public String toString() {
		return "CommissionEmployee [grossSale=" + grossSale + ", commissionRate=" + commissionRate + "]";
	}
	public void displayEarning() {
		System.out.println(earning());
	}
	
	
	
	
}
