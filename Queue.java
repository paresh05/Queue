package com.bridgelabzd17;

public class Queue<K> {
	
	LinkedList<K> list = new LinkedList<>();

	/**
	 * This method is used to push the data using the insertAtStart method of the linked list
	 * 
	 * @param data This is the value of the data
	 */
	
	public void enqueue(K data)
	{
		list.insert(data);
	}
	

	/**
	 * This method is used to remove the element from the queue
	 */
	public void dequeue()
	{
		list.popAllElements();
	}
	
	
	/**
	 * This method is used to display the data using the show method of linked ist
	 */
	public void show()
	{
		list.show();
	}
}
