package section08;

public class Method06 {
	public static void main(String[] args) {
		
		int max = max(10, 25);
		System.out.println("max: " + max);
		
		System.out.println("max: " + max(4,6));
		
		max = max(5, 3, 8);
		System.out.println("max: " + max);
	}
	
	// 6. 인자 O, 리턴 O -> 인자값을 받아 연산 후 결과값 반환 메서드
	public static int max(int a, int b) {
		return a > b ? a : b; // 삼항연산자
	}
	
	// 오버로딩 메서드
	public static int max(int a, int b, int c) {
		int max = a;
		if (max < b)
			max = b;
		if (max < c)
			max = c;
		return max;
	}
}
