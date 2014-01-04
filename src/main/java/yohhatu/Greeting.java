package yohhatu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greeting")
public class Greeting {

	@GET
	public String greeting() {
		return "Hello World!";
	}
}
