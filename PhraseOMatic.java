public class PhraseOMatic {
	public static void main (String[] args) {
		String[] wordListOne = { "24/7","multi-Tier","30,00 foot","B-to-B","win-win",
		"front-end", "web-based","pervasive","smart","six-sigma","critical-path","dynamic" };
		 
		String[] wordListTwo = { "empowered", "sticky","valued-added","oriented",
		"centric","distributed","clustered","branded","outside-the-box","positioned",
		"networked","focused","leveraged","aligned","targeted","shared","cooperative",
		"accelerated"};

		String[] wordListThree = { "process","tipping-point","solution","architecture","mindshare","core cimpetency","strategy","portal","space","vision","paradigm","mission" };

		int onelength = wordListOne.length;
		int twolength = wordListTwo.length;
		int threelength = wordListThree.length;

		int rd1 = (int) (Math.random() * onelength);
		int rd2 = (int) (Math.random() * twolength);
		int rd3 = (int) (Math.random() * threelength);
		
		String phrase = wordListOne[rd1] + " " + wordListTwo[rd2] + " " + wordListThree[rd3];

		System.out.println("What we need is a " + phrase);


 
	}
}