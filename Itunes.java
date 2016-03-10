import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;

public class Itunes {

	     public final String USER_AGENT = "Mozilla/5.0";
	     static String url = "";
	     InputStream resp;
	
	      private int resultCount;
	      private String[] results;
		 
	      
	      public int getResultCount() {
		    return resultCount;
		  }

	     
	      public String[] getResults() {
				return results;
		  }
	      
	      
		  public void setResults(final String[] results) {
		    this.results = results;
		  }

		  
		  public void setResultCount(final int resultCount) {
		    this.resultCount = resultCount;
		  }

		  
		  public InputStream sendGetRequest(String url) throws IOException, JSONException {

				URL obj = new URL(url);
				HttpURLConnection con = (HttpURLConnection) obj.openConnection();
				con.setRequestMethod("GET");
				con.setRequestProperty("User-Agent", USER_AGENT);
				int responseCode = con.getResponseCode();
				
				System.out.println("\nSending 'GET' request to URL : " + url);
				System.out.println("Response code : " + responseCode);

				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;

				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
                System.out.println(resp.toString());
		       // resp = response.toString();
		        return resp;
			}
			

		  
		 /* @Override
		  public String toString() {
		      return resp.toString();
		  }*/
		}

