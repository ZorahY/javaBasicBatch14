package OOPS;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	int year;

	void makeCall() {
		System.out.println("calling");
	}

	void takePicture() {
		System.out.println("Take a pic");
	}

	public static void main(String[] args) {
		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 14";
		iphone.color = "Black";
		iphone.storage = 128;
		iphone.size = 6.8;
		iphone.cheap = false;
		System.out.println("Make " + iphone.make + " Model " + iphone.model);
		iphone.makeCall();

		System.out.println("_____________");

		Phone samsungPhone = new Phone();
		samsungPhone.make = "Samsung";
		samsungPhone.model = "S22 Ultra";
		samsungPhone.color = "Silver";
		samsungPhone.storage = 256;
		samsungPhone.size = 6.87;
		samsungPhone.cheap = false;
		System.out.println("Make " + iphone.make);

		System.out.println("Make " + samsungPhone.make + " Model " + samsungPhone.model);

	}
}
