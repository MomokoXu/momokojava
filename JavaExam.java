public class JavaExam {

	public static void printNumberLine(int seqCenter, int length) {

	// Please write your code after this line
	int numOfSpace = length - 2 * seqCenter;
	for(int i = 0;i < (numOfSpace / 2);i++) {
	    System.out.print(' ');
	}
	for(int n = 0;n <= seqCenter; n++) {
	    System.out.print(n);    
	}
	for(int t = seqCenter - 1; t >= 0;t--) {
	    System.out.print(t);
	}
	for(int q = 0;q < (numOfSpace / 2); q ++) {
	    System.out.print(' ');
	}
	System.out.print('\n');
}


	public void printNumberDiamond(int diaCenter) {
		int diaLength = diaCenter * 2 + 1;

		for (int p = 0; p <= diaLength / 2; p++) {
			this.printNumberLine(p,diaLength);
		}

		for (int l = diaLength / 2 - 1; l >= 0;l--) {
			this.printNumberLine(l,diaLength);
		}
	}


	public static void main (String[] args) {

		JavaExam test1 = new JavaExam();
		test1.printNumberDiamond(3);
	}


}

