package chap13_nestedclass.nestedclass;

public class NestedClass {
	// 1. 멤버변수
	public static int num1;
	public static int num2;
	
	// 2. 메소드
	public int add() {
		return num1 + num2;
	}
	
	// 3. 정적 중첩 클래스
	// 외부클래스 객체 생성 없이도 사용할 수 있다.
	public static class Mul {
		
		public Mul() {
			num1 = 100;	
			num2 = 20;
		}
		
		public static int mul() {
			return num1 * num2;
		}
		
	}
	
	// 4. 인스턴스 중첩 클래스
	// 외부클래스의 객체를 생성한 후에 사용할 수 있다.
	public class Div {
		public static int num3; // 자바 업데이트가 되어 이렇게 가능하게 되었다.
		public final static int num4 = 10; // 과거에는 final로 상수로 지정하고 + 값을 꼭 넣어야 했었는데
		
		
		public Div() {
			num1 = 100;
			num2 = 20;
		}
		
		public int div() {
			return num1 / num2;
		}
		
	}
	

	
	
}
