/**
 * A simple program that demonstrates Fibonacci Sequence What is a Fibonacci Sequence? : https://www.mathsisfun.com/numbers/fibonacci-sequence.html
 * The program is based on my own Gist created on GitHub with the use JavaScript. : https://gist.github.com/iasjem/fcebad64c56008ceb4340dbae5291e3b 
 */

public class MainSrc {

	public static void main(String[] args) {

		int a = 0, b = 1, c = 0;

		for (int i = 0; i <= 13; i++) {
			c = a + b;
			System.out.println(a + " + " + b + " = " + c);
			a = b;
			b = c;
			
		}
	}
	// Hope you liked it! :)
}
