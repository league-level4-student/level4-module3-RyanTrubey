package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double numerator, double denominator) throws IllegalArgumentException {
		if(denominator == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return numerator/denominator;
		}
	}
	
	public String reverseString(String s) throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalStateException();
		} else {
			char[] reverse = new char[s.length()];
			for(int i = 0; i < s.length(); i++) {
				reverse[i] = s.charAt(s.length()-i-1);
			}
			return reverse.toString();
		}
	}
}
