package chap04_controlstatement;

public class _07_DuplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 2 ~ 9단 까지 구구단 출력
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				//72번 실행
				System.out.print(i + " * " + j + " = " 
										+ (i * j) + "   ");
			}
			// 8번실행(2~9)
			System.out.println();
		}
		System.out.println("--------------------------");
		
		// 2. 
		// *****
		// *****
		// *****
		// *****
		// *****
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3. AB + BA = 99를 만족하는 A, B값을 모두 출력하세요.
		//    (A, B는 0~9의 정수)
		for(int a = 0; a <= 9; a++) {
			for(int b = 0; b <= 9; b++) {
				int numAB = a * 10 + b;
				int numBA = b * 10 + a;
				
				if(numAB + numBA == 99) {
					System.out.println("a = " + a + ", b = " + b);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}