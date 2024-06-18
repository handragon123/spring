package polymophism;

public class TVUser3 {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
	}
}
