package Request_Repository;

public class Put_Req_Repository {

	public static String BaseURI() {
		String baseURI="https://reqres.in/";
		return baseURI;
	}
	
	public static String Put_Resource() {
		String put_Resource="api/users/2";
		return put_Resource;
	}
	
	public static String Put_Req_TC1() {
		String RequestBody="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return RequestBody;
	}

}