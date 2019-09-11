package ToyStore.KidToyStore;

public class TruckSingleton {
	private static TruckSingleton instance;
	private int count;
	private float weight;
	
	private TruckSingleton() {
		
	}

	public static TruckSingleton getInstance() {
		if (instance == null) {
			instance = new TruckSingleton();
		}
		return instance;
	}
	public void delivery() {
		
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
