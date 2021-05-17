package day15;

//인터페이스의 다향성
public class PolymorphismTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.frontLeft.roll();//한국타이어 수리
		car.frontRight.roll();//금호타이어 수리
	}
  public static void repair(Tire tire) {
	  if(tire instanceof HanKookTire) {
		  HanKookTire t = (HanKookTire)tire;
		  System.out.println(t.company + "수리합니다."); 
		  System.out.println(HanKookTire.comapny + "수리합니다");
	  }
  }
}
class Car{
	//인터페이스를 이용한 맴버변수 (필드)의 다형성 예제
	Tire frontLeft = new HanKookTire();
	Tire frontRight = new kumhoTire();
}
interface Tire{
	void roll();//바퀴가 구르는 기능
}

class kumhoTire implements Tire{
	String company = "금호";
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
class HanKookTire implements Tire{
	public static final String comapny = null;
	String company = "한국";
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}






