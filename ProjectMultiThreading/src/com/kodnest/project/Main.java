package com.kodnest.project;

public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()+"main()");
		Task1 t1=new Task1();//thread object creation
		Task2 t2=new Task2();//thread object creation
		
		t1.setName("First-Thread");
		t2.setName("Second-Thread");
		
		t1.setPriority(7);
		t2.setPriority(4);
		
		t1.start();
		t2.start();
	}

}
