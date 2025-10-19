import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class post {
@Test
	public void post() {
		
		JSONObject req = new JSONObject();
		req.put("name","morpheus");
		req.put( "job","leader");
		System.out.println(req.toJSONString());
	
		
		given().
				header("x-api-key","reqres-free-v1").
				body(req.toJSONString()).
				contentType(ContentType.JSON).
				accept(ContentType.JSON).
		when().
			  post("https://reqres.in/api/users").
		then().
			  statusCode(201);
	}

}
