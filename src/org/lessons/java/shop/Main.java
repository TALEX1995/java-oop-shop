package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
//		Instance
		Prodotto product1 = new Prodotto("Scarpe", "Bellissime scarpe nere e rosse", 70, 21);
		
		System.out.println(product1);
		
		
//		SETTERS
		product1.setName("Giubbotto");
		
		product1.setDescription("Nuova descrizione");
		
		product1.setPrice(80);
		
		product1.setIva(25);
		
//		GETTERS
		System.out.println("Prezzo Pieno: " + product1.fullPrice());
		
		System.out.println("Full Name: " + product1.fullName());
		
		System.out.println("Codice formattato: " + product1.fullCode());
		
		
		System.out.println("Codice: " + product1.getCode());
		
		System.out.println("Nome: " + product1.getName());
		
		System.out.println("Descrizione: " + product1.getDescription());
		
		System.out.println("Prezzo: " + product1.getPrice());
		
		System.out.println("Iva: " + product1.getIva());
	}

}
