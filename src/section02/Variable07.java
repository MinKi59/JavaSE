package section02;

public class Variable07 {
	public static void main(String[] args) {
		
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; // 자동형변환
		System.out.println("iInt: " + iInt);
		
		// 업캐스팅 예
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동형변환
		System.out.println("iDouble: " + iDouble);
		
		// 다운캐스팅 예
		int iInt2 = 130;
		byte iByte2 = (byte)iInt2; // 강제형변환
		System.out.println("iByte2: " + iByte2);
		
		// 실수 -> 정수 형변환 예
		float iFloat2 = 3.1415f;
		int iInt3 = (int)iFloat2;
		System.out.println("iInt3: " + iInt3);
	}
}
