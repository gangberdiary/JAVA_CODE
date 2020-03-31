package test_5_5;

public class print {
	public static void main(String[] args){
		System.out.println("Kilograms Pounds | Pounds Kilograms");
		int p2 = 20, k1 = 1;
		double p1, k2;
		while(k1 <= 199){
			p1 = k1 * 2.2;
			k2 = p2 *0.4545;
			System.out.printf("%-9d %6.1f | %-6d %9.2f\n", k1, p1, p2, k2);
			k1 += 2;
			p2 += 5;
		}
	}
}
