package Test_Classes;
import Common_API_Methods.API_Methods;
import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import Request_Repository.Post_Req_Repository;

public class Post_TC1 {

	public static void extractor() {
	
		int statusCode=API_Methods.ResponseStatusCode(Post_Req_Repository.BaseURI(), Post_Req_Repository.Post_Resource(), 
				Post_Req_Repository.Post_Req_TC1());
		 System.out.println(statusCode);
		 
		 String ResponseBody = API_Methods.ResponseBody(Post_Req_Repository.BaseURI(), Post_Req_Repository.Post_Resource(),
				 Post_Req_Repository.Post_Req_TC1());
		 System.out.println(ResponseBody);
		 
			JsonPath JspResponse= new JsonPath(ResponseBody);
			String Res_name=JspResponse.getString("name");
			String Res_job=JspResponse.getString("job");
			
			Assert.assertEquals(Res_name, "morpheus");
			Assert.assertEquals(Res_job, "leader");
	}
}
