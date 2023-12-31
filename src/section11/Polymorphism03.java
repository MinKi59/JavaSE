package section11;
/*
 * null - 아무런 객체를 참조하지 않는 상태를 나타낸다.
 * 
 * **** instanceof 연산자
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는 연산자
 * 
 */

import java.util.Scanner;

import section11.access2.Ade;
import section11.access2.Coffee;
import section11.access2.Drink;

public class Polymorphism03 {

	public static void main(String[] args) {
		
		while(true) {
			int inputNum = 0;
		
			Scanner scan = new Scanner(System.in);
		
			System.out.println("1) 코라콜라 Zero");
			System.out.println("2) 빽다방 황금라떼");
			System.out.println("0) 종료");
			System.out.println("음료를 선택하세요 >>>");
		
			inputNum = scan.nextInt();
		
			if(inputNum == 0)
				break;
		
			Drink drink = getDrink(inputNum);
			
			if(drink instanceof Ade) {
				Ade ade = (Ade) drink;
				System.out.println("제로콜라입니까? " + ade.isZero());
			} else if(drink instanceof Coffee) {
				Coffee coffee = (Coffee) drink;
				System.out.println("디카페인입니까? " + coffee.isDecaf());
			}
		
			drink.printInfo();
		}
	}
	
	public static Drink getDrink(int inputNum) {
		Drink drink = null;
		if(inputNum == 1) {
			drink = new Ade();
		} else if(inputNum == 2) {
			drink = new Coffee();
		}
		
		return drink;
	}
}
