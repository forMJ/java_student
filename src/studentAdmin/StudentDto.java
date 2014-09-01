package studentAdmin;

public class StudentDto {
	
	/*
	 * administrator values 
	 */
	private int 	number;
	private String 	name;
	private String 	phone;
	private String 	grade;
	
	/*
	 * getter / setter 
	 */
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
