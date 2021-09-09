package daksha.learnig.snl;

import java.util.Random;

public class SnakeLadder {
	static int BOARDSIZE = 100;
	int snakeHead, snakeTail;
	int pugPosition = 1;
	int numberOfMoves = 0;
	
	public void startGame(int headPosition, int tailPosition) {
		pugPosition = 1;
		if(headPosition>tailPosition && headPosition<100 && tailPosition<100 && 
				headPosition>1 && tailPosition>1) {
			snakeHead = headPosition;
			snakeTail = tailPosition;
			System.out.println("Snake is set at (" + snakeHead+ "," +snakeTail+ ")!");
		}else {
			System.out.println("Snake not set!");
		}
	}
	
	public int updateStatus()
	{
		int diceValue = rollDice();
		++numberOfMoves;
		System.out.print(numberOfMoves + ". Dice : " + diceValue);
		if(diceValue+pugPosition <= 100)
			pugPosition = pugPosition+diceValue;
		System.out.println(" Pug : " + pugPosition);
		if(pugPosition==snakeHead) {
			pugPosition=snakeTail;
			System.out.println("OOPS Snake Bite! Pug : " + pugPosition);
		}
		return pugPosition;
	}
	
	
	public int rollDice() {
		Random rng = new Random();
		int num = rng.nextInt(7);
		if (num<=0)
			num=1;
		return num;
	}

}