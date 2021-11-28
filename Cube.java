package ch10java6thedition;

/**
 * This class holds data about a cube.
 * It extends the Rectangle class.
 * 
 * @author craig
 */
public class Cube extends Rectangle1 {
	
	private double height;	// The cube's height

	/**
	 * The constructor sets the cube's dimensions: 
	 * length, width, and height.
	 * @param len The cube's length
	 * @param w   The cube's width
	 * @param h    The cube's height
	 */
	public Cube(double len, double w, double h) {
		// Call the superclass constructor
		super(len, w);
		height = h;
	}
	
	/**
	 * The getHeight method returns the value 
	 * in the height field.
	 * @return The height of the cube.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * The getSurfaceArea method calculates and returns the 
	 * surface area of the cube.
	 * @return The surface area of the cube.
	 */
	public double getSurfaceArea() {
		return getArea() * 6;
	}

	public double getVolume() {
		return getArea() * height;
	}

}
