package Ch13.Team_interface.일조;

public interface Calculation {
	//사칙연산의 결과를 담기위한 멤버변수를 만드세요(덧셈,뺄셈,곱셈,나눗셈별)	
	//사칙연산을 위한 추상 메서드를 만들고
	//해당 폴더에 있는 Div,Mul,Sub,Sum을 각각 역할 나눠서 함수를 완성하세요(C99Ex참고)
	//나머지는 자유롭게 - !
	
	void sum (int a, int b);
	void sum (int a, int b, int c, int d, int e);
	void sum (double a, double b, double c, double d);
	void sum (String a, String b, String c, String d);
	
	void sub (int a, int b);
	void sub (int a, int b, int c, int d, int e);
	void sub (double a, double b, double c, double d);
	void sub (String a, String b, String c, String d);
	
	void mul (int a, int b);
	void mul (int a, int b, int c, int d, int e);
	void mul(double a, double b, double c, double d);
	void mul (String a, String b, String c, String d);
	
	void div (int a, int b);
	void div (int a, int b, int c, int d, int e);
	void div (double a, double b, double c, double d);
	void div (String a, String b, String c, String d);
	

}
