package com.cognixia.jump.threads;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		
		for(int i =0; i< 3; i++)
		System.out.println(super.getName() + " is running.");
	}
}
