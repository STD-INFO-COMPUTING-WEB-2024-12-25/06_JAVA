package Ch38.Tests.Controller;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Controller.FrontController;

class ControllerTests {

	FrontController fc = FrontController.getInstance();
	
	@Test
	void test() {
		//View에서 요청정보 담기
		Map<String,Object> params = new HashMap();
		params.put("endPoint", "/user");//endPoint
		params.put("serviceNo", 1);	//ServiceNo
		//회원가입-인자전달
		params.put("userid","1user555");
		params.put("username","홍길동");
		params.put("password","1234");
		
		//요청하기
		Map<String,Object> response =  fc.execute(params);
		
		//응답확인
		for(String key : response.keySet()) {
			System.out.println(key + " : " + response.get(key));
		}
		
		
	}

	
	@Test
	@Disabled
	void test_99() {
		
	}

}
