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
		int result =0;
		for (int sum : args) {
			
			result += sum;
		}
		System.out.println(result);
			
		
	}

	@Override
	public void sum(double... args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(String... args) {
		// TODO Auto-generated method stub
		
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


