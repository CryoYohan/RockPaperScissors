package rockPaperScissors;

public class CountdownRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i = 3; i > 0; i--) {
			if(i==3)
				System.out.println("Rock...");
			if(i==2)
				System.out.println("Paper...");
			if(i == 1)
				System.out.println("Scissors...");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("SHOOT!");
		
	}

}
