package ToyStore.KidToyStore;

public class Toy {
	private String name;
	private float price;
	private String brand;
	public Toy(String name, float price, String brand) {
		this.name = name;
		this.price = price;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
