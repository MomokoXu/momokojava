public class Divisible3Not9 {

	public int countDivisible(int lowerBand,int upperBand) {
	    int count = 0;
	    for (int i = lowerBand; i<= upperBand; i++) {
	        if (i%3 == 0 && !(i%9 == 0)) {
	                count++;
	        }
	    }
	    System.out.println(count);
	    return count;

	}
	public static void main (String[] args) {
		Divisible3Not9 test1 =new Divisible3Not9();
		test1.countDivisible(0,9);
	}    

}   