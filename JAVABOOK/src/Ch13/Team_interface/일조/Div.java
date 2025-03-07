package Ch13.Team_interface.일조;

public class Div implements Calculation{

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(int... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(double... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sum(String... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(double... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(String... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(double... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(String... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
	}

	@Override
	public void div(int... arg) {
		int i = 1;
		for(int z : arg) {
			i /= z;
		}
		System.out.println(i);
	}

	@Override
	public void div(double... arg) {
		double i = 1;
		for(double z : arg) {
			i /= z;
		}
		System.out.println(i);
		
	}

	@Override
	public void div(String... arg) {
		String i = " ";
		for(String z : arg) {
			i += z + "/";
		}
		System.out.println(i);
		
	}
	
}
