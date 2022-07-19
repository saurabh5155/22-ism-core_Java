package task16;

public class OneToHundredPrintUseingThead extends Thread{
	static int sum=0;
	public void  run(){
	
		for(int i=1;i<=50;i++)
		{
			sum+=i;
			System.out.println(i);
				
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		OneToHundredPrintUseingThead t = new  OneToHundredPrintUseingThead();
		t.start();
		Thread.sleep(10);
		System.out.println("sum = "+sum);

	}
}
