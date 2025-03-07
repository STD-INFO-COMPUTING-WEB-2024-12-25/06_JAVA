package Ch13.Team_interface.일조;

interface Calculation{
	void div (int a, int b);
	void div (int a, int b, int c, int d, int e);
	void div(double a, double b, double c, double d);
	void div (String a, String b, String c, String d);

}

class Div implements Calculation{
	public void div() {
		@Override
		public void div(int a, int b) {
			System.out.println("2개 인자 받아 나눗셈 화면 출력");
		}

		@Override
		public void div(int a, int b, int c, int d, int e) {
			System.out.println("n개 인자 받아 나눗셈 화면 출력");
		}

		@Override
		public void div(double a, double b, double c, double d) {
			System.out.println("n개 인자 받아 나눗셈 화면 출력");	
		}

		@Override
		public void div(String a, String b, String c, String d) {
			System.out.println("n개 문자열받아 '/'를 기준으로 문자열덧붙여 출력");	
		}
	}
}

public class Div{

	cal1 = new Ch13.Team_interface.일조.Div();
	cal1.div(10,20);	//2개 인자 받아 나눗셈 화면 출력
	cal1.div(10,20,30,40,50);//n개 인자 받아 나눗셈 화면 출력
	cal1.div(10.5,20.2,30.4,50.6);//n개 인자 받아 나눗셈 화면 출력
	cal1.div("문자열1","문자열2","문자열3","문자열4");//n개 문자열받아 '/'를 기준으로 문자열덧붙여 출력

}
