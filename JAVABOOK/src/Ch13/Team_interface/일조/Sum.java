package Ch13.Team_interface.일조;

public class Sum implements Calculation{

	@Override //2개 인자 받아 덧셈 화면 출력
	public void sum(int a, int b) {
		int sum =0;
		sum = a + b;
		System.out.println(sum);
		
	}

	@Override//n개 인자 받아 덧셈 화면 출력
	public void sum(int... args) {
		int sum =0;
		for (int sum : args) {
			
			sum += sum;
		}
		System.out.println(sum);
			
		
	}

	@Override
	public void sum(double... args) {
		double result  =0.0;
		for(double num : args) {
			
			result += num;
			
		}
		System.out.println(result);
		
		
	}

	@Override //n개 문자열받아 '+'를 기준으로 문자열덧붙여 출력
	public void sum(String... args) {
		String result = arg[0];
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int... args) {
		// TODO Auto-generated method stub
		
	}

	@Override 
	public void sub(double... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
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


