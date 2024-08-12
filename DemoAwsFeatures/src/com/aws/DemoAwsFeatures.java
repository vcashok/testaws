package com.aws;

public class DemoAwsFeatures {
	public static void main (String args[]) {
		DemoClases dc = new DemoClases();
		dc.callThisMethod();
		System.out.println("Hello World!!!");
		sayBye();
	}
	
	public static void sayBye() {
		System.out.println("Bye Hello World...");
	}

}
