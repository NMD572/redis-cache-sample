package vn.com.nmd.simple_redis.test;

public class Test {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Counter counter2 = new Counter();
		Thread threadA = new CounterThread(counter);
		Thread threadB = new CounterThread(counter2);

		threadA.start();
		threadB.start();
	}

}
