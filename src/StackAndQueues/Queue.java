package StackAndQueues;

import java.util.LinkedList;

public class Queue {
	LinkedList<Integer> newlist = new LinkedList<Integer>();

    public void Queues(Integer Data) {
        newlist.addLast(Data);
    }

    public void PrintQueue() {
        System.out.println(newlist);
    }
}
