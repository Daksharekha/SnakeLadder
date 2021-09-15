package daksha.learnig.snl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SnakeLadder {
	static int BOARDSIZE = 100;
	int pugPosition = 1;
	int numberOfMoves = 0;
	HashMap<Integer, Snake> snakeList = new HashMap<>();
	{
		snakeList.put(54, new NormalSnake(54, 43));
		snakeList.put(28, new GreenSnake(28, 15));
	}
	
	public void startGame() {
		pugPosition = 1;
	}
	
	public int updateStatus()
	{
		int diceValue = rollDice();
		++numberOfMoves;
		System.out.print(numberOfMoves + ". Dice : " + diceValue);
		if(diceValue+pugPosition <= 100)
			pugPosition = pugPosition+diceValue;
		System.out.println(" Pug : " + pugPosition);
		if(snakeList.containsKey(pugPosition)) {
			Snake snake = snakeList.get(pugPosition);
			pugPosition = snake.getPugPosition(pugPosition);
		}
		/*
		 * if(pugPosition==snakeHead) { pugPosition=snakeTail;
		 * System.out.println("OOPS Snake Bite! Pug : " + pugPosition); }
		 */
		return pugPosition;
	}
	
	
	public int rollDice() {
		Random rng = new Random();
		int num = rng.nextInt(7);
		if (num<=0)
			num=1;
		return num;
	}
	
	public int updateCrookedStatus()
	{
		int diceValue = rollCrookedDice();
		++numberOfMoves;
		System.out.print(numberOfMoves + ". Dice : " + diceValue);
		if(diceValue+pugPosition <= 100)
			pugPosition = pugPosition+diceValue;
		System.out.println(" Pug : " + pugPosition);
		if(snakeList.containsKey(pugPosition)) {
			Snake snake = snakeList.get(pugPosition);
			pugPosition = snake.getPugPosition(pugPosition);
		}
		return pugPosition;
	}
	
	public int rollCrookedDice() {
		List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
		return getRandomList(list);
	}
	
	public int getRandomList(List<Integer> list) {
        int index = ThreadLocalRandom.current().nextInt(list.size());		
        return list.get(index);
        
    }

	public boolean validateInputs(String[] input) {
		// TODO Auto-generated method stub
		boolean valid=true;
		try {
			Integer.parseInt(input[0]);
		} catch(Exception ex) {
			System.out.println("Invalid number of turns");
			valid=false;
		}
		if(input[1].length()!=1){
			System.out.println("Invalid dice selection");
			valid=false;
		}
		return valid;
	}

}