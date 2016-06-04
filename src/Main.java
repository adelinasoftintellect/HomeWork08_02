import java.util.Arrays;
import java.util.Random;

public class Main {
	private static Random r = new Random();

	public static void main(String[] args) {
		int a, b, c, d, e, f;
		int k[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for (int i = 0; i < 10_000_000; i++) {
			a = r.nextInt(6) + 1;
			b = r.nextInt(6) + 1;
			c = r.nextInt(6) + 1;
			d = r.nextInt(6) + 1;
			e = r.nextInt(6) + 1;
			f = r.nextInt(6) + 1;
			k[a + b + c + d + e + f]++;
		}
		System.out.println(Arrays.toString(k));
	}
}
