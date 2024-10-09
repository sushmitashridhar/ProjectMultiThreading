package com.kodnest.project;

public class Task1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread()+"method1()");
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}

}
