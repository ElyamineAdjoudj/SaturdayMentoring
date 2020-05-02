package mentoringPractice;

public class Individual {
	
	String name;
	String address;
	int age;
	String nationality;
	public Individual() {
		
	}
	public Individual(String name, String address, int age, String nationality) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.nationality = nationality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
