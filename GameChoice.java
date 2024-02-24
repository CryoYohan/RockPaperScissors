package rockPaperScissors;

public enum GameChoice {
	SCISSORS(2), PAPER(1), ROCK(0);
	
	public final int value;
	private GameChoice(int value) {
		this.value = value;
	}
}
