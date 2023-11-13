package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int code;
	private String name;
	private String description;
	private float price;
	private float iva;
	
	
	public Prodotto(String name, String description, float price, float iva) {
		this.code = generateCode();
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);
		
	}
	
	public int generateCode() {
		Random rand = new Random();
		int n = rand.nextInt(1000000);
		return n;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	
	@Override
	public String toString() {
		return "Code: " + code + "\nName: " + name 
				+ "\nDescription: " + description 
				+ "\nPrice: " + price 
				+ "\nIva: " + iva 
				+ "\n---------------------------------\n"; 
	}
	
	
	
}
