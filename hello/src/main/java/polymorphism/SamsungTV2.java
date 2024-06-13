package polymorphism;

public class SamsungTV2 implements TV{
	
	private Speaker speaker;
	private int price;

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SS - Power On");
	}
	public void powerOff() {
		System.out.println("SS - Power Off");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
