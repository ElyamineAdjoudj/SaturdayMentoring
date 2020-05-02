package mentoringPractice;

public class Student extends Individual{
	
	String studyLevel;
	double gpa;
	String major;
	public Student() {
		
	}
	public Student(String name, String address, int age, String nationality, String studyLevel, double gpa,
			String major) {
		super(name, address, age, nationality);
		this.studyLevel = studyLevel;
		this.gpa = gpa;
		this.major = major;
	}
	public String getStudyLevel() {
		return studyLevel;
	}
	public void setStudyLevel(String studyLevel) {
		this.studyLevel = studyLevel;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

	
 
	
	
	
	
	
	

}
