package ToyStore.KidToyStore;

public class PlaneToy implements Toy{

	private int id;
	private String name;
	private float price;
	private String type;
	
	public PlaneToy(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = "PlaneToy";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}
