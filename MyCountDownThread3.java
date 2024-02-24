package rockPaperScissors;

public class MyCountDownThread3 extends Thread {

	@Override
	public void run() {
		
		for(int i=5; i > 0; i--) {
			System.out.println("Results in... " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	}
}
