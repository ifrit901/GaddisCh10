package ch10java6thedition;

/**
 * Code Listing 10-39. The CompactDisc class. 
 * 
 * @author craig
 */
public class CompactDisc implements RetailItem {
	
	private String artist;		// The CD's artist
	private String title;		// The CD's title
	private double retailPrice;	// The CD's retail price

	/**
	 * Constructor
	 * @param cdArtist The name of the artist
	 * @param cdTitle The title of the CD
	 * @param cdPrice The price of the CD
	 */
	public CompactDisc(String cdArtist, String cdTitle, double cdPrice) {
		artist = cdArtist;
		title = cdTitle;
		retailPrice = cdPrice;
	}

	/**
	 * The getTitle method returns the CD's title
	 * @return The CD's title.
	 */
	public String getTitle() {
		
		return title;

	}
	
	/**
	 * The getArtist method returns the CD's artist name.
	 * @return The name of the CD's artist.
	 */
	public String getArtistI() {

		return artist;

	}
	/**
	 * The getRetailPrice method (required by the RetailItem interface)
	 * @return The retail price of the CD.
	 */
	public double getRetailPrice() {

		return retailPrice;

	}
}
