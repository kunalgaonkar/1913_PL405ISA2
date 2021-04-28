package Areacalculation;

public class triangle implements calculateshape{
	
	private float base;
	private float height;

	public float getBase() {
		return base;
	}

	public float getHeight() {
		return height;
	}

	public triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float Calculation() {
		float area = (float) (0.5 * this.base * this.height);
		return area;
	}

	@Override
	public void Attribute(int i, int j) {
		this.base = i;
		this.height = j;
	}

}
