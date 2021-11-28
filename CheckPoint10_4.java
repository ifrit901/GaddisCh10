package ch10java6thedition;

/**
 * Check Point 10-4. 
 * 
 * @author craig
 */
public class CheckPoint10_4 {
	public static void main(String[]args) {
		/**
		 * 10.4 Look at the following classes:
		 * 
		 * 	public class Ground {
		 * 		
		 * 		public Ground() {
		 *			System.out.println("You are on the ground."); 
		 * 		}
		 * 	}
		 * 
		 * 	public class Sky extends Ground {
		 *		
		 * 		public Sky() {
		 *			System.out.println("You are in the sky."); 
		 * 		}
		 * 	}
		 * 
		 *     What will the following program display?
		 * 
		 * 	public class CheckPoint {
		 *		public static void main(String[]args) {
		 *			Sky object = new Sky(); 
		 * 		}
		 * 	}
		 * 
		 *     The program will display "You are on the ground."
		 * 		             "You are in the sky."
		 * 
		 * 10.5 Look at the following classes:
		 * 
		 * 	public class Ground {
		 * 
		 * 		public Ground() {
		 *			System.out.println("You are on the ground."); 
		 * 		}
		 * 
		 * 		public Ground(String groundColor) {
		 *			System.out.println("The ground is " + groundColor); 
		 * 		}
		 * 	}
		 * 
		 * 	public class Sky extends Ground {
		 *		
		 * 		public Sky() {
		 *			System.out.println("You are in the sky."); 
		 * 		}
		 * 
		 * 		public Sky(String skyColor) { 
		 *			super("green"); 
		 * 			System.out.println("The sky is " + skyColor);
		 * 		}
		 * 	}
		 * 
		 *     What will the following program display?
		 * 
		 * 	public class CheckPoint {
		 *		
		 * 		public static void main(String[]args) {
		 *			Sky object = new Sky("blue"); 
		 * 		}
		 * 	}
		 * 
		 *     This program will display "The ground is green."
		 * 		              "The sky is blue."
		 * 
		 */
	}		
}
