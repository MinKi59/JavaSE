package section05;

public class LoopHomeWork03 {
	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++) {
				if (3 - i <= j && j <= 3 + i) {
					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
