package Ch13.Team_interface.삼조;

public class test {

	public static void main(String[] args) {
		Ch13.Team_interface.삼조.Calculation cal3 = new Ch13.Team_interface.삼조.Sum();

		cal3.sum(10, 20); // 2개 인자 받아 덧셈 화면 출력
		cal3.sum(10, 20, 30, 40, 50);// n개 인자 받아 덧셈 화면 출력
		cal3.sum(10.5, 20.2, 30.4, 50.6);// n개 인자 받아 덧셈 화면 출력
		cal3.sum("문자열1", "문자열2", "문자열3", "문자열4");// n개 문자열받아 '+'를 기준으로 문자열덧붙여 출력

	}

}
