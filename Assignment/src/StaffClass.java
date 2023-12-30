
public class StaffClass {
	//1.1 creating a class staff
	String name;
	String designation;
	int age;
	int salary;
	

	public StaffClass(String name,String designation,int age,int salary){
	    this.name = name;
	    this.designation = designation;
	    this.age = age;
	    this.salary = salary;

	    System.out.println("Success");

	}
	public void getAge() {
		System.out.println(age);
	}
	public void getSalary() {
		System.out.println(salary);
	}
	public static void main(String[] args) {
		StaffClass staff1 = new StaffClass("Rahul","Prof.",36,1200000);
		staff1.getAge();
		staff1.getSalary();
		
		
	}
	
}
