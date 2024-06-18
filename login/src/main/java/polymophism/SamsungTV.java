package polymophism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV(Speaker speaker, int price) {
		this.speaker = speaker;
		this.price = price;
	}
	
	public void initMethod() {
		System.out.println("initMethod()");
	}
	
	public void powerOn( ) {
		System.out.println("SS - Power On");
	}
	public void powerOff() {
		System.out.println("SS - Power Off");
	}
	public void volumeUp () {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
