package Shopping;

public class ShoppingDto {

	private int price;
	private int count;
	private String product;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public ShoppingDto(String product, int price, int count ) {
		this.price = price;
		this.count = count;
		this.product = product;
	}
	public ShoppingDto() {

	}
	@Override
	public String toString() {
		return "ShoppingDto [price=" + price + ", count=" + count + ", product=" + product + "]";
	}
	
	
}
