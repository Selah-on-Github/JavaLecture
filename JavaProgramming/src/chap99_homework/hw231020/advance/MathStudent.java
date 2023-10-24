package chap99_homework.hw231020.advance;

public class MathStudent extends CommonStat implements Student {

	@Override
	public void saveInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getAvg() {
		System.out.println("math 점수엉어");
		return Student.super.getAvg(this.subject, int[] a);
	}
	
	
	
}
