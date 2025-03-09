package Ch13.Team_interface.일조;

public class Sub implements Calculation {

	@Override 
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override 
	public void sum(int... args) {
		// TODO Auto-generated method stub
		
	}

	@Override 
	public void sum(double... args) {
		// TODO Auto-generated method stub
		
	}

	@Override 
	public void sum(String... args) {
		// TODO Auto-generated method stub
		
	}

	@Override //2개 인자 받아 뺄셈 화면 출력(큰수에서 나머지 수 빼기)
	public void sub(int a, int b) {
		int sub = 0;
		if(a>b) {
			sub = a-b;
		}else
			sub = b-a;
		System.out.println(sub);
		
	}

	@Override //n개 인자 받아 뺄셈 화면 출력(큰수에서 나머지 수 빼기)
	public void sub(int... args) {
		
		int max = args[0];
		int sum = 0;
		for(int num : args) {
			if (num>max) {
				max = num;
			}
			sum += num;
		}
		
		
				
		

	@Override  //n개 인자 받아 뺄셈 화면 출력(큰수에서 나머지 수 빼기)
	public void sub(double... args) {
		// TODO Auto-generated method stub
		
	}

	@Override //n개 문자열받아 '-'를 기준으로 문자열덧붙여 출력
	public void sub(String... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(double... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(String... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(double... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(String... args) {
		// TODO Auto-generated method stub
		
	}

}
