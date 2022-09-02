package Posttest28;

public class SoalDua {
	public static void main(String[] args) {

		int loop = 0;
		int c = 9;
		int b = 1;
		for (int num = 0; num <= 4; num++) {
			loop++;

			if (loop <= 0) {
			} else {
				for (int i = b; i <= c; i++) {
					if (i % 2 == 0) {
						System.out.print("_");
					} else {
						System.out.print(i);
					}
				}
			}
			if (c == 5 && b == 5) {
			} else {
				c--;
				b++;
			}
			System.out.println("");
		}
	}
}
