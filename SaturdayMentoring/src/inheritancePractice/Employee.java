package inheritancePractice;



enum Gender{male,female};

public abstract class Employee {
	String name;
	int ssn;
	String address;
	Gender sex;
	
	public Employee() {
		
	}
	public Employee(String name, int ssn,Gender sex, String address) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.sex=sex;
	}
	public String getName() {
		return name;
	}
	
	public Gender getSex() {
		return sex;
	}
	public void setSex(Gender sex) {
		this.sex = sex;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public abstract double earning();
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", address=" + address + ", sex=" + sex + "]";
	}
	
	
	
	
	
	

}
