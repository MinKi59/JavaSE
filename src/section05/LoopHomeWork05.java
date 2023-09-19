package section05;

public class LoopHomeWork05 {
	public static void main(String[] args) {
		for (int i = 2; i < 10	; i += 3) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "X" + j + "=" + (i * j) + "	");
				System.out.print((i + 1) + "X" + j + "=" + ((i + 1) * j) + "	");
				if (i != 8) {
					System.out.print((i + 2) + "X" + j + "=" + ((i + 2) * j));
					System.out.println();
				} else {
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
