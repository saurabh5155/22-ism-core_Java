package task17;

public class TwoTheadExecution extends Thread{
	int a;
	int b;
	static long sum;

	public TwoTheadExecution(int a, int b) {
		this.a = a;
		this.b = b;
		this.sum = 0;
	}

	public void run() {
		for(int i=a;i<=b;i++) {
			sum = sum + i;
			System.out.println(i);
		}
		
	}

	public static long getsum() {
		return sum;
	}

	public static void main(String[] args) throws InterruptedException {
		TwoTheadExecution a = new TwoTheadExecution(1, 50);
		TwoTheadExecution b = new TwoTheadExecution(51, 99);
		
		a.start();
		b.start();

		synchronized (currentThread()) {

			currentThread().wait(10);
			currentThread().notify();
			
		}

		System.out.println(getsum());

	}
}
