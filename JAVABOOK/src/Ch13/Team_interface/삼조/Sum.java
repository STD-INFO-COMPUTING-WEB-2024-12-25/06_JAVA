package Ch13.Team_interface.삼조;

public class Sum implements Calculation {

	@Override
	public void sum(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void sum(int... args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		System.out.println(sum);
	}

	@Override
	public void sum(double... args) {
		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += args[i];
		}
		double roundedNumber = Math.round(sum * 100.0) / 100.0;
		System.out.println(roundedNumber);
	}

	@Override
	public void sum(String... args) {
		String all = "";
		for (int i = 0; i < args.length; i++) {
			if(i == args.length-1) {
				all += args[i];
			}else {
				all += args[i] + "+";
			}
			
		}
		System.out.println(all);

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
