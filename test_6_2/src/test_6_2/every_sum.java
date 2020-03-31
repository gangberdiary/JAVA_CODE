package test_6_2;
import java.util.*;

public class every_sum {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个数字：>");
		long num = input.nextInt();
		int ret = sumdigits (num);
		System.out.println(num + "的所有数字之和为" + ret);
	}
	public static int sumdigits (long n){
		long m = 0;
		long sum = 0;
		while(n > 0){
			m = n % 10;
			sum += m;
			n /= 10;
		}
		return (int)sum;
	}
}
