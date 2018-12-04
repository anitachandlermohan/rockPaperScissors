package rockpaperscissors;

import java.util.Random;

public class RockPaperScissors {

	public static void main (String[]args)
	{ 
		Random rand = new Random();
		Paper paper = new Paper();
		Scissor scissors = new Scissor();
		Rock rock = new Rock();
		
		GameRules newGame = new GameRules();
		PlayerMove arrayForGame[] = {rock, paper, scissors}; 
		int index = rand.nextInt(arrayForGame.length);
		PlayerMove computerChoice = arrayForGame[index]; 
		System.out.println(computerChoice);
		System.out.println(newGame.showResult(rock, computerChoice));
	}
 	
	
}

