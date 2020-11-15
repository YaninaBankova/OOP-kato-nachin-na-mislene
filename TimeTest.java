package edu.smg;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		System.out.println("Hour: " + t1.getHour() + ",minute: " + t1.getMinute() + 
				", second: " + t1.getSecond());
		Time t2 = new Time(555550000);
		System.out.println("Hour: " + t2.getHour() + ",minute: " + t2.getMinute() + 
				", second: " + t2.getSecond());
		Time t3 = new Time(5, 23, 55);
		System.out.println("Hour: " + t3.getHour() + ",minute: " + t3.getMinute() + 
				", second: " + t3.getSecond());
	}

}
