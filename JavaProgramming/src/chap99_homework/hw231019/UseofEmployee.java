package chap99_homework.hw231019;

import java.util.Scanner;

import chap99_homework.hw231019.employee.ContractEmployee;
import chap99_homework.hw231019.employee.Employee;
import chap99_homework.hw231019.employee.TempEmployee;

public class UseofEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] empArr = new Employee[100];
		
		//정규직
		empArr[1] = new RegularEmployee(0, null, 0, 0, 0); 
		
		//임시직
		empArr[2] = new TempEmployee(0, null, 0, 0, 0);
		
		//계약직
		empArr[3] = new ContractEmployee(0, null, 0, 0, 0);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int eno = 0;		//사번
		String name = "";	//이름
		int pay = 0;		//급여
		int bonus = 0;		//보너스
		int hireYear = 0;	//입사일
		int workDay = 0;	//재직일
		int index = 0;		//인덱스번호
		

//		

		
//		2. 선택 시
//		사번을 입력하세요
//		2.
//		이름을 입력하세요.
//		임꺽정
//		급여를 입력하세요.
//		2800
//		근무년수를 입력하세요.
//		7
//		입력한 내용을 empArr에 저장
		
//		3. 선택 시
//		사번을 입력하세요.
//		3
//		이름을 입력하세요.
//		장길산
//		급여를 입력하세요.
//		250
//		근무일수를 입력하세요.
//		20
//		입력한 내용을 empArr에 저장
//		
//		4. 선택 시
//		emArr에 저장된 내용 모두 출력
//		showEmployeeInfo() 사용해서 출력
		
//		5. 선택 시
//		검색할 사원의 사번을 입력하세요.
//		1
//		1번 사원의 정보를 showEmployeeInfo() 사용해서 출력
		
//		6. 선택 시
//		프로그램을 종료합니다.
//		
//		다른 번호가 입력되면 
//		잘못 선택하셨습니다.
//		다시 메뉴 표출
		
		
		
		
		while(true) {
//			메뉴  선택
//			1. 정규직 저장
//			2. 임시직 저장
//			3. 계약직 저장
//			4. 전체 정보 출력
//			5. 월급 계산 출력
//			6. 프로그램 종료
			
			System.out.println("메뉴  선택");
			System.out.println("1. 정규직 저장");
			System.out.println("2. 임시직 저장");
			System.out.println("3. 계약직 저장");
			System.out.println("4. 전체 정보 출력");
			System.out.println("5. 월급 계산 출력");
			System.out.println("6. 프로그램 종료");
			
			
			int userNum = sc.nextInt();
			
			if(userNum == 1) { // 1. 정규직 저장
				saveRegularEmployee();
				
			} else if(userNum == 2) { //2. 임시직 저장
				
				
			} else if(userNum == 3) { //3. 계약직 저장
				
				
			} else if(userNum == 4) { //4. 전체 정보 출력
				
				
			} else if(userNum == 5) { //5. 월급 계산 출력
				
				
			} else if(userNum == 6) { //6. 프로그램 종료
				
				
			} else if(userNum < 1 || userNum > 6) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		
			
		}
		
		
		//1. 정규직 저장
		public void saveRegularEmployee(){
			
//			1. 선택 시
//			사번을 입력하세요.
//			1
//			이름을 입력하세요.
//			홍길동
//			급여를 입력하세요.
//			3000
//			보너스를 입력하세요.
//			300
//			입력한 내용을 empArr에 저장
			
			System.out.println("사번을 입력하세요."_;
			eno = sc.nextInt();
			
			System.out.println("이름을 입력하세요");
			name = sc.nextLine();
			
			System.out.println("급여를 입력하세요.");
			pay = sc.nextInt();
			
			System.out.println("보너스를 입력하세요.");
			bonus = sc.nextInt();
			
			//입력한 내용을 empArr에 저장
			empArr[1] = {}
			
				
		}
		
		
		
		
		
		
		sc.close();	
	}

}
