package yohhatu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greeting")
public class Greeting {

	@GET
	public String greeting() {
		return "Hello World!";
	}

	@GET
	@Path("/afternoon")
	public String greetingWhenAfternoon() {
		return "Good Evenning!";
	}
}
