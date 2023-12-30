package bankaUygulama;

import java.util.Scanner;

public class KrediHesabi extends Account {

	private int krediLimiti;
		
	

	public KrediHesabi(String accountNumber, String nameCustomer, int balance, int krediLimiti) {
		super(accountNumber, nameCustomer, balance);
		this.krediLimiti = krediLimiti;
	}

	public int getKrediLimiti() {
		return krediLimiti;
	}

	public void krediKullan() {
		Scanner veri=new Scanner(System.in);
		System.out.println("Kredi limitiniz: "+this.krediLimiti+" TL");
		System.out.println("Kredi talebiniz(TL): ");
		int krediTalebi=veri.nextInt();
		if(krediTalebi>krediLimiti) {
			System.out.println("Kredi limitiniz yetersiz. ");
		}else {
			System.out.println(krediTalebi+" TL tutarındaki kredi talebiniz onaylanmıştır. ");
			this.krediLimiti-=krediTalebi;
			System.out.println("Kullanılabilir kredi limiti: "+this.krediLimiti+" TL");
			System.out.println("Mevcut bakiye: "+(krediTalebi+super.getBalance())+ " TL");
			
		}
		veri.close();
	}

}
