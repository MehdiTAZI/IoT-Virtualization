package helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WirelessCTDriver {

	/*public static void main(String[] args){
		new WirelessCTDriver().displayMessage("hello mehdi");
	}*/

	private final String DISPLAY_END_POINT= "http://localhost:8080/wireless-display/";
	private final String SPACE_HTTP_REPLACEMENT = "%20";
	public void displayMessage(final String message) {

	  try {

		  final URL url = new URL(DISPLAY_END_POINT + message.replaceAll(" ",SPACE_HTTP_REPLACEMENT));
		  HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
		  httpURLConnection.setRequestMethod("GET");
		  httpURLConnection.setRequestProperty("Accept", "application/json");

		if (httpURLConnection.getResponseCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ httpURLConnection.getResponseCode() + " \nMessage : " + httpURLConnection.getErrorStream());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(
			(httpURLConnection.getInputStream())));

		String output;
		while ((output = br.readLine()) != null) {
			System.out.println(output);
		}

		  httpURLConnection.disconnect();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }

	}

}