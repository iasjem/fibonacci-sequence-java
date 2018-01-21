/**
 * A simple program that demonstrates Fibonacci Sequence What is a Fibonacci
 * Sequence in Math? :
 * https://www.mathsisfun.com/numbers/fibonacci-sequence.html This sample JAVA
 * program is based on my own Gist created on GitHub with the use JavaScript. :
 * https://gist.github.com/iasjem/fcebad64c56008ceb4340dbae5291e3b The concept
 * of divisibility is also applied to make an imitation of a table.
 */

public class MainSrc {

	public static void main(String[] args) {

		int a = 1, b = 0, c = 0;
		// c stores the current state of a and b
		for (int i = 0; i <= 25; i++) {
			// e.g. 1 + 0 = 1
			c = a + b;
			// e.g. 0 + 1 <- becomes the next formation
			a = b;
			b = c;
			System.out.print(c);
			// if i is divisible to 5, make new line.. the rest are indented.
			if (i == ((i / 5) * 5)) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
		}
	}
	// Hope you liked it! :)
}
