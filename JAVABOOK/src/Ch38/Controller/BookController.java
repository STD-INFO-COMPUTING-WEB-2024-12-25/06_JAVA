package Ch38.Controller;

import java.util.HashMap;
import java.util.Map;

public class BookController implements SubController {

	//C(1)R(2)U(3)D(4) 
	@Override
	public Map<String, Object> execute(Map<String, Object> params) {
		System.out.println("[SC] BookController execute invoke..!");
		//00 
		Map<String, Object> response = new HashMap();
		Integer serviceNo =(Integer)params.get("serviceNo");
		if(serviceNo==null) {
			response.put("status", false);
			response.put("message", "유효하지 않은 서비스 요청입니다.");
			return response;
		}
		switch(serviceNo) {
			case 1:			//C - 도서등록(ROLE-사서,관리자)
				System.out.println("[SC] 도서등록 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 2:			//R - 도서조회(ROLE-회원,사서,관리자)
				System.out.println("[SC] 도서조회 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 3:			//U - 도서수정(ROLE-사서,관리자)
				System.out.println("[SC] 도서수정 수정 요청 확인");
				//01 파라미터받기
				//02 유효성검증(Data Validation)
				//03 관련 서비스 실행
				//04 뷰로 이동(or 내용전달)
				break;
			case 4:			//D - 도서삭제(ROLE_사서,관리자)
				System.out.println("[SC] 도서삭제 요청 확인");
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
