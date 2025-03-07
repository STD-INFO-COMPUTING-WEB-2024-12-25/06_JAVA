package Ch13.Team_interface.사조;

public class Mul implements Calculation {

	
	public Mul() {
		super();
	}

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
		System.out.println(a*b);
	}

	@Override
	public void mul(int... args) {
		// TODO Auto-generated method stub
		int mul=1;
		for (int i = 0; i < args.length; i++) {
			mul*=args[i];	
		}
		System.out.println(mul);
		
	}

	@Override
	public void mul(double... args) {
		// TODO Auto-generated method stub
		double sum=1.0;
		for (int i = 0; i < args.length; i++) {
			sum*=args[i];
			
		}
		System.out.println(sum);
	}

	@Override
	public void mul(String... args) {
		// TODO Auto-generated method stub
		String string="";
		for (int i = 0; i < args.length; i++) {
			if (i == (args.length-1)) {
				string+=args[i];
			}else {
				string+=args[i]+"*";
			}
			

		}
		System.out.println(string);
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
