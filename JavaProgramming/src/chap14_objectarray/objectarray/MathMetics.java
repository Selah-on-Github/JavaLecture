package chap14_objectarray.objectarray;

public class MathMetics extends CommonStat implements InterfaceArray {
	
	public MathMetics() {
		
	}
	
	public MathMetics(String subject, int studentCnt, int lectureTime) {
		super(subject, studentCnt, lectureTime);
	}

	@Override
	public void proceedLecture() {
		// TODO Auto-generated method stub
		System.out.println(this.getSubject() + " 수업을 " + this.getStudentCnt() + "명이 듣습니다. 수업시간은 " + this.getLectureTime() + "분 입니다.");
	}
	
	public void learn() {
		System.out.println("미적분을 배웁니다.");
	}

}
