
public class MaxVolumeFinder {
	private static double width;
	private static double length;
	private static double volume;
	private static double sqrSide;
	
/**------------------
   set/get methods
   ------------------
 */
	//	set/get width
	public void setWidth(double w) {
		width = w;
	}
	
	public static double getWidth() {
		return width;
	}
	
	//	set/get length
	public void setLength(double l) {
	length = l;
	}
	public double getLength() {
		return length;
	}
	
	//	set/get volume
	public void setVolume(double v) {
		volume = v;
	}
	public double getVolume() {
		return volume;
	}
	
	//	set/get sqrSide
	public void setsqrSide(double s) {
		sqrSide = s;
	}
	public double getsqrSide() {
		return sqrSide;
	}
	
/**------------------- 
   FindMax Method
   -------------------
 */
	public void findMax() {
		double temp = 0;
		double boxVolume = 0;
				do {
					temp = boxVolume;
					sqrSide += 0.01;
					boxVolume = (length -  2 * sqrSide) *  (width -  2 * sqrSide) * sqrSide;
				}	
				while(temp < boxVolume);
				sqrSide -= 0.01; 		//	since do-while loop was used must subtract last iteration
		volume = boxVolume;
	}
	
	public void findMax(double lngth, double wdth) {
		length = lngth;
		width = wdth;
		double temp = 0;
		double boxVolume = 0;
				do {
					temp = boxVolume;
					sqrSide += 0.01;
					boxVolume = (length -  2 * sqrSide) *  (width -  2 * sqrSide) * sqrSide;
				}	
				while(temp < boxVolume);
				sqrSide -= 0.01; 		//	since do-while loop was used must subtract last iteration
		volume = boxVolume;
	}
}
