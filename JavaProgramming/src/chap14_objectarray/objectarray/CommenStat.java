package chap14_objectarray.objectarray;

public class CommenStat {
	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public CommenStat() {
		
	}
	
	public CommonStat(String subject, int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}

	public String getSubject() {
		return subject;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public int getLectureTime() {
		return lectureTime;
	}
}
