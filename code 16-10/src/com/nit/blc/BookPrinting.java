package com.nit.blc;

public class BookPrinting {
	private String title;
	private String author;
	private double price;
	public BookPrinting(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		if(price<0) {
			System.err.println("Book Price cannot be negative.");
			System.exit(0);
		}else {
		this.price = price;
	    
		}
		}
	
	public void Disount(double discount) {
		if(discount<0 || discount >price) {
			System.out.println("Invalid Discount");
		}else {
			System.out.println("discount is"+(price-(price*0.10)));
		}
	}

	@Override
	public String toString() {
		return "BookPrinting [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}


