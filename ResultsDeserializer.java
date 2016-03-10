
import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class ResultsDeserializer implements JsonDeserializer<Results> {

  @Override
  public Results deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
      throws JsonParseException {
    final JsonObject jsonObject = json.getAsJsonObject();

    final Results results = new Results();
    results.setCountry(jsonObject.get("country").getAsString());
    results.setArtist(jsonObject.get("artist").getAsString());
    results.setKind(jsonObject.get("artist").getAsString());
    results.setTrackName(jsonObject.get("trackName").getAsString());
    //set all other json array keys here
    return results;
  }
}
