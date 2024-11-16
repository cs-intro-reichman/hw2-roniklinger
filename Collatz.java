// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int seed = Integer.parseInt(args[0]);
		String ch = args[1];
		int num = seed;
		int i = 0;
		int j = 0;
		int count = 1;
		while (i != seed){
			i++;
			num = i;
			count = 1;
			System.out.print(i + " ");
			if(i == 1){
				j = 1;
			}
			while (num != 1 || j == 1 ){
				if (j == 1){
					j++;
				}
					if (num % 2 == 0){
						num = num / 2;
						if(ch.charAt(0) == 'v'){
							System.out.print(num + " ");
						}
					}
					else{
						num = (num * 3) + 1;
						if(ch.charAt(0) == 'v'){
							System.out.print(num + " ");
						}
					}
				count++;
			}
			if(ch.charAt(0) == 'v'){
				System.out.println("(" + count + ")");
			}
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}

