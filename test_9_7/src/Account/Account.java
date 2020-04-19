package Account;
import java.util.Date;

public class Account { //Account类

	public static void main(String[] args) {
		
		Account account = new Account(1122, 20000);//初始化id和初始存款
		account.setAnnualInterestRate(4.5);//输入年利率
		account.withDraw(2500);//提取
		account.deposit(3000);//存储
		//打印余额，每月利息，以及该帐户创建的日期。
		System.out.println("余额为: "+account.getBalance()+"\n"
				+"月利息为: "+account.getMonthlyInterestRate()+"\n"
				+"开户日期为: "+account.getDateCreated());
	}


	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthlyInterestRate = annualInterestRate / 12;
		return balance * monthlyInterestRate / 100;
	}
	
	public void withDraw(double money) {
		balance -= money;
	}
	
	public void deposit(double money) {
		balance += money;
	}
	
}
