package bankaUygulama;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		VadeliHesap vadeli1=new VadeliHesap("333333", "Gülsüm Sena Akdoğan", 3000, 0.6, 0.3);
		VadesizHesap vadesiz1=new VadesizHesap("111111", "Gülsüm Sena Akdoğan", 1000);
		VadesizHesap vadesiz2=new VadesizHesap("222222", "Gülsüm Sena Akdoğan", 1500);
		KrediHesabi kredi1=new KrediHesabi("444444", "Gülsüm Sena Akdoğan", 0, 50000);
		
		
		System.out.println("İŞLEM YAPMAK İSTEDİĞİNİZ HESABI SEÇİNİZ: ");
		System.out.println("[1] VADELİ HESAP");
		vadeli1.hesapBilgiGöster();
		System.out.println();
		System.out.println("[2] VADESİZ HESAP");
		vadesiz1.hesapBilgiGöster();
		System.out.println();
		System.out.println("[3] VADESİZ HESAP");
		vadesiz2.hesapBilgiGöster();
		System.out.println();
		System.out.println("[4] KREDİ HESABI");
		kredi1.hesapBilgiGöster();
		System.out.println();
		int hesapSec=inp.nextInt();
		
		if(hesapSec==1) {
			System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: ");
			System.out.println("[1] HESAP BİLGİLERİNİ GÖSTER");
			System.out.println("[2] PARA ÇEK");
			System.out.println("[3] PARA YATIR");
			System.out.println("[4] FAİZ BİLGİLERİNİ GÖSTER");
			int secim=inp.nextInt();
				if(secim==1) {
					vadeli1.hesapBilgiGöster();
				}else if(secim==2) {
					vadeli1.paraCek();
				}else if(secim==3) {
					vadeli1.paraYatir();
				}else if(secim==4) {
					vadeli1.faizEkle();
				}else {
					System.out.println("HATALI TUŞLAMA");
				}
				
		}else if(hesapSec==2) {
			System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: ");
			System.out.println("[1] HESAP BİLGİLERİNİ GÖSTER");
			System.out.println("[2] PARA ÇEK");
			System.out.println("[3] PARA YATIR");
			int secim=inp.nextInt();
				if(secim==1) {
					vadesiz1.hesapBilgiGöster();
				}else if(secim==2) {
					vadesiz1.paraCek();
				}else if(secim==3) {
					vadesiz1.paraYatir();
				}else {
					System.out.println("HATALI TUŞLAMA");
				}
				
		}else if(hesapSec==3) {
			System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: ");
			System.out.println("[1] HESAP BİLGİLERİNİ GÖSTER");
			System.out.println("[2] PARA ÇEK");
			System.out.println("[3] PARA YATIR");
			int secim=inp.nextInt();
				if(secim==1) {
					vadesiz2.hesapBilgiGöster();
				}else if(secim==2) {
					vadesiz2.paraCek();
				}else if(secim==3) {
					vadesiz2.paraYatir();
				}else {
					System.out.println("HATALI TUŞLAMA");
				}
				
		}else if(hesapSec==4) {
			System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ: ");
			System.out.println("[1] KREDİ ÇEK");
			System.out.println("[2] KREDİ LİMİTİMİ GÖSTER");
			int secim=inp.nextInt();
				if(secim==1) {
					kredi1.krediKullan();
				}else if(secim==2) {
					System.out.print("Kredi Limitiniz: "+kredi1.getKrediLimiti()+ " TL");
					
				}
		}
		
		inp.close();
		
	}
}
