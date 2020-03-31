package bag;

public class number {
	public static void main(String[] args){
		double both_num = 1.0 / 7;
		double death_num = 1.0 / 13;
		double move_num = 1.0 / 45;
		int year_sec = 365 * 24 * 60 * 60;
		int num = 312032486;
		int firstyear_num = (int)(num + year_sec * (both_num - death_num +move_num));
		int secondyear_num = (int)(firstyear_num + year_sec * (both_num - death_num +move_num));
		int thirdyear_num = (int)(secondyear_num + year_sec * (both_num - death_num +move_num));
		int fourthyear_num = (int)(thirdyear_num + year_sec * (both_num - death_num +move_num));
		int fifthyear_num = (int)(fourthyear_num + year_sec * (both_num - death_num +move_num));
		
		System.out.println("第一年美国人口为：>" + firstyear_num);
		System.out.println("第二年美国人口为：>" + secondyear_num);
		System.out.println("第三年美国人口为：>" + thirdyear_num);
		System.out.println("第四年美国人口为：>" + fourthyear_num);
		System.out.println("第五年美国人口为：>" + fifthyear_num);
	}
}
