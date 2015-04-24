package com.main;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.BasicManagedEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Assert;
import org.junit.Test;

public class TestBasic
{
	@Test
	public void testGet()
	{
		try
		{
			HttpGet httpGet = new HttpGet("/RestBasic/hello");
			httpGet.addHeader("Content-Type", MediaType.TEXT_PLAIN);
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse httpResponse = httpClient.execute(new HttpHost("localhost", 8080), httpGet);
			Assert.assertNotNull(httpResponse);
			Assert.assertTrue(httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK);
			System.out.println("Response : " + IOUtils.toString(((BasicManagedEntity) httpResponse.getEntity()).getContent()));
		} catch (IOException e)
		{
			e.printStackTrace();
			Assert.fail();
		}
	}
}
