package Chapter5;

public class SumSquare {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int num = 3;
		int cummulation = 9;
		while (num <= 33) {
			System.out.printf("\nCummulation result: %-6d : %4d %4s %4d", cummulation, num, '*', num);
			num = num + 3;
			if(num <= 33) {
				cummulation = num * num + cummulation;
			}
			else break;
		}
		System.out.println("\nThes SUM of square of multiples of 3 is " + cummulation);
	}
}
