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
		for (int num : args) {
			
			sum += num;
		}
		System.out.println(sum);
			
		
	}

	@Override //n개 인자 받아 덧셈 화면 출력
	public void sum(double... args) {
		double sum  =0.0;
		for(double num : args) {
			
			sum += num;
			
		}
		System.out.println(sum);
		
		
	}

	@Override //n개 문자열받아 '+'를 기준으로 문자열덧붙여 출력
	public void sum(String... args) {
		StringBuilder str = new StringBuilder();
		for(int i =0; i<args.length; i++) {
			str.append(args[i]);
			if(i<args.length - 1) {
				str.append("+");
			}
			System.out.println(str);
		}
		
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


