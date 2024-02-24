package rockPaperScissors;

public class Child extends Base{
	
	public void startGame() {
		System.out.println("ROCK PAPER SCISSORS SHOOT!\nIT'S YOU AGAINST AN AI IN A GAME OF ROCK PAPER SCISSORS!");
		shoot();
		//thread2.start();
	}
	
	public void shoot() {
		// Start CountDown
		CorrectionClass correction = new CorrectionClass();
		thread1.start();
		setPlayerChoice(sc.nextLine());
//		for(String s: rPS) {
//			if(getPlayerChoice().equalsIgnoreCase(s))
//				break;
//			else
//				correction.checkTypo(getPlayerChoice());
//		}
		if(getPlayerChoice().equalsIgnoreCase("stop")) {
			System.out.println("Game stopped! Loser.");
			System.exit(0);
		}			
		setAIChoice(randomAI());
		calculateScores(getPlayerChoice(), getAIChoice());
	//	displayScores();
		
	}
	
}
