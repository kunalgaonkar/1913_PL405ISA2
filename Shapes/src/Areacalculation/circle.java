package Areacalculation;



public class circle implements calculateshape {
	
	private float radius;

	public float getRadius() {
		return radius;
	}

	public circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float Calculation() {
		float area = (float) (2 * 3.14 * this.radius);
		return area;
	}

	@Override
	public void Attribute(int i, int j) {
		this.radius = i;
	}
}