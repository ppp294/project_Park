package day15;

public class AnonumousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}

abstract class Parent{
  public abstract void print();
}
class Child extends Parent{
	@Override
	public void print () {
		 System.out.println("안녕");
	}
}

class TempA{
	//private Parent P = new Child();
	//Parent 추상 크래스를 이용하여 새로운 익명 객체를 생성한 후, 생성한 익명 객체의
	//주소를 p와 저장
		private Parent p = new Parent() {
			int num = 10;
		public void print() {	
			System.out.println("안녕");
		}
		};
	
}
	
		

			
		
	
	
