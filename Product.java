package com.cts;

public class Product {
	private int prodid;
	private String prodname;
	private int price;
	private int quantity;
	
	public Product(int prodid, String prodname, int price, int quantity) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
		this.price = price;
		this.quantity = quantity;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
