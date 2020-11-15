package edu.smg;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		setTime(System.currentTimeMillis ());
	}
	
	public Time(long milliseconds){
		setTime(milliseconds);
	}
	
	Time( int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(long elapsedTime) {
		setHour((int)(elapsedTime / (1000 * 60 * 60)) % 24);
		setMinute((int)(elapsedTime / (1000 * 60)) % 60);
		setSecond((int)(elapsedTime / 1000) % 60);
	}
}
