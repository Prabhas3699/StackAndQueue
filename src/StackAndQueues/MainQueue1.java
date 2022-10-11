package StackAndQueues;

public class MainQueue1 {

	public static void main(String[] args) {
		
			
	    Queue1 myQueue = new Queue1();

        myQueue.Queues(56);
        myQueue.Queues(30);
        myQueue.Queues(70);

        myQueue.PrintQueue();

        myQueue.deQueue();
        myQueue.PrintQueue();

	}

}
