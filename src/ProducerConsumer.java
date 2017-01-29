package myJavaLearning;

class Q {
	int n;
	boolean valueSet = false;
	
	synchronized int get() {
		if (!valueSet)
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Got :" +n);
		valueSet = false;
		notify();
		return n;
	}


	synchronized void put(int n) {
		if (valueSet)
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put :" +n);
		notify();
	}
}


class Producer implements Runnable {

	Q q;
	
	Producer(Q q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int i = 0;
		while (true) {
			q.put(i++);
		}
	}
	
	
}

class Consumer implements Runnable {
	
	Q q;

	Consumer (Q q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			q.get();
		}
	}
	
	
}


public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
	}

}