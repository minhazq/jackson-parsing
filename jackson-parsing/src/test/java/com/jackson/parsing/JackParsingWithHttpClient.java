package com.jackson.parsing;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackParsingWithHttpClient {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet("http://api.openweathermap.org/data/2.5/weather?APPID=013f7e07d808de9061a24fb1760b6f62&q=London");
		CloseableHttpResponse response = client.execute(get);
		
		InputStream is = response.getEntity().getContent();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(is);
		
		String country = rootNode.findParent("sys").findValue("country").asText();
		System.out.println(country);// will print out the result
		Assert.assertEquals("Gc", country);// will be failed

	}

}
