package Areacalculation;

public class rectangle implements calculateshape{
	
	private float length;
	private float breadth;

	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	
	@Override
	public float Calculation() {
		float area = this.breadth * this.length;
		return area;
	}

	@Override
	public void Attribute(int i, int j) {
		this.breadth = j;
		this.length = i;
		
	}

}
