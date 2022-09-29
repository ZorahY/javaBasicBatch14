package OOPS;

public class Employee {

	String name;
	String id ;
	String department; 
	
	double salary;
	String shift; 
	

	void work() {
		System.out.println(name +" is working on shift"+shift);
	}
	void takeLeaves() {
		System.out.println(name +" is going on leaves");
	}
	public static void main(String[]args) {
			Employee empl1=new Employee();
			empl1.name="John";
			empl1.id="123";
			empl1.department="IT"; 
			empl1.salary=200000;
			empl1.shift="Evening"; 
			empl1.work();
			
			System.out.println("******************");
			
			Employee empl2=new Employee();
			empl2.name="Zorah";
			empl2.id="1435";
			empl2.department="IT"; 
			empl2.salary=145000;
			empl2.shift="Morning"; 
			empl2.takeLeaves();
		}
}

