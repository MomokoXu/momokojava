class ELectricGuitarTestDrive {
	public static void main (String [] args) {
		ELectricGuitar d = new ELectricGuitar();

		d.setBrand("coldplay");
		System.out.println(d.getBrand()); 
		d.setNumOfPickups(10);
		System.out.println(d.getNumOfPickups());
		d.setRockStarUsesIt(true);
		System.out.println(d.getRockStarUsesIt(1));
	}
}