 package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser4 {
	public static void main(String[] args) {
		// bean으로 등록된 값을 가져와서 실행해줌
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml" ); 
		TV tv = (TV)factory.getBean ("lg");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();      
		tv.powerOff();
	}
 }
 