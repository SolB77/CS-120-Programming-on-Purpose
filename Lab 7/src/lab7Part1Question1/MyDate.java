package lab7Part1Question1;

public class MyDate {

	private int year;
	private int month;
	private int day;
	
	public MyDate(int dayHired, int yearHired, int monthHired) {
		day = dayHired;
		month = monthHired;
		year = yearHired;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	

}
