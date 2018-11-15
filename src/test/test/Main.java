package test.test;

public class Main {
	
	public Main(DummyInterface param) {
		//클래스 이름을 출력
		System.out.println(((DummyInterface) param).getName());
	}
	

	//프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//출력할때 파라미터로 Dummy1을 넣느냐 Dummy2를 넣느냐에 따라 출력값이 달라진다.
		//결과적으로 Main클래스는 건들지 않으므로 개방폐쇄 원칙을 지킴
		new Main(new Dummy1());
	}

}
