package section05;

public class LoopHomeWork04 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i < 4) {
					if (3 - i <= j && j <= 3 + i) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				} else {
					if (i - 3 <= j && j <= 9 - i) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
			}
			System.out.println();
		}
	}
}
