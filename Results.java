

public class Results {

  private String wrapperType;
  private String kind;
  private String artist;
  private String trackName;
  private String country;
  //initialize all other Results json array keys here
  
  
  //getters and setters for all Results json array keys here
  public String getArtist() {
    return artist;
  }

  public String getTrackName() {
    return trackName;
  }

  public String getCountry() {
	    return country;
	  }
  
  public String getWrapperType() {
	    return wrapperType;
	  }
  
  public String getKind() {
	    return kind;
	  }
  
  
  public void setArtist(final String artist) {
    this.artist = artist;
  }

  public void setCountry(final String country) {
    this.country = country;
  }
  
  public void setKind(final String kind) {
	    this.kind = kind;
  }
  
  public void setTrackName(final String trackName) {
	    this.trackName = trackName;
  }

 
}
