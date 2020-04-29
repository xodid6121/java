package day9;

public class Circle extends Shape {
	public static int Circlecount;
	private double centerX, centerY;
	public void print() {
		System.out.println("=============원의 정보===============");
		System.out.printf("중심점 : (%.1f,%.1f)\n",centerX,centerY);
		System.out.printf("반지름 : %.2f\n",getradius());
		System.out.println("===================================");
		
	}
	public Circle() {}
	public Circle(int left, int up, double radius) {
			super(left, up, radius*2, radius*2);
			centerX = left + radius;
			centerY = up - radius;
			Circlecount++;
			//setLeft(left);
			//setUp(up);
			//setWidth(radius*2);
			//setHeight(radius*2);
	}
	public void move(int left, int up) {
		super.move(left,up);
		centerX = left + getradius()/2;
		centerY = up - getHeight()/2;
	}
	public void resize(double radius) {
		resize(2*radius,2*radius);
		centerX = getLeft() + getradius();
		centerY = getUp() - getradius();
	}
	public double getradius() {
		return getWidth()/2;
	
	}
	public static void printCount() {
		System.out.println("현재까지 만들어진 원의 갯수 : " + Circlecount);  
	}
}
