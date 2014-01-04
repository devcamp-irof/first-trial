package yohhatu;

import glassfish.GlassFishTamer;
import org.junit.Rule;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingTest {

    @Rule
    public GlassFishTamer tamer = new GlassFishTamer("hoge", 8081);

    @Test
    public void test() {
        Client client = ClientBuilder.newClient();
        String response = client.target("http://localhost:8081")
                .path("hoge/api/greeting")
                .request()
                .get(String.class);

        assertThat(response, is("Hello World!"));
    }
}
