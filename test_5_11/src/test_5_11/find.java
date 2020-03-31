package test_5_11;

public class find {
	public static void main(String[] args){
		int num;
		int count = 0;
		for(num=100; num<=200; num++){
			if((num % 5 == 0 && num % 6 != 0) || (num % 5 != 0 && num % 6 == 0)){
				System.out.printf("%-4d", num);
				count++;
				if(count % 10 == 0){
					System.out.printf("\n");
				}
			}
		}
	}
}
