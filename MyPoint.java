package edu.smg;

public class MyPoint {
	private double x = 0;
	private double y = 0;
	
	public MyPoint() {
		
	}
	
	public MyPoint(double x, double y) {
		setX(x);
		setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(MyPoint n) {
		return this.distance(n.getX(), n.getY());
	}
	public double distance(double x, double y) {
		return Math.sqrt((getX() - x) * (getX() - x) + (getY()-y) * (getY() - y));
	}
	public static double distance(MyPoint n, MyPoint m) {
		return n.distance(m.x, m.y);
	}
	
}
