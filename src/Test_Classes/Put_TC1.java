package Test_Classes;
import Common_API_Methods.API_Methods;
import Request_Repository.Put_Req_Repository;
import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class Put_TC1 {

	public static void extractor() {
	
		int statusCode=API_Methods.ResponseStatusCode(Put_Req_Repository.BaseURI(),
				Put_Req_Repository.Put_Resource(), Put_Req_Repository.Put_Req_TC1());
		 System.out.println(statusCode);
		 
		 String ResponseBody = API_Methods.ResponseBody(Put_Req_Repository.BaseURI(),
				 Put_Req_Repository.Put_Resource(), Put_Req_Repository.Put_Req_TC1());
		 System.out.println(ResponseBody);
		 
			JsonPath JspResponse= new JsonPath(ResponseBody);
			String Res_name=JspResponse.getString("name");
			String Res_job=JspResponse.getString("job");
			
			Assert.assertEquals(Res_name, "morpheus");
			Assert.assertEquals(Res_job, "leader");
	}
}
