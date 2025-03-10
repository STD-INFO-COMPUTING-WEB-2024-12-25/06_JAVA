package Ch13.Team_interface.삼조;

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

	@Override
	public void sub(int a, int b) {
		System.out.printf("%d",a - b);
		
	}

	@Override
	public void sub(int... args) {
		int max = 0;
		for(int num : args) {
			max = max > num ? max : num;
		}
		for(int i=0;i<max.length();i++) {
			
		}
			
	}

	@Override
	public void sub(double... args) {
	
		
	}

	@Override
	public void sub(String... args) {
		
		
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
