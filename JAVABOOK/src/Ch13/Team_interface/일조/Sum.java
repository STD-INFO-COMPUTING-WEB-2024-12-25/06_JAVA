package Ch13.Team_interface.일조;

class Sum implements Calculation{

	@Override
	public void sum(int a, int b) {
		int sum1 = a+ b;
		System.out.println(sum1);
		
	}

	@Override
	public void sum(int a, int b, int c, int d, int e) {
		int sum2 = a + b + c + d + e;
		System.out.println(sum2);
	}

	@Override
	public void sum(double a, double b, double c, double d) {
		double sum3 = a + b + c + d;
		System.out.println(sum3);
	}

	@Override
	public void sum(String a, String b, String c, String d) {
		String sum4 = a + b + c+ d;
		System.out.println(sum4);
		
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(double a, double b, double c, double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(String a, String b, String c, String d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(double a, double b, double c, double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(String a, String b, String c, String d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(double a, double b, double c, double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(String a, String b, String c, String d) {
		// TODO Auto-generated method stub
		
	}

	
		
	
	
}


