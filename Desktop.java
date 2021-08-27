package week3.Day1;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("size of desktop is 33 cm");
	}
	public static void main(String[] args) {
		Desktop deskObj = new Desktop();
		Computer compObj = new Computer();
		System.out.println("calling child class methods using child object");
		deskObj.desktopSize();
		deskObj.computerModel();
		System.out.println("calling parent clas method using parent object");
		compObj.computerModel();
		
	}
	

}
