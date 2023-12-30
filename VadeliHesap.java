package bankaUygulama;

public class VadeliHesap extends Account {
	
	private double faizOrani;
	private double vergiKesinti;
		
	public VadeliHesap(String accountNumber, String nameCustomer, int balance, double faizOrani,
			double vergiKesinti) {
		super(accountNumber, nameCustomer, balance);
		this.faizOrani = faizOrani;
		this.vergiKesinti=vergiKesinti;
	}
	
	public void faizEkle() {
		System.out.println();
		System.out.println("Faiz Oranı: "+this.faizOrani);
		System.out.println("Vergi Kesinti Oranı: "+this.vergiKesinti);
		
		double toplamFaiz=super.getBalance()*this.faizOrani;
		double toplamKesinti=toplamFaiz*vergiKesinti;
		double gelir=(toplamFaiz-toplamKesinti);
				
		System.out.println("Kazanacağınız brüt faiz tutarı "+toplamFaiz+" TL");
		System.out.println("Vergi kesintisi: "+toplamKesinti+" TL");
		System.out.println("Vade sonunda net faiz "+gelir+" TL");
		System.out.println("Vade sonunda net bakiye: "+(super.getBalance()+gelir)+" TL");
		
	}

	

}
