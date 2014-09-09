package main;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.NumberFormatter;

public class Bestelling {
	private final static int BTW = 6;
	private Klant klant;
	private List<Product> Assortiment;

	public void Bestelling() {

		// TODO Auto-generated method stub
		klant = new Klant("Henk", 18);
		Assortiment = new ArrayList<>();
		Assortiment.add(new Product("500g gehakt", 2.85));
		Assortiment.add(new Product("Krat bier", 12.89));
		Assortiment.add(new Product("Pak melk", 1.29));
		Assortiment.add(new Product("Pindekaas", 0.88));
	}

	public void print() {
		System.out.println("Klantnaam: " + klant.naam);
		System.out.println("Klantnummer: " + klant.nummer);
		System.out.println();
		System.out.println("Orderinformatie:");
		System.out.println();
		double totaal = 0;
		for (Product product : Assortiment){
			
		System.out.println("Productnaam: " + product.toString());
		System.out.println("Prijs: �" + product.getPrijs());
		System.out.println();
		totaal = totaal + product.getPrijs();
		
		}
		System.out.println("Totaalbedrag: �" + totaal);
		DecimalFormat df=new DecimalFormat("0.00");
		String excel = df.format(totaal/(100+BTW)*100);
		System.out.println("Excl BTW: �" +excel);
		System.out.println();
		System.out.println("Bedankt voor uw bestelling, tot de volgende keer!");
	}
}
