import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class get {
	@Test
	public void get() {
//		 Response res = get("https://reqres.in/api/users?page=2").he
//		 res.header("x-api-key","reqres-free-v1");
//		 System.out.println(".asSstring output"+res.asString());
//		 System.out.println("get response"+res.getBody().asString());
//		 System.out.println(res.statusCode());
//		 System.out.println();
		 
		 given().
		 		header("x-api-key","reqres-free-v1").
		 		get("https://reqres.in/api/users?page=2").
		 then()
		 		.statusCode(200);		 
	}

}
