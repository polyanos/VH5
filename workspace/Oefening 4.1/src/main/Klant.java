package main;

public class Klant {
	public String naam;
	public int nummer;

	public Klant(String naam, int nummer) {
		this.naam = naam;
		this.nummer = nummer;
	}

	public String getNaam() {
		return naam;
	}

	public int getNummer() {
		return nummer;
	}
}
