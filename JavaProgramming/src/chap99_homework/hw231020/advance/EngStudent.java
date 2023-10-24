package chap99_homework.hw231020.advance;

public class EngStudent extends CommonStat implements Student {

	@Override
	public void saveInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	//점수 배열을 이용해서 평균 점수 구하는 메소드
	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		double avg = 0;
		int sum = 0;
		
		for(int i=0; i<this.finalExam.length; i++) {
			sum += this.finalExam[i];
		}
		
		avg = (double)Math.round(((double)sum / this.finalExam.length) *100) /100 ; 
	
		return avg;
	}

}
