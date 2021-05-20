package week5.day1;

public class Employee {
	
	int empId;
	String empName;
	static String compName;
	
	Employee(int id,String name,String company){
		
		empId = id;
		empName = name;
		compName = company;
		
	}
	public void printEmployeeDetails() {

		System.out.println(empId+" "+empName+" "+compName);
	}
	
	public static void getDetails() {
		
		System.out.println("Employee Details");
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100,"Hari","Testleaf");
		Employee emp2 = new Employee(200,"Vani","Testleaf pvt ltd");
		emp1.printEmployeeDetails();
		emp2.printEmployeeDetails();
		System.out.println(Employee.compName);
		
	}
		
		
		


}

