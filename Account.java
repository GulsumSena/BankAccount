package bankaUygulama;

import java.util.Scanner;

public class Account {

	private String accountNumber;
	private String nameCustomer;
	private int balance;
	
	
	public Account(String accountNumber, String nameCustomer, int balance) {
		this.accountNumber = accountNumber;
		this.nameCustomer = nameCustomer;
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void paraYatir() {
		Scanner input=new Scanner(System.in);
		System.out.println("Yatırmak istediğiniz tutar: ");
		int yatir=input.nextInt();
		balance+=yatir;
		
		System.out.println("GÜNCEL HESAP BAKİYE: "+balance);
		
		input.close();
	}
	
	public void paraCek() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Çekmek istediğiniz tutar: ");
		int cekilecek=scn.nextInt();
		
		if(cekilecek>balance) {
			System.out.println("Bakiyeniz yetersiz.");
		}else {
			balance-=cekilecek;
			
			System.out.println("İşlem başarılı.");
			System.out.println();
			System.out.println("GÜNCEL HESAP BAKİYE: "+balance);
			
		}
		
		scn.close();
		
	}
	
	public void hesapBilgiGöster() {
		System.out.println("İSİM: "+this.nameCustomer+"\nHESAP NO: "+this.accountNumber+"\nBAKİYE: "+this.balance+" TL");
		
	}

}
