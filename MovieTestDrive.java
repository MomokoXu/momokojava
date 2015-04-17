public class MovieTestDrive {
	public static void main (String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the stock";
		one.genre = "Tragic";
		one.rating = -2;
		System.out.println("The first movie is: " + one.title + "\n" + one.genre + "\n" + one.rating);
		one.playIt();
		Movie two = new Movie();
		two.title = "Titanic";
		two.genre = "Romatic";
		two.rating = 100;
		System.out.println("The second movie is: " + two.title + "\n" + two.genre + "\n" + two.rating);
		two.playIt();
		Movie three = new Movie();
		three.title = "Byte club";
		three.genre = "Comedy";
		three.rating = 5;
		System.out.println("The third movie is: " + three.title + "\n" + three.genre + "\n" + three.rating);

	}

}