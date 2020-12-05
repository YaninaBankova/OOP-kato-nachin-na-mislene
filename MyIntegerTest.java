package edu.smg;

public class MyIntegerTest {

	public static void main(String[] args) {
		
		MyInteger x = new MyInteger(34);
		MyInteger y = new MyInteger(12);
		System.out.println(x.getValue());
		System.out.println(x.isEven());
		System.out.println(MyInteger.isOdd(67));
		System.out.println(x.isPrime());
		System.out.println(y.equals(x));
		char[] a = {'1', '5'};
		System.out.println(MyInteger.parseInt(a));
		
		
	}

}
