package mentoringPractice;

public class IndividualApplication {

	public static void main(String[] args) {
		
		Student s1=new  Student("Karim", "79 wallis", 25, "Algerian", "Freshman", 3.4, "Accounting");
		System.out.println("Student name is "+s1.getName());
		System.out.println("Student address is "+s1.getAddress());
		
		HourlyEmployee h1= new HourlyEmployee("s", "l", 22, "cc", 2200, "manager", 42.5, 22.50);
		System.out.println(h1.getSalary());
		Employee h2= new HourlyEmployee("s", "l", 22, "cc", 2200, "manager", 42.5, 22.50);
		System.out.println(h1.getSalary());
		
		
	}

}
