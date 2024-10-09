package com.kodnest.project;

public class Task2 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread()+"method2()");
		for(int i='A';i<='Z';i++) {
			System.out.println((char)i);
		}
	}

}
