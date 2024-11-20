// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		
		int num = Integer.parseInt(args[0]);
		double approx = 0;
		for(int i = 0; i < num ; i++){
			approx = approx + (Math.pow(-1, i) / (2 * i + 1));
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approx*4);
	}
}
