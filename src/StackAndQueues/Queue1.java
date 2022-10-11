package StackAndQueues;

import java.util.LinkedList;

public class Queue1 {
	
	LinkedList<Integer> newlist = new LinkedList<Integer>();

	 public void Queues(Integer Data) {
		 newlist.addLast(Data);
	 }
	 
	 public void deQueue() {
		 newlist.remove();
	 }
   
	 public void PrintQueue() {   
		 System.out.println(newlist);
	 }
}
