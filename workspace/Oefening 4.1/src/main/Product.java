package main;

public class Product {
	public String omschrijving;
	public double prijs;

	public Product(String omschrijving, double prijs) {
		this.omschrijving = omschrijving;
		this.prijs = prijs;
	}

	public double getPrijs() {
		return prijs;
	}

	public String toString() {
		return omschrijving;
	}
}
