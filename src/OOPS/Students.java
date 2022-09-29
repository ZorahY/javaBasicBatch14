package OOPS;

public class Students {
	String name;
	String id;
	int age;
	double weight;
	char gender;

	void study() {
		System.out.println("Student is studying");
	}

	void notFocused() {
		System.out.println("Students are not focused...");
	}

	public static void main(String[] args) {
		Students student2 = new Students();
		student2.name = "Asma";
		student2.age = 16;
		student2.gender = 'F';
		System.out.println(student2.name);
		student2.study();
	}

	}


