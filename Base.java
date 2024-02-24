package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;


public class Base {
	private CountdownRunnable runnable = new CountdownRunnable();
	public Thread thread1 = new Thread(runnable);
	public MyCountDownThread3 thread2 = new MyCountDownThread3();
	public Scanner sc = new Scanner(System.in);
	// Savior, thanks to kuya James; int variables for scores has been switched to static
	private static int score_AI = 0, score_PLAYER = 0;
	private Random random = new Random();
	private int value;
	private String choice, aiChoice, newChoice;
	protected String[] rPS = {"rock", "paper", "scissors"};
	// SETTERS AND GETTERS FOR CORRECTION
	public void setNewChoice(String newChoice) {
		this.newChoice = newChoice;
	}
	public String getNewChoice() {
		return newChoice;
	}
	
	// PLAYER SETTERS AND GETTERS
	public void setPlayerChoice(String choice) {
		this.choice = choice;
	}
	
	public String getPlayerChoice() {
		return choice;
	}
	
	// AI SETTERS AND GETTERS
	
	public void setAIChoice(String aiChoice) {
		this.aiChoice = aiChoice;
	}
	
	public String getAIChoice() {
		return aiChoice;
	}
	
	// AI Random choice between Rock, Paper and Scissors
	public String randomAI() {
		value = (int)(random.nextInt(rPS.length));
		return rPS[value];
	}
	
	// Calculate the scores of both AI and Player. This also determines whether the choices of opposing teams wins or not.
	
	public void calculateScores(String playerChoice, String aiChoice) {
		// ***Player to AI***
		
		// Rock and Scissors
		if(playerChoice.equalsIgnoreCase(rPS[GameChoice.ROCK.value]) && aiChoice.equalsIgnoreCase(rPS[GameChoice.SCISSORS.value])) {
			System.out.println("1: Player Score!");
			score_PLAYER++;
		}
				
		// Paper and Rock
		if(playerChoice.equalsIgnoreCase(rPS[GameChoice.PAPER.value]) && aiChoice.equalsIgnoreCase(rPS[GameChoice.ROCK.value])) {
			System.out.println("2: Player Score!");
			score_PLAYER++;
		}
		
		
		// Scissors and Paper
		if(playerChoice.equalsIgnoreCase(rPS[GameChoice.SCISSORS.value]) && aiChoice.equalsIgnoreCase(rPS[GameChoice.PAPER.value])) {
			System.out.println("3: Player Score!");
			score_PLAYER++;
		}
		
		// ***AI to Player***
		
		// Rock and Scissors
		if(aiChoice.equalsIgnoreCase(rPS[GameChoice.ROCK.value]) && playerChoice.equalsIgnoreCase(rPS[GameChoice.SCISSORS.value])) {
			System.out.println("1: AI Score!");
			score_AI++;
		}
		
		// Paper and Rock
		if(aiChoice.equalsIgnoreCase(rPS[GameChoice.PAPER.value]) && playerChoice.equalsIgnoreCase(rPS[GameChoice.ROCK.value])) {
			System.out.println("2: AI Score!");
			score_AI++;
		}
		
		// Scissors and Paper
		if(aiChoice.equalsIgnoreCase(rPS[GameChoice.SCISSORS.value]) && playerChoice.equalsIgnoreCase(rPS[GameChoice.PAPER.value])) {
			System.out.println("3: AI Score!");
			score_AI++;
		}
		
		if(aiChoice.equalsIgnoreCase(playerChoice)) {
			System.out.println("Draw!");
		}
		// Display Choices
		
		result(getPlayerChoice(), getAIChoice());
		
		// Display Scores
		
		if(score_PLAYER <= 5 || score_AI <= 5) {
			System.out.println("Player: " + score_PLAYER + "\nAI: " + score_AI);
			Child c = new Child();
			// This let us go back to the rock paper scissors count down
			c.shoot();
		}
		else {
			System.out.println("FINAL RESULTS!");
			if(score_PLAYER > score_AI)
				System.out.println("Player Wins!");
			
			else
				System.out.println("AI Wins!");
		}
				
	}
	
	// This displays the scores of the player and ai, it'll display the final results once the maximum score is reached
	
	public void displayScores() {
		if(score_PLAYER <= 10 || score_AI <= 10) {
			System.out.println("Player: " + score_PLAYER + "\nAI: " + score_AI);
			Child c = new Child();
			// This let us go back to the rock paper scissors count down
			c.shoot();
		}
		else {
			System.out.println("FINAL RESULTS!");
			if(score_PLAYER > score_AI)
				System.out.println("Player Wins!");
			
			else
				System.out.println("AI Wins!");
		}
	}
	
	// 
	public void result(String playerChoice, String aiChoice) {
		System.out.println("Player: " + playerChoice);
		System.out.println("AI: " + aiChoice);						
	}
}