/**
 * 
 */
package week1.day2;

/**
 * @author srikavihar
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(1,2,3));
		System.out.println(sub(4,3));
		System.out.println(mul(4,5));
		System.out.println(div(6, 7));
		

	}

	 static float div(float i, float j) {
		// TODO Auto-generated method stub
		
		float ret = j/i;
		
		return ret;
		
	}

	 static double mul(double i, double j) {
		
		
		double ret = i*j;
		
		return ret;
		
	
		
	}

	static int sub(int i, int j) {
		// TODO Auto-generated method stub
		int ret;
		return ret = j-i;
		
		
	}

	 static int add(int i, int j, int k) {
		
		int ret;
		return ret = i + j + k;
		
	}

}
