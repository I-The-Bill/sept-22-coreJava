package com.cognixia.jump.threads;

public class SyncThreadRunner
{
	public static void main (String[] args)
	{
		int size = 3;
		Thread[] Threads = new Thread[size];
		
		for (int i =0; i < Threads.length; i++)
		{
			Threads[i] = new SyncThread();
			Threads[i].start();
		}
	}
}
