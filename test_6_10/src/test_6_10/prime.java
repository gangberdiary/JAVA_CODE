package test_6_10;

public class prime {
	public static void main(String[] args){
		System.out.println("小于10000的素数有：");
		printprime();
	}
	public static void printprime(){
		int count = 0;//记输出素数的个数；
		int num = 2;
		while(num < 10000){
			if(isprime(num)){
				count++;
				System.out.printf("%5d", num);
				num++;
				if(count % 10 == 0){
					System.out.print("\n");
				}
			}
			else
				num++;
		}
	}
	public static boolean isprime(int _num){
		int divisor;
		for(divisor = 2; divisor <= _num/2; divisor++){
			if(_num % divisor == 0)
				return false;
		}
		return true;
	}
}
