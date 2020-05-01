package person;

import java.util.Scanner;

public class person {
	    public static void main(String agrs[]){
	    	person person = new person();
	    	Student student = new Student();
	    	Employee employee = new Employee();
	    	Faculty faculty = new Faculty();
	        Staff staff = new Staff();
	        System.out.println(person.toString());
	        System.out.println(student.toString());
	        System.out.println(employee.toString());
	        System.out.println(faculty.toString());
	        System.out.println(staff.toString());
	    }
	private String name;
	private String address;
	private String number;
	private String Email;

protected person() {
}

protected person(String name,String address,String number, String Email) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.Email = Email;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}


	protected String getNumber() {
		return number;
	}

	protected void setNumber(String number) {
		this.number = number;
	}

	protected String getEmail() {
		return Email;
	}

	protected void setEmail(String Email) {
		this.Email = Email;
	}

	public String toString() {
		return "ObejectByPerson"+"Name:"+getName();
	}
}

class Student extends person{

	public final static String ONE = "大一";
	public final static String TWO = "大二";
	public final static String THREE = "大三";
	public final static String FOUR = "大四";
	private String StudentState;

	public Student() {
		StudentState = ONE;
	}

	public Student(String StudentState,String name,String address,String number, String Email) {
		super(name,address,number,Email);
		this.StudentState = StudentState;
	}

	public String getStudentState() {
		return StudentState;
	}

	public void setStudentState(String StudentState) {
		this.StudentState = StudentState;
	}


	public String toStringOfAllInforation() {
		return "Student is inforation:Grade:"+getStudentState()+"\tName:"+getName()+"\tAddress:"+getAddress()+"\tNumber:"+getNumber()+"\tEmail:"+getEmail();
	}

	public String toString() {
		return "ObjectByStudent-->"+"Name:"+getName();
	}

}

class Employee extends person{

	private String Office;
	private double salary;
//	private Date EntryDate;

	protected Employee() {
		//EntryDate = new Date();
	}
	
	protected Employee(String Office,double salary,String name,String address,String number, String Email) {
		super(name,address,number,Email);
		this.Office = Office;
		this.salary = salary;
		//this.EntryDate = EntryDate;
	}

	protected String getOffice() {
		return Office;
	}

	protected void setOffice(String Office) {
		this.Office = Office;
	}

	protected double getSalary() {
		return salary;
	}

	protected void setSalary(double salary) {
		this.salary = salary;
	}

//	protected Date getEntryDate() {
//		return EntryDate;
//	}

	public String toString() {
		return "ObjectByEmployee-->"+"Name:"+getName();
	}

}


class Faculty extends Employee{
	private String OfficeTime;
	private String PostGrade;
	
	public Faculty() {
		
	}
	
	public Faculty(String Office,double salary,String OfficeTime,String PostGrade,String name,String address,String number, String Email) {
		super(Office,salary,name,address,number,Email);
		this.OfficeTime = OfficeTime;
		this.PostGrade = PostGrade;
	}
	
	public String getOfficeTime() {
		return OfficeTime;
	}
	
	public void setOfficeTime(String OfficeTime) {
		this.OfficeTime = OfficeTime;
	}
	
	public String getPostGrade() {
		return PostGrade;
	}
	
	public void setPostGrade(String PostGrade) {
		this.PostGrade = PostGrade;
	}
	
	public String toStringOfAllInforation() {
		return "Faculty is inforation:PostGrade:"+getPostGrade()+"\tOfficeTime:"+getOfficeTime()+"\tSalary:"+getSalary()+"Office:"+getOffice()+"\tName:"+getName()+"\tAddress:"+getAddress()+"\tNumber:"+getNumber()+"\tEmail:"+getEmail();
	}
	
	public String toString() {
		return "ObjectByFaculty-->"+"Name:"+getName();
	}

}

class Staff extends Employee{
	private String Post;

	public Staff() {
	}

	public Staff(String Office,double salary,String Post,String name,String address,String number, String Email) {
		super(Office,salary,name,address,number,Email);
		this.Post = Post;
	}

	public String getPost() {
		return Post;
	}

	public void setPost(String Post) {
		this.Post = Post;
	}

	public String toStringOfAllInforation() {
		return "Staff is inforation:Post:"+getPost()+"\tSalary:"+getSalary()+"Office:"+getOffice()+"\tName:"+getName()+"\tAddress:"+getAddress()+"\tNumber:"+getNumber()+"\tEmail:"+getEmail();
	}
	
	public String toString() {
		return "ObjectByStaff-->"+"Name:"+getName();
	}
}




