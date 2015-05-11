/*import java.util.Scanner;

public class triangleTest {

	public static void main (String[] args){
			Scanner in = new Scanner(System.in);
			int numOfLine = in.nextInt();

			for (int i = 0; i <= numOfLine ; i++){
				for (int n = 0; n <= i ; n++) {
					if (n < i) {
						System.out.print('*');
					}
					else {
						System.out.print('\n');
					}
				}
			}
		}
}*/


import java.util.Scanner;

public class triangleTest {

	public static void main (String[] args){
			Scanner in = new Scanner(System.in);
			int numOfLine = in.nextInt();

			for (int i = 0; i < numOfLine ; i++){
				for (int n = 0; n <= i ; n++) {
						System.out.print('*');
						
				}
				System.out.print('\n');
			}
		}
}

