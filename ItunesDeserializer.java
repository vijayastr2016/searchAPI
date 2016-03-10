
import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;



public class ItunesDeserializer implements JsonDeserializer<Itunes> {

  @Override
  public Itunes deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) 
      throws JsonParseException {
	  
    final JsonObject jsonObject = json.getAsJsonObject();

    final JsonElement jsonResultCount = jsonObject.get("resultCount");
    final int resultCount = jsonResultCount.getAsInt();

    final JsonArray jsonResultsArray = jsonObject.get("results").getAsJsonArray();
    final String[] results = new String[jsonResultsArray.size()];
    for (int i = 0; i < results.length; i++) {
      final JsonElement jsonResult = jsonResultsArray.get(i);
      results[i] = jsonResult.getAsString();
    }
    

    final Itunes itunes = new Itunes();
    itunes.setResultCount(resultCount);
    itunes.setResults(results);
    return itunes;
  }
}