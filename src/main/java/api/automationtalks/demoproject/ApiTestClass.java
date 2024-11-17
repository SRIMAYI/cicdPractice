package api.automationtalks.demoproject;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ApiTestClass {

    @Test
    public void api_Test_Cases() throws IOException {
        String name = RandomStringUtils.randomAlphabetic(8);
        HttpUriRequest request = new HttpGet("https://api.github.com/users/" + name);

        CloseableHttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(),404);
        System.out.println("------------>httpResponse.getStatusLine().getStatusCode()---->"+httpResponse.getStatusLine().getStatusCode());




        HttpUriRequest request1 = new HttpGet("https://www.facebook.com/");

        CloseableHttpResponse httpResponse1 = HttpClientBuilder.create().build().execute(request1);

        System.out.println(httpResponse1.getStatusLine().getStatusCode()+"Keerthesh");

        Assert.assertEquals(httpResponse1.getStatusLine().getStatusCode(),200);
        System.out.println("------------>httpResponse.getStatusLine().getStatusCode()---->"+httpResponse1.getStatusLine().getStatusCode());
    }
}
