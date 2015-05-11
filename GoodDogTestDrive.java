class GoodDogTestDrive {
	public static void main (String [] args) {
		GoodDog one = new GoodDog();
		GoodDog two = new GoodDog();
		GoodDog three = new GoodDog();
		one.setSize(100);
		two.setSize(30);
		three.setSize(10);

		System.out.println("Dog one's size: " + one.getSize());
		one.bark();
		System.out.println("Dog two's size: " + two.getSize());
		two.bark();
		System.out.println("Dog three's size: " + three.getSize());
		three.bark();



	}
}