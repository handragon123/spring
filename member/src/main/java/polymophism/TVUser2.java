package polymophism;

public class TVUser2 {
	public static void main(String[] args) {
		TV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
