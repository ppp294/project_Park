package day15;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A1{
	void print() {
		  System.out.println("Hello");
	}
}
class BB{
	void print() {
		System.out.println("Hi");
	}
}
class AC extends A1{
	void test() {
		print();
	}
}

interface B1{
	 void print();	 
}
interface B2{
	void print();
}
class BC implements B1, B2{

	@Override
	public void print() {
		System.out.println("안녕");
		
	}
	
}
//C1 클래스는 A1 클래스를 상속 받고, B1,B2 인터페이스를 구현한 클래스이다.
class C1 extends A1 implements B1, B2{
	@Override
	public void print() {
		System.out.println("안녕");
	}
}