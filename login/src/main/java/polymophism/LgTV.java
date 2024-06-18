package polymophism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lg")
public class LgTV implements TV{
	
	@Autowired
	@Qualifier("sony")
	Speaker speaker;
	
	public void powerOn( ) {
		System.out.println("LG - Power On");
	}
	public void powerOff() {
		System.out.println("LG - Power Off");
	}
	public void volumeUp () {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
