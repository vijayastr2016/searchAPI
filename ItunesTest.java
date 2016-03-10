
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class ItunesTest {

   Itunes itunes = new Itunes();
   

   //Positive Testing
   @Test
   public void testValidTermParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term=adele";
	   
	   int expectedResultCount = 50;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
   
   
   //Positive Testing
   @Test
   public void testValidLimitParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term=adele&limit=1";
	   
	   int expectedResultCount = 1;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
   
   
   //Positive Testing
   @Test
   public void testValidCountryParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term=adele&limit=1&country=us";
	   
	   int expectedResultCount = 1;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
   
   
   
   //Positive Testing
   @Test
   public void testValidKindParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term=James+Bond&limit=1&country=us&kind=movie";
	   
	   int expectedResultCount = 1;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
   
      
   //Negative Testing
   @Test
   public void testEmptyTermParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term";
	   
	   int expectedResultCount = 0;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
   
   
   //Negative Testing
   @Test
   public void testEmptyLimitParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term=adele&limit";
	   
	   int expectedResultCount = 50;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
   
   
   //Negative Testing
   @Test
   public void testInvalidCountryParameter() throws Exception {
	   
	   String testTermString = "https://itunes.apple.com/search?term=adele&limit=1&country=s";
	   
	   int expectedResultCount = 0;
	   int actualResultCount;

	    InputStream responseStr = itunes.sendGetRequest(testTermString); 
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(Itunes.class, new ItunesDeserializer());
	    final Gson gson = gsonBuilder.create();

	    try (Reader data = new InputStreamReader(responseStr)) {
            itunes = gson.fromJson(data, Itunes.class);
            actualResultCount = itunes.getResultCount();
            Assert.assertEquals(expectedResultCount, actualResultCount);
        }
      }
  
   
  }


