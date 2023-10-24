package chap99_homework.hw231019.animal;

//사자 클래스
public class Lion extends TheCatFamily{
	
	public Lion() {
		super();
	}
	
	public void eat() {
		System.out.println("사자는 식사를 한다.");
	}
	
	public void sleep() {
		System.out.println("사자는 누워서 잔다.");
	}
	
	public void bigVoice() {
		super.bigVoice();
		System.out.println("사자 울음소리가 커진다.");
	}
	
	public void smallVoice() {
		super.smallVoice();
		System.out.println("사자 울음소리가 작아진다.");
	}
	

}
