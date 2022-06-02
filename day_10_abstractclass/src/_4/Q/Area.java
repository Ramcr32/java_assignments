package _4.Q;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return (length*breadth)/2;
	}

	@Override
	public int squareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int circleArea(int radius) {
		return (int) Math.PI*(radius)*(radius);
	}

}
