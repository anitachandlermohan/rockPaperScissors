package rockpaperscissors ;

import java.util.Comparator;

public class GameRules implements Comparator<PlayerMove> {
	
	@Override
	public int compare(PlayerMove move1, PlayerMove move2) {
		{
			if	 
				(move1 instanceof Rock && move2 instanceof Scissor) {
				return 1;
			} 
			else if 
				(move1 instanceof Rock && move2 instanceof Paper) {
				return -1;
			}
			else if 
				(move1 instanceof Rock && move2 instanceof Rock) {
				return 0;
			}
			else if  
				(move1 instanceof Paper && move2 instanceof Scissor) {
				return -1;
			}
			else if 
				(move1 instanceof Paper && move2 instanceof Paper) {
				return 0;
			}
			else if 
				(move1 instanceof Paper && move2 instanceof Rock) {
				return 1;
			}
			else if 
				(move1 instanceof Scissor && move2 instanceof Scissor) {
				return 0;
			}
			else if 
				(move1 instanceof Scissor && move2 instanceof Paper) {
				return 1;
			}
			else if(move1 instanceof Scissor && move2 instanceof Rock) {
				return -1;
			}
			else 
			{ 
				return 13; 
			}
		
		}
	
	}
	
	public String showResult(PlayerMove move1, PlayerMove move2) {
		int result = compare(move1,move2);
		if (result == 1) {
			return "Win";
		}
		else if (result == 0) {
			return "Draw";
		}
		
		else if(result == -1) {
			return "Lose";
		}
		else 
			return "Error";
	}
	
	


}
