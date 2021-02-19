package com.cognixia.jump.threads;

import java.util.ArrayList;

public class ThreadDriver {

	
	public static void main(String[] args) {
		
		//Different Ways of Creating and Starting Threads
		
		// With class that extends Thread
		ThreadClass tc1 = new ThreadClass();
		tc1.start();
		
		// With RUnnable Interface
		RunableClass rc1 = new RunableClass();
		Thread t1 = new Thread(rc1, " runnable thread");
		t1.start();
		
		// create several threads and view the ordering
			//# loop iterations will determine how many threads we make
		ArrayList<Thread> threadList = new ArrayList<>();

		for(int i = 0; i <10; i++) {
			
			ThreadClass thread = new ThreadClass();
			threadList.add(thread);
			thread.start();
			
		}
	}
}
