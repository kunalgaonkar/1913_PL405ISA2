package Areacalculation;

public class ShapeFactory {
	
   public calculateshape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new rectangle();
         
      } else if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new circle();
         
      } else if(shapeType.equalsIgnoreCase("TRIANGLE")){
	         return new triangle();
	  }
	      
	  return null;
	  }
}