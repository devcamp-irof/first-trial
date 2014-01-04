package yohhatu;

import glassfish.GlassFishTamer;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingTest {

    @ClassRule
    public static GlassFishTamer tamer = new GlassFishTamer("app", 8081);
    private WebTarget target;

    @Before
    public void setup() {
        target = ClientBuilder.newClient().target("http://localhost:8081/app/api");
    }

    @Test
    public void test() {
        String response = target.path("greeting")
                .request()
                .get(String.class);

        assertThat(response, is("Hello World!"));
    }

    @Test
    public void testAfternoon() {
        String response = target.path("greeting/afternoon")
                .request()
                .get(String.class);

        assertThat(response, is("Good Evenning!"));
    }
}
