package Ch19;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class C12RestRequestResponseMain {

	public static void main(String[] args) throws Exception {
		//URL,PARAM 지정
		String url = "https://www.daegufood.go.kr/kor/api/tasty.html";
		String mode = "json";
		String addr = "중구";
		url = url+"?mode="+mode+"&addr="+addr;
		
		//Http Request 객체 생성
		HttpRequest httpRequest = HttpRequest.newBuilder()
									.uri(URI.create(url))
									.GET()		
									.build();
		
		//Http Request 요청 / 응답 확인
		HttpClient httpClient =  HttpClient.newHttpClient();
		
		HttpResponse<String> response =
		httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());	
//		System.out.println(response.body());
		
		//가공 처리 (Class Type vs JSON Type)
		

	}

}





