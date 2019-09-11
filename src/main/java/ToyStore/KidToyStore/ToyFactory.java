package ToyStore.KidToyStore;

public class ToyFactory {
	public Toy getType(String shapeType, int id, String name, float price){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CARTOY")){
	         return new CarToy(id, name, price);
	         
	      } else if(shapeType.equalsIgnoreCase("SUBMARINETOY")){
	         return new SubmarineToy(id, name, price);
	         
	      } else if(shapeType.equalsIgnoreCase("PLANETOY")){
	         return new PlaneToy(id, name, price);
	      }
	      
	      return null;
	   }
}
