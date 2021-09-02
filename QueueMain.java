package com.bridgelabzd17;

public class QueueMain {
	/**
	 *  This is the main method which makes use of enqueue method to add the elements to queue
	 *  Show method to display the data
	 */
	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		
		queue.show();
	}

}