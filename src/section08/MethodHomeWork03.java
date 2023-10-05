package section08;

import java.util.Scanner;

public class MethodHomeWork03 {
	public static void main(String[] args) {
		
		int max = findMAX();
		System.out.println("최대값: " + max);
	}
	
	public static int findMAX() {
		System.out.println("정수 3개를 입력하시오");
		
		Scanner nums = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for (int i = 0; i < 3; i++) {
			num[i] = nums.nextInt();
		}
		
		int max = num[0];
		
		for (int i = 1; i < 3; i++) {
			if (max < num[i])
				max = num[i];
		}
		
		return max;
	}
}
