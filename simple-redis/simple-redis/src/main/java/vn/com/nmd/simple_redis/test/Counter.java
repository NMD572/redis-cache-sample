package vn.com.nmd.simple_redis.test;

public class Counter {
	long count = 0;

	public synchronized void add(long value) throws InterruptedException {
		this.count += value;
		System.out.println(this.count);
		Thread.sleep(1000);
	}
}
