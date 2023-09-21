package section06;

public class ArrayHomeWork {
	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		int[][] nums1 = new int[7][7];
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				nums1[i][j] = count;
				count++;
				System.out.printf("%-3d", nums1[i][j]);
			}
			System.out.println();
		}
		
		while (sum < 13) {
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (i + j == sum) {
						if (sum % 2 == 0) {
							System.out.print(nums1[j][i] + " ");
						} else {
							System.out.print(nums1[i][j] + " ");
						}
					}
				}
			}
		sum++;
		}
	}
}
