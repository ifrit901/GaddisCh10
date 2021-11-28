package ch10java6thedition;

/**
 * This is Code Listing 10-40, the DvdMovie class.
 * 
 * @author craig
 */
public class DvdMovie implements RetailItem {
		
	private String title;		// The DVD's title
	private int runningTime; 	// The running time in minutes
	private double retailPrice; 	// The DVD's retail price

	/**
	 * Constructor
	 * @param dvdTitle The title of the DVD.
	 * @param dvdRunningTime The running time in minutes.
	 * @param dvdRetailPrice The retail price of the DVD.
	 */
	public DvdMovie(String dvdTitle, int dvdRunningTime, double dvdRetailPrice) {

		title = dvdTitle;
		runningTime = dvdRunningTime;
		retailPrice = dvdRetailPrice;

	}

	/**
	 * The getTitle method returns the DVD's title.
	 * @return The DVD's title.
	 */
	public String getTitle() {

		return title;
	}

	/**
	 * The getRunningTime method returns the number
	 * of minutes the movie lasts. 
	 * @return The movie's time in minutes.
	 */
	public int getRunningTime() {

		return runningTime;

	}

	/**
	 * The getRetailPrice method returns the retail price
	 * of the DVD.
	 * @return The price of the movie.
	 */
	public double getRetailPrice() {

		return retailPrice;

	}


}
