package entities;

public class Product {
	public String name;
	public Double price;
	public int quantity;

	
	public Double TotalValueInStock() {
		return price * quantity;
		
	}
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name
			   + ", $ "
			   + price
			   + ", "
			   + quantity
			   +" units, Total: $ "
			   + TotalValueInStock();
	
	
	}			
}
