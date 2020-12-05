package edu.smg;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint n = new MyPoint();
		MyPoint m = new MyPoint(10, 30.5);
		System.out.println(MyPoint.distance(n, m));
		System.out.println(m.distance(5.7, 90));
		System.out.println(n.distance(m));
	}

}
