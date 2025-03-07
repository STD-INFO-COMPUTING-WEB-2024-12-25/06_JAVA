package Ch13.Team_interface.삼조;

public class Div implements Calculation {

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
		System.out.printf("%d / %d = %d\n", a, b, a / b);

	}

	@Override
	public void div(int... args) {
		int div = args[0];
		for (int i = 1; i < args.length; i++) {
			if (i < args.length - 1) {
				System.out.printf("%d / ", args[i]);
			} else {
				System.out.printf("%d = ", args[i]);
			}
			div /= args[i];
		}
		System.out.println(div);
	}

	@Override
	public void div(double... args) {
		double div = args[0];
		for (int i = 1; i < args.length; i++) {
			if (i < args.length - 1) {
				System.out.printf("%f / ", args[i]);
			} else {
				System.out.printf("%f = ", args[i]);
			}
			div /= args[i];
		}
		System.out.println(div);
	}

	@Override
	public void div(String... args) {
		String div = "";
		for (int i = 0; i < args.length; i++) {
			if (i < args.length - 1) {
				div += args[i] + " / ";
			} else {
				div += args[i];
			}
		}
		System.out.println(div);

	}
}