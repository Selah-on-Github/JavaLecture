package chap12_interface.device;

public class LgTv extends ElectronicDevice implements Tv {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 소리가 들린다.");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("LG TV 화면을 보여준다.");

	}

	@Override
	public void changeChannel(int channel) {
		// TODO Auto-generated method stub
		System.out.println("LG TV " + channel + "로 채널을 변경한다.");

	}

}
