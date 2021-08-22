package com.xworkx.java.inheritance;
public class SingleInH {

	public static void main (String [] args) {
		
		Watch watch= new Watch();
		watch.Time();
		watch.Date();
		
		SmartWatch Smart =new SmartWatch();
		Smart.Fitness();
		Smart.SetAlarm();
		Smart.Messages();
	}
}
