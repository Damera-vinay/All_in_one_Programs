package com.nit.blc;

public class Shop {
	private String itemName;
	private double pricePerUnit;
	private int quantityInStock;
	public Shop(String itemName, double pricePerUnit, int quantityInStock) {
		super();
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantityInStock = quantityInStock;
	}
	
	public double calculateTotalValue() {
		return pricePerUnit*quantityInStock;		
	}
//	public double calculateTotalValue1() {
//		return pricePerUnit*quantityInStock;		
//	}
	

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	
	
	
	@Override
	public String toString() {
		return "Shop [itemName=" + itemName + ", pricePerUnit=" + pricePerUnit + ", quantityInStock=" + quantityInStock
				+ "]";
}
	
	

}
