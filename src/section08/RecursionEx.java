package section08;
// Recursion : 재귀
public class RecursionEx {
	
	// 일반 반복 메서드
	public static void printNumber(int n) {
		while(n > 0) {
			System.out.println(n);
			n--;
		}
	}
	
	// 재귀 메서드
	/*
	 * recursionPrintNumber(10) -> 10
	 *  recursionPrintNumber(9) -> 9
	 *   recursionPrintNumber(8) -> 8
	 * 	
	 */
	public static void recursionPrintNumber(int n) {
		if(n > 0) {
			System.out.println(n);
			recursionPrintNumber(--n);
		}
	}
	
	public static void main(String[] args) {
		// 매개변수 10 -> 10 ~ 1 까지 출력하기
		// printNumber(10);
		recursionPrintNumber(10);
	}
}
