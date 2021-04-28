package Areacalculation;

public class MainApp {

	public static void main(String[] args) {
	
		
		ShapeFactory shapeFactory = new ShapeFactory();
		calculateshape rectangle = shapeFactory.getShape("RECTANGLE");
		rectangle.Attribute(5,5);
		System.out.println("Rectangle:"+rectangle.Calculation());
		
		calculateshape circle = shapeFactory.getShape("CIRCLE");
		circle.Attribute(4, 0);
		System.out.println("Circle:"+circle.Calculation());
		
		calculateshape triangle = shapeFactory.getShape("TRIANGLE");
		triangle.Attribute(2, 10);
		System.out.println("Triangle:"+triangle.Calculation());

	}

}
