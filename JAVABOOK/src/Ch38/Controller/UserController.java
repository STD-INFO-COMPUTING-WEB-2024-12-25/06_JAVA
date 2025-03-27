package Ch38.Controller;

import java.util.HashMap;

//인증 ENDPOINT 

//기능	범위		URI		요청 파라미터			응답형태				설명
//인증	공통		/user	Map<String,Object>	Map<String,Object>	인증서비스입니다(C:1,R:2...)
//
//회원가입	개별	/user		"ServiceNo":int		"success":boolean	회원가입 요청 처리입니다
//						"userId":String
//						"username":String
//						"password":String
//		

import java.util.Map;

public class UserController implements SubController{

	//C(1)R(2)U(3)D(4) + 로그인(5),로그아웃(6)
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] UserController execute invoke..!");
		//00 
		Map<String, Object> response = new HashMap();
		Integer serviceNo =(Integer)params.get("serviceNo");
		if(serviceNo==null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
			return response;
		}
		switch(serviceNo) {
			case 1:			//C - 회원가입
				System.out.println("[SC] 회원가입 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 2:			//R - 개인 회원 정보 조회
				System.out.println("[SC] 회원정보 조회 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 3:			//U - 개인 회원 정보 수정
				System.out.println("[SC] 회원정보 수정 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 4:			//D - 개인 회원 탈퇴
				System.out.println("[SC] 회원탈퇴 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 5:			//P - 로그인
				System.out.println("[SC] 로그인 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 6:			//P - 로그아웃
				System.out.println("[SC] 로그아웃 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			default :
				System.out.println("[SC] 잘못된 서비스번호 요청 확인");
				response.put("status", false);
				response.put("message", "잘못된 서비스번호 요청입니다.");
		}

		
		return response;
	}

}
