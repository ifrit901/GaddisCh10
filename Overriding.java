package ch10java6thedition;

/**
 *
 * @author craig
 */
public class Overriding extends Overriders{
	@Override	
	public int override(int i) {
		i = super.override(i);
		return i;
	}

}
