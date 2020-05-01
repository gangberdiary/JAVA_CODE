package test;

import java.util.Date;

//测试类

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id1 = 1122;
		int id2 = 2211;
		double balance = 10000;
		double annoualIntegerRate = 0.0025;
		
		System.out.println("*****************************************CheckingAccount2*************************************\n");
		CheckingAccount2 check1 = new CheckingAccount2();
		CheckingAccount2 check2 = new CheckingAccount2(id1,balance);
		CheckingAccount2 check3 = new CheckingAccount2(id2,balance,annoualIntegerRate);
		
		System.out.println("---------------------Check1---------------------\n");
		System.out.println(check1.getDateCreated());
		System.out.println(check1.getId());
		System.out.println(check1.getBalance());
		System.out.println(check1.getAnnualIntegerRate());
		
		double depositBalance = 1000;
		check1.deposit(depositBalance);
		System.out.println(check1.getBalance());
		
		double  withDarawBalance = 1000;
		check1.withDaraw(withDarawBalance);
		System.out.println(check1.getBalance());
		System.out.println();
		System.out.println(check1.toString());
		
		
		System.out.println("---------------------Check2---------------------\n");
		System.out.println(check2.getDateCreated());
		System.out.println(check2.getId());
		System.out.println(check2.getBalance());
		System.out.println(check2.getAnnualIntegerRate());
		
		check2.deposit(depositBalance);
		System.out.println(check2.getBalance());
		
		check2.withDaraw(withDarawBalance);
		System.out.println(check2.getBalance());
		System.out.println();
		System.out.println(check2.toString());
		
		
		System.out.println("---------------------Check3---------------------\n");
		System.out.println(check3.getDateCreated());
		System.out.println(check3.getId());
		System.out.println(check3.getBalance());
		System.out.println(check3.getAnnualIntegerRate());
		
		check3.deposit(depositBalance);
		System.out.println(check2.getBalance());
		
		check3.withDaraw(withDarawBalance);
		System.out.println(check3.getBalance());
		System.out.println();
		System.out.println(check3.toString());
		
		
		System.out.println("---------------------Check3---------------------\n");
		System.out.println(check3.getDateCreated());
		System.out.println(check3.getId());
		System.out.println(check3.getBalance());
		System.out.println(check3.getAnnualIntegerRate());
		
		check3.deposit(depositBalance);
		System.out.println(check2.getBalance());
		
		check3.withDaraw(200000);
		System.out.println(check3.getBalance());
		System.out.println();
		System.out.println(check3.toString());
		
		
		System.out.println("*****************************************SavingAccount2*************************************");
		SavingAccount2 saving1 = new SavingAccount2();
		SavingAccount2 saving2 = new SavingAccount2(id1,balance);
		SavingAccount2 saving3 = new SavingAccount2(id2,balance,annoualIntegerRate);
		
		System.out.println("---------------------saving1---------------------\n");
		System.out.println(saving1.getDateCreated());
		System.out.println(saving1.getId());
		System.out.println(saving1.getBalance());
		System.out.println(saving1.getAnnualIntegerRate());
		
		saving1.deposit(depositBalance);
		System.out.println(check1.getBalance());
		
		saving1.withDaraw(withDarawBalance);
		System.out.println(saving1.getBalance());
		System.out.println();
		System.out.println(saving1.toString());
		
		System.out.println("---------------------saving2---------------------\n");
		System.out.println(saving2.getDateCreated());
		System.out.println(saving2.getId());
		System.out.println(saving2.getBalance());
		System.out.println(saving2.getAnnualIntegerRate());
		
		saving2.deposit(depositBalance);
		System.out.println(check2.getBalance());
		
		saving2.withDaraw(withDarawBalance);
		System.out.println(saving2.getBalance());
		System.out.println();
		System.out.println(saving2.toString());
		
		System.out.println("---------------------saving3---------------------\n");
		System.out.println(saving3.getDateCreated());
		System.out.println(saving3.getId());
		System.out.println(saving3.getBalance());
		System.out.println(saving3.getAnnualIntegerRate());
		
		saving3.deposit(depositBalance);
		System.out.println(saving3.getBalance());
		
		saving3.withDaraw(withDarawBalance);
		System.out.println(saving3.getBalance());
		System.out.println();
		System.out.println(saving3.toString());
		
		System.out.println("---------------------saving4---------------------\n");
		System.out.println(saving1.getDateCreated());
		System.out.println(saving1.getId());
		System.out.println(saving1.getBalance());
		System.out.println(saving1.getAnnualIntegerRate());
		
		saving1.deposit(depositBalance);
		System.out.println(check1.getBalance());
		
		saving1.withDaraw(20000);
		System.out.println(saving1.getBalance());
		System.out.println();
		System.out.println(saving1.toString());
		
	}

}
//Account类

class Account2 {

	protected int id;
	protected double balance;
	protected double annualIntegerRate;
	protected Date dateCreated;

	protected Account2() {
	}

	protected Account2(int id,double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	protected Account2(int id,double balance,double annualIntegerRate) {
		this(id,balance);
		dateCreated = new Date();
		this.annualIntegerRate = annualIntegerRate;
	}

	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	protected double getAnnualIntegerRate() {
		return annualIntegerRate;
	}

	protected void setAnnualIntegerRate(double annualIntegerRate) {
		this.annualIntegerRate = annualIntegerRate;			
	}

	protected void withDaraw(double withDarawBalance) {
		if(balance - withDarawBalance>-50000) {
			balance = balance - withDarawBalance;
		}
		
		else {
			System.out.println("透支额度不足！");
		}
		
	}

	protected void deposit(double depositBalance) {
		balance = balance + depositBalance;
	}

	protected void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	protected Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "Id Created is->"+getDateCreated()+"\nId->"+getId()+"\nBalance->"+getBalance()+"\nAnnualIntegerRate->"+getAnnualIntegerRate();
	}
}


//CheckingAccount类

class CheckingAccount2 extends Account2{
	
	public CheckingAccount2() {
		
	}
	
	public CheckingAccount2(int id,double balance) {
		super(id,balance);
	}
	
	public CheckingAccount2(int id,double balance,double annualIntegerRate) {
		super(id,balance,annualIntegerRate);
	}
		
	@Override 
	public String toString() {
		return "Account typte：CheckingAccount\n"+super.toString();
	}
	
}


//SavingAccount类
class SavingAccount2 extends Account2{

	public SavingAccount2() {

	}

	public SavingAccount2(int id,double balance) {
		super(id,balance);
	}

	public SavingAccount2(int id,double balance,double annualIntegerRate) {
		super(id,balance,annualIntegerRate);
	}
	
	protected void withDaraw(double withDarawBalance) {
		if(balance-withDarawBalance<0) {
			System.out.println("账户余额不足！余额为："+getBalance());
		}
		
		else {
			balance = balance - withDarawBalance;
		}	
	}

	public String toString() {
		return "Account typte：SavingAccount\n"+super.toString();
	}
}



